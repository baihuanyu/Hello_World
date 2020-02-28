package day10polymorphic.codepractice;
/**
 * 单例设计 饿汉式
 *
 * */
public class Hungry {
    /**构造方法私有化*/
    private Hungry(){
    }
    /**提前创建个对象供外部使用*/
    public static final Hungry instance = new Hungry();
    /**为外部提供一个get方法*/
    public static  Hungry getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Hungry h1 = Hungry.getInstance();
        System.out.println(h1.hashCode());
        Hungry h2 = Hungry.getInstance();
        System.out.println(h2.hashCode());
        System.out.println(h1==h2);
        //System.out.println("Aa"=="bb");

    }
}
