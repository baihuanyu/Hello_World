package com.demo.designPattern.builder;

/**
 * @author baihuanyu bwx966955
 * @date 2021/2/19 15:23
 *  具体建造类
 */
public class HighHouse extends HouseBuilder{
    @Override
    void buildBasic() {
        house.setName("高楼大厦");
        System.out.println("高楼大厦地基");
    }

    @Override
    void buildWall() {
        house.setWall("50cm墙体");
        System.out.println("高楼大厦砌墙");
    }
}
