package day09extendsandequals.homework;

import com.sun.istack.internal.NotNull;
import day09extendsandequals.homework.Car;

/**
 * 人类
 * */
public class People {

    //Car car 提前引用， 值为null。
    Car car ;

    /**开车*/
    public void drive(Car car){
        car.run();

    }

    public static void main(String[] args) {
        People p = new People();
        // 需要一个不为空的汽车类 可以给其子类实例！！！作为参数传入
        p.drive(new Truck());

    }
}
