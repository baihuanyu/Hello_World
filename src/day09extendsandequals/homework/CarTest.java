package day09extendsandequals.homework;

import day09extendsandequals.homework.People;

public class CarTest {

    public static void main(String[] args) {
       //创建运输车实例
        Car car = new Truck();
        //创建牛车实例
        Car car1 = new BullCar();
        //创建军车实例
        Car car2 = new Army_Vehicle();
        car.run();
        car1.run();
        car2.run();// 保留super之后会保留父类的run方法

    }
}
