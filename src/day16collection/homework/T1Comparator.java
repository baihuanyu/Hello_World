package day16collection.homework;

import java.util.Comparator;
/**
 * 定制的比较器
 *
 * */
public class T1Comparator implements Comparator<Teacher1> {
    @Override
    public int compare(Teacher1 o1, Teacher1 o2) {
        //判断条件先按照年龄降序，如果年龄相等则按照身高升序
        if (o1.age>o2.age){
            return -1;
        }else if (o1.age<o2.age){
            return 1;
        }else {
            if (o1.height>o2.height){
                return 1;
            }else if (o1.height<o2.height){
                return -1;
            }else {
                return 0;
            }
        }
    }
}
