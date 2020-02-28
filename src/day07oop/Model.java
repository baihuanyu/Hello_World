package day07oop;
/**
 * model类
 * 用于定义三个model的基本属性
 * 和他们特有的方法
 *
 * */

public class Model {
    /**姓名	成员变量 是类的属性，静止的部分*/
    String name ;
    /**性别	成员变量 是类的属性，静止的部分*/
    String sex ;
    /** 年龄	成员变量 是类的属性，静止的部分*/
    int age ;
    /** 身高	成员变量 是类的属性，静止的部分*/
    String height;
    /** 三围	成员变量 是类的属性，静止的部分*/
    String bwh;
    /** 价格	成员变量 是类的属性，静止的部分*/
    String price;


    /**
     * 方法 是类的动态部分
     * 实现 前两个实例的方法
     * */

    public void skillFor1And2(){
        System.out.println("hi,老板～。我叫"+name+"，今年"+age+"我是"+sex+"身高"+height);
        System.out.println("我的三围是："+bwh+"只需要"+price);
        System.out.println("i can  吸，舔，取，精"+"if you like  you can ride,得加钱");
        System.out.println("老板点我哟～ 嘤嘤嘤！！！");
    }
    /**
     * 实现第三个实例的方法
     * */
    public void skillForHe(){
        System.out.println("学习使我快乐 and you");

    }

}
