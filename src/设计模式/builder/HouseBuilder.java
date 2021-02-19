package com.demo.designPattern.builder;

/**
 * @author baihuanyu bwx966955
 * @date 2021/2/19 15:20
 *  建造者抽象类
 */
public abstract class HouseBuilder {
    // 产品
    protected House house = new House();

    abstract void buildBasic();
    abstract void buildWall();
    // 返回结果
    public House getHouse(){
      return house;
    };
}
