package day25reflect.javabeanAndMap;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 将javabean转换为map
 *
 *
 * @author shirokansakai*/
public class JavaBeanToMap {
    public static void main(String[] args) throws Exception {
        //创建map
        Map<String, Object> map = new HashMap<>(100);
        //创建一个对象
        Teacher teacher = new Teacher(002, "魔女宅急便", 18);
        //获取运行时类
        Class<? extends Teacher> cls = teacher.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            //获取名字
            String name = declaredField.getName();
            //获取值
            Object value = declaredField.get(teacher);
            //将值添加到map里面去
            map.put(name,value);


        }
        System.out.println(map);


    }
}
