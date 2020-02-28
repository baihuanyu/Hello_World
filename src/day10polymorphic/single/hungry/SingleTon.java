package day10polymorphic.single.hungry;
/**
 *  单利设计模式（意为让外部只能获取一个对象）（饿汉模式）
 *		1. 概念：设计一个类，这个类只能创建一个对象。（限制创建对象对象数量）
 *
 *		2. 怎么设计？
 *			控制创建对象的数量 => 创建对象通过new 调用构造方法 => 控制构造方法就能控制创建对象
 *			控制调用构造方法  => 用private修饰  => 需要给外部提供一个对象  =>
 *			先在类中创建一个对象 （联想到封装） => 提供一个公共的  getInstance给外部返回一个对象
 *
 *		3. 步骤：
 *			1. 私有化构造方法
 *			2. 在类中创建一个对象，并且用static、private、final修饰
 *			3. 提供一个public修饰的方法getInstance给外部返回一个对象
 *
 *		4. 单例模式获取方式：
 *			1. 饿汉模式：预加载模式	（优化方式：静态内部类）
 *				优点：在类加载的时候，就创建好对象放到静态区了，获取对象效率高。线程安全
 *				缺点：类加载效率低，并且static修饰的成员占用资源。
 *
 *			2. 懒汉模式：
 *				优点：
 *				缺点：
 *		5. 作用：
 *
 *		6. 使用选择：
 *
 * */
public class SingleTon {

    /**构造方法私有化 让外部不能访问*/
    private SingleTon() {
    }
    /**创建类变量*/      // 数据类型     变量名        对象
    private static final SingleTon instance = new SingleTon();
    // final可加可不加，加上之后内联
    /** 提供让外界获得对象实例的方法*/
//                 类型        方法名
    public static SingleTon getInstance(){
        return instance;
    }
}
