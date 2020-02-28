package day25reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 使用反射获取运行时类的字段
 *     getField(String name)
 *          返回一个 Field对象，它反映此表示的类或接口的指定公共成员字段 类对象。
 *     getFields()
 *          返回包含一个数组 Field对象反射由此表示的类或接口的所有可访问的公共字段 类对象。
 *     getDeclaredField(String name)
 *          返回一个 Field对象，它反映此表示的类或接口的指定已声明字段 类对象。
 *     getDeclaredFields()
 *          返回的数组 Field对象反映此表示的类或接口声明的所有字段 类对象。
 *      加不加s的区别
 *      加不加Declared区别
 *
 *
 * @author shirokansakai*/
public class GetFiledTest {
    public static void main(String[] args) throws Exception {
        //1。获取运行时类
        Class<Person> aClass = Person.class;
        Person person = new Person(18, "亚索");
        System.out.println("=====获取本类所有字段getDeclaredFields()=======");
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            //打破封装
            declaredField.setAccessible(true);
            //获取访问修饰符
            int modifiers = declaredField.getModifiers();
            String string = Modifier.toString(modifiers);
            //获取名称
            String name = declaredField.getName();
            //获取属性类型
            Class<?> type = declaredField.getType();
            type.getSimpleName();
            //获取属性值,需要有实例
            Object o = declaredField.get(person);
            System.out.println(string+"---"+name+"---"+type+"---"+o);
            //设置属性值
            // 给谁设定属性值？ 在循环里需要判断
            if ("name".equals(name)){
                declaredField.set(person,"张三");
            }else if ("age".equals(name)){
                declaredField.set(person,22);
            }
        }
        System.out.println(person);
        System.out.println("===获取指定的属性值getDeclaredField(String name)===");
        Field name = aClass.getDeclaredField("name");
        //打破封装
        name.setAccessible(true);
        //获取访问修饰符
        int modifiers = name.getModifiers();
        String string = Modifier.toString(modifiers);
        //获取名字
        String name1 = name.getName();
        //获取类型
        Class<?> type = name.getType();
        //获取值
        Object value = name.get(person);
        System.out.println(string+"==="+name1+"==="+type+"==="+value);
        //设置值
        name.set(person,"李四");
        System.out.println(person);

    }
}
