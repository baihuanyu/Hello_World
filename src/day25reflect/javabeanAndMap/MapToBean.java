package day25reflect.javabeanAndMap;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * map转换成javabean
 *      要求key要与Javabean中属性名称对象
 *
 * @author shirokansakai*/
public class MapToBean {
    public static void main(String[] args) throws Exception {
        //创建map对象并添加值
        Map<String,Object> map = new HashMap();
        map.put("id",3);
        map.put("name","小乔");
        map.put("age",19);
        System.out.println(map);
        //获取运行时类
        Student student = new Student();
        Class<Student> cls = Student.class;
        //获取所有字段
        Field[] declaredFields = cls.getDeclaredFields();
        //遍历字段
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            String name = declaredField.getName();
            //遍历map
            Set<Map.Entry<String, Object>> set = map.entrySet();
            Iterator<Map.Entry<String, Object>> iterator = set.iterator();
            while (iterator.hasNext()){
                Map.Entry<String, Object> next = iterator.next();
                //获取key值
                String key = next.getKey();
                //获取value
                Object value = next.getValue();
                //判断如果字段名字和key相同就赋值
                if (name.equals(key)){
                    declaredField.set(student,value);
                }
            }

        }
        System.out.println(student);


    }
}
