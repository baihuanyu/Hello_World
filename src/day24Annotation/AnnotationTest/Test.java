package day24Annotation.AnnotationTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author shirokansakai
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //  获取运行时类
        Class<Color> colorClass = Color.class;
        Method[] methods = colorClass.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            String name = method.getName();
            // 判断是否有注解
            if (method.isAnnotationPresent(MyAnnotation.class)){
                //获取注解
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                //获取单注解的值
                String value = annotation.value();
                if (value.equals("white")){
                    method.invoke(new Color());
                }
            }
        }

    }
}
