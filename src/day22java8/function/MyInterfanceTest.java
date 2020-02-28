package day22java8.function;
/**
 *     1.接口中静态方法的调用
 *  * 		接口名.方法名();
 *  *  	注意，不能够被子接口所继承，不能覆写
 *  *
 *  *  2.接口中默认方法的调用
 *  * 		接口的实现类对象.方法名();
 *  * 		可以被子接口所继承
 *  * 		可以被实现类覆写
 *
 *
 * @author shirokansakai*/
public class MyInterfanceTest {
    public static void main(String[] args) {
        Myinterfance my = ()-> System.out.println("这是抽象方法");
        //抽象方法的调用
        my.show();
        //字段的调用
        String str = Myinterfance.str;
        System.out.println(str);
        //静态方法的调用
        Myinterfance.say();
        //默认方法的调用
        my.get();

    }
}
/**
 * 接口中可以放的内容
 *  1，字段
 *  2，方法
 *  3，静态方法
 *  4，默认方法
 * */
interface Myinterfance {
    /**字段*/
    String str ="这个是字段";
    /**私有方法*/
    void show();
    /**静态方法*/
    public static void say(){
        System.out.println("这个是静态方法");
    }
    /**默认方法*/
    public  default void  get(){
        System.out.println("这个是默认方法");
    }
}