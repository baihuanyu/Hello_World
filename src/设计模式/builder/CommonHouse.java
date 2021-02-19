package com.demo.designPattern.builder;

/**
 * @author baihuanyu bwx966955
 * @date 2021/2/19 15:23
 *  具体建造类
 */
public class CommonHouse  extends HouseBuilder{
    @Override
    void buildBasic() {
        house.setName("普通房子");
        System.out.println("建造普通房子地基");
    }

    @Override
    void buildWall() {
        house.setWall("20cm厚度的墙");
        System.out.println("建造普通房子墙");
    }
}
