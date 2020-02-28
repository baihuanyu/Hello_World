package day23.设计模式.单例设计模式;

import day15thread.homework.Lazy;

/**
 * 懒汉模式， 解决线程安全问题
 * */
public class LazySingle {
    private static LazySingle instance;
    private  LazySingle(){
    }
    public static LazySingle getInstance(){
        if (instance == null) {
            synchronized (LazySingle.class){
                if (instance == null) {
                    instance = new LazySingle();
                }
            }
        }
                return instance;
    }
}
