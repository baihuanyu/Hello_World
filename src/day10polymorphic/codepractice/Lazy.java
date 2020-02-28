package day10polymorphic.codepractice;
/**
 * 单例设计模式之 懒汉式
 * */
public class Lazy {

    private Lazy(){

    }
    public static Lazy instance;

    public static  Lazy getInstance(){
        if (instance == null) {
            Lazy instance = new Lazy();
        }
        return instance;
    }

    public static void main(String[] args) {
        Lazy l1 = Lazy.getInstance();
        Lazy l2 = Lazy.getInstance();
       // Lazy l3 = new Lazy();
        System.out.println(l1==l2);

    }
}
