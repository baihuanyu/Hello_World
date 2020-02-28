package day14excepion.homework;
/**
 * 设计一个异常类，密码安全提示异常类
 * 在测试类中，模拟密码提示场景：
 * 密码必须有6~18位 大小写英文和数字以及下划线组成
 * 当用户的密码强度不满足要求，抛出异常提示
 *
 *
 * */
public class IllgerException extends Exception {
    /**
     * 生成识别码
     * */
    private static final long serialVersionUID = -8274572022401155350L;

    public IllgerException() {
        super();
    }

    public IllgerException(String message) {
        super(message);
    }
}
