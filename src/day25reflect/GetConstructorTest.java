package day25reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * 使用反射获取构造方式并且使用
 *
 * @author shirokansakai*/
public class GetConstructorTest {
    public static void main(String[] args) throws Exception {
        /*
         *获取Class的方法，有三种
         * 1 类名.class(不管什么类型，都可以使用这个方法)
         * 2 对象.getClass();
         * 3 Class.forName("全限定路径：比如java.lang.String") 较为常用
         * 4 Integer.TYPE(作为基本数据类型和void关键字获取class的方法)
         * 5 所有的相同数据类型和相同纬度的数组共享一个class。
         * */
        // 获取class类型
        Class<?> aClass = Class.forName("day25reflect.Person");
        System.out.println(aClass);
        /*获取构造方法：
                加s与不加s的区别： 获取一个或者多个构造方法
                加不加Declared的区别： 获取权限不同的构造方法
                Constructor<T>	getConstructor(类<?>... parameterTypes)
                            返回一个 Constructor对象，该对象反映 Constructor对象表示的类的指定的公共 类函数。
                Constructor<?>[]	getConstructors()
                            返回包含一个数组 Constructor对象反射由此表示的类的所有公共构造 类对象。
                Constructor<T>	getDeclaredConstructor(类<?>... parameterTypes)
                            返回一个 Constructor对象，该对象反映 Constructor对象表示的类或接口的指定 类函数。
                Constructor<?>[]	getDeclaredConstructors()
                            返回一个反映 Constructor对象表示的类声明的所有 Constructor对象的数组 类

         *
         * */
        System.out.println("=====获取所有的构造方法getDeclaredConstructors()=====");
        Constructor<?>[] dc = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : dc) {
            //获取所有的 构造方法
            /* getName()               获取名字
             * getModifiers()          获取权限
             *setAccessible(true);     打破封装
             * newInstance             获取实例
             * Class中的newInstance     即调用无惨构造
             * */
            //获取名称
            String name = constructor.getName();
            //获取访问修饰符
            int modifiers = constructor.getModifiers();
            String string = Modifier.toString(modifiers);
            //获取参数列表类型
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                String simpleName = parameterType.getSimpleName();
                System.out.println(simpleName);
            }
            System.out.println(name+"---"+"---"+string);
        }
        System.out.println("===获取单独的私有化去构造方法getDeclaredConstructor()===");
        Constructor<?> prs = aClass.getDeclaredConstructor(String.class);
        System.out.println(prs);
        prs.setAccessible(true);
        Object instance = prs.newInstance("张三");
        System.out.println(instance);
        System.out.println("===获取公有的构造方法getConstructor()===");
        //获取有惨构造
        Constructor<?> constructor = aClass.getConstructor(int.class,String.class);
        System.out.println(constructor);
        //使用有惨构造创建实例
        Object instance1 = constructor.newInstance(18, "李四");
        System.out.println(instance1);

    }
}
