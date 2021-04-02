/*
 * Huawei Software Technologies Co., Ltd. Copyright 1998-2018, All rights reserved.
 * 文件名  :SimpleReqLogAop.java
 * 创建人  :l00249201
 * 创建时间:2018年5月30日
*/

package com.hisilicon.ias.basic.requestlog;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.hisilicon.cad.error.model.ErrorEntity;
import com.hisilicon.cad.error.utils.CadExceptionUtils;
import com.hisilicon.icanal.autoconfigure.content.DepartSystemContent;
import com.hisilicon.logcenter.RequestLogUtils;
import com.hisilicon.logcenter.SimpleReqLogConent;
import com.hisilicon.logcenter.mapper.ISimpleReqLogMapper;
import com.hisilicon.logcenter.service.ISimpleReqLogService;

@Aspect
@Component
public class SimpleReqLogAop {
    @Autowired
    private ISimpleReqLogService simpleReqLogService;

    @Autowired
    private ISimpleReqLogMapper simpleReqLogMapper;

    /**
     * [简要描述]:定义切面规则<br/>
     * [详细描述]:<br/>
     * 
     * @author l00249201
     */
    @Pointcut(value = "execution(public * com.hisilicon.ias.controller..*.*(..)) ")
    public void simpleReqLog() {

    }

    /**
     * [简要描述]:执行方法前获取开始时间、请求参数等日志信息<br/>
     * [详细描述]:<br/>
     * 
     * @author l00249201
     * @param joinPoint
     */
    @Before("simpleReqLog()")
    public void doBefore(JoinPoint joinPoint) {
        SimpleReqLogConent.clear();
        IasSimpleReqLog simpleReqLog = new IasSimpleReqLog();

        // 在执行方法前只记录处理开始时间
        Date startTime = new Date();
        simpleReqLog.setStartTime(startTime);

        SimpleReqLogConent.setSimpleReqLog(simpleReqLog);
    }

    /**
     * [简要描述]:执行方法后获取结束时间、响应对象等日志信息<br/>
     * [详细描述]:<br/>
     * 
     * @author l00249201
     * @param ret
     */
    @AfterReturning(returning = "ret", pointcut = "simpleReqLog()")
    public void doAfterReturning(JoinPoint joinPoint, Object ret) {
        IasSimpleReqLog simpleReqLog = (IasSimpleReqLog) SimpleReqLogConent.getSimpleReqLog();

        // 记录结束时间和处理时长
        Date endTime = new Date();
        simpleReqLog.setEndTime(endTime);
        int duration = (int) (endTime.getTime() - simpleReqLog.getStartTime().getTime());
        simpleReqLog.setDuration(duration);

        // 由于存在ThreadLocal，有线程安全问题，所以先将涉及线程安全的HttpServletRequest、SimpleReqLog等处理完后再开启新线程保存日志
        // 从ThreadLocal中获取应用和项目等信息
        String appCode = DepartSystemContent.getAppCode();
        simpleReqLog.setAppCode(appCode);
        String departCode = DepartSystemContent.getDepartCode();
        simpleReqLog.setDepartCode(departCode);
        String projectSelfCode = DepartSystemContent.getProjectSelfCode();
        simpleReqLog.setProjectSelfCode(projectSelfCode);
        simpleReqLog.setUserNameNum(DepartSystemContent.getUserAlphabet());

        // request信息
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 设置基本请求信息
        RequestLogUtils.setBasicRequestInfo(request, simpleReqLog);

        // 深度克隆对象（为了保存时的线程安全）
        IasSimpleReqLog cloneSimpleReqLog = (IasSimpleReqLog) simpleReqLog.deepClone();

        // 异步记录日志信息
        simpleReqLogService.saveSimpleReqLog(cloneSimpleReqLog, joinPoint, RequestLogUtils.isJsonRequest(request), ret,
                simpleReqLogMapper);
    }

    /**
     * [简要描述]:如果出现异常，将异常转换为响应数据记录日志<br/>
     * [详细描述]:<br/>
     * 
     * @author l00249201
     * @param joinPoint
     * @param ex
     */
    @AfterThrowing(throwing = "ex", pointcut = "simpleReqLog()")
    public void doAfterThrowing(JoinPoint joinPoint, Exception ex) {
        ErrorEntity ret = CadExceptionUtils.exception2Entity(ex);
        this.doAfterReturning(joinPoint, ret);
    }

}
