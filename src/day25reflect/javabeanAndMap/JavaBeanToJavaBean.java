package day25reflect.javabeanAndMap;

import java.lang.reflect.Field;

/**
 * 需要保证字段相同
 *
 * @author shirokansakai*/
public class JavaBeanToJavaBean {
    public static void main(String[] args) throws Exception {
        //获取老师类对象
        Teacher teacher = new Teacher(1, "提莫队长", 18);
        Class<? extends Teacher> clst = teacher.getClass();
        //获取运行实例
        Student student = new Student();
        Class<? extends Student> clss = student.getClass();
        //获取字段
        Field[] fields = clst.getDeclaredFields();
        Field[] fields1 = clss.getDeclaredFields();
        //遍历老师的字段
        for (Field field : fields) {
            field.setAccessible(true);
            // 获取字段的名字
            String name = field.getName();
            // 获取老师的字段值
            Object value = field.get(teacher);
            for (Field field1 : fields1) {
                field1.setAccessible(true);
                //获取学生的字段
                String name1 = field1.getName();
                //如果字段名字相同，就把值设置给学生的字段
                if (name.equals(name1)){
                    field1.set(student,value);
                }

            }

        }
        System.out.println(student);

    }
}
