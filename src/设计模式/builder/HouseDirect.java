package com.demo.designPattern.builder;

/**
 * @author baihuanyu bwx966955
 * @date 2021/2/19 15:24
 *  指挥 构造器注入  和 setter注入
 *
 */
public class HouseDirect {
    private HouseBuilder houseBuilder;

    public HouseDirect(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House doBuild(){
        houseBuilder.buildWall();
        houseBuilder.buildBasic();
        return houseBuilder.getHouse();
    }
}
