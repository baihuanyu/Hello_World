package com.demo.designPattern.builder;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author baihuanyu bwx966955
 * @date 2021/2/19 15:26
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse house = new CommonHouse();
        HighHouse highHouse = new HighHouse();
        //  House house1 = house.getHouse();
        HouseDirect direct = new HouseDirect(house);

        House build = direct.doBuild();
        System.out.println(ToStringBuilder.reflectionToString(build));

        direct.setHouseBuilder(highHouse);

        House build1 = direct.doBuild();
        System.out.println(ToStringBuilder.reflectionToString(build1));
    }
}
