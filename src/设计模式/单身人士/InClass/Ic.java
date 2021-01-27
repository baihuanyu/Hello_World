package com.demo.designPattern.singleton.inClass;

/**
 *   静态内部类
 * @author baihuanyu bwx966955
 * @date 2021/1/26 14:33
 */
public class Ic {
    public static void main(String[] args) {
        Singleton instance =Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
class Singleton{
    private Singleton() {

    }
    private static class SingletonInstance{
        private  static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonInstance.instance;
    }
}
