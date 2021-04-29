/*
 * Huawei Software Technologies Co., Ltd. Copyright 1998-2020, All rights reserved.
 * 文件名  :SnowFlakeUtils.java
 * 创建人  :l00249201
 * 创建时间:2020年3月14日
*/


import org.apache.commons.lang.math.RandomUtils;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 *
 * @author l00249201
 * @version 1.0, 2020年3月14日
 * @since APM V100R001C10B01
 */
public class SnowFlakeUtils {
    private static SnowFlake snowFlake;

    static {
        // 数据中心标识取当前系统时间后n位
        long currentTime = System.currentTimeMillis();
        long datacenterId = currentTime & SnowFlake.MAX_DATACENTER_NUM;
        if (datacenterId > SnowFlake.MAX_DATACENTER_NUM || datacenterId < 0) {
            datacenterId = 0;
        }

        // 机器标识使用随机数
        long machineId = RandomUtils.nextInt((int) SnowFlake.MAX_MACHINE_NUM);

        snowFlake = new SnowFlake(datacenterId, machineId);
    }

    public static long genId() {
        return snowFlake.nextId();
    }
}
