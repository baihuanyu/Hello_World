package day25reflect;

import java.lang.reflect.Method;

/**
 * 反射获取成员方法
 *      方法和构造方法不同点：1.方法可以被继承
 *  * 					  2.方法的名字可以随意起名
 *  *
 *  *  Method getMethod(String name, Class<?>... parameterTypes)
 *           	返回一个 Method 对象，它反映此 Class 对象所表示的类或接口的指定公共成员方法。
 *     Method[] getMethods() 获取所有的公共方法（包括继承的方法）
 *           	返回一个包含某些 Method 对象的数组，这些对象反映此 Class 对象所表示的类或接口（包括那些由该类或接口声明的以及从超类和超接口继承的那些的类或接口）的公共 member 方法。
 *
 *  *
 *  *
 *  *  Method getDeclaredMethod(String name, Class<?>... parameterTypes)
 *           	返回一个 Method 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明方法。
 *     Method[] getDeclaredMethods()
 *        	  	返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
 *
 * @author shirokansakai*/
public class GetMethodTest {
    public static void main(String[] args) throws Exception {
        //获取class实例
        Class<?> aClass = Class.forName("day25reflect.Person");
        Class<?> superclass = aClass.getSuperclass();
        String simpleName = superclass.getSimpleName();
        System.out.println(simpleName);

        System.out.println("=====获取所有方法包括被继承的getMethods()=====");
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            //获取访问权限
            int modifiers = method.getModifiers();
            //获取名字
            String name = method.getName();
            System.out.println(modifiers+"-----"+name);

        }
        System.out.println("=====获取自己独有的方法getDeclaredMethods()=====");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            int modifiers = declaredMethod.getModifiers();
            String name = declaredMethod.getName();
            System.out.println(declaredMethod+"----"+name);

        }
        System.out.println("=====获取并使用自己独有的方法getDeclaredMethod()=====");
        /**
         * 获取指定的方法
         *
         * 		  getDeclaredMethod(name, parameterTypes)
         * 		  name:  方法的名字
         * 		  parameterTypes：方法的形参类型
         * */
        Method show = aClass.getDeclaredMethod("show", int.class, int.class);
        /*
         执行方法
		 *  Object invoke(Object obj, Object... args)
         * 	对带有指定参数的指定对象调用由此 Method 对象表示的底层方法。
         *  obj：方法调用的对象
         *  args：方法执行的实参
         *  Object:就是方法执行完以后的返回值
         *
         * */
        Object o = aClass.newInstance();
        show.setAccessible(true);
        Object person = show.invoke(o, 2, 3);
        System.out.println(person);


    }
}
