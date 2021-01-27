package com.demo.designPattern.singleton.lh;

/**
 *  LH
 *   双重检测 + volatile
 * @author baihuanyu bwx966955
 * @date 2021/1/26 14:27
 */
public class Lh {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
class Singleton{
    private String  name;
    private Singleton() {

    }
    private volatile static Singleton instance;

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class) {
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
