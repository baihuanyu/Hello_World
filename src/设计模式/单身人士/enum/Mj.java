package com.demo.designPattern.singleton.mj;

/**
 *  枚举
 * @author baihuanyu bwx966955
 * @date 2021/1/26 14:55
 */
public class En {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance1 == instance);
        System.out.println(instance1.hashCode());
        System.out.println(instance.show());
    }
}
enum Singleton{
    INSTANCE;

    public String show(){
        return "enum";
    }
}
