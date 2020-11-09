package codePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/6/17
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student();
        student.setName("sdcqw");
        list.add(student);
        Student[] students = list.toArray(new Student[0]);
        for (Student student1 : students) {
            System.out.println(student1.getName());
        }
        HashMap<Object, Object> map = new HashMap<>();

    }
}
