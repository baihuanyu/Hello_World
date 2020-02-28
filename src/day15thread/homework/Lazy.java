package day15thread.homework;
/**
 * 懒汉模式
 * */
public class Lazy {
    /**构造方法私有化*/
    private Lazy() {
    }

    private static Lazy lazy ;
    /**获取实例的方法*/
    public static Lazy getLazy() {
        //判断是否为空
        if (lazy== null) {
            Lazy lazy = new Lazy();
        }
        return  lazy;
    }
}
