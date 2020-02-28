package day16collection.Set;
/**
 * 无法运行是因为 一个文件有两个user类
 *
 * */
import java.util.TreeSet;

public class TreeSetTest {
    public  void main(String[] args) {
        System.out.println("--------添加自定义数据类型并排序-----------");
        //创建treeset对象
        TreeSet treeSet = new TreeSet();
        //创建用户类
        User u1 = new User("你好", 21);
        User u2 = new User("你好好", 21);
        User u3 = new User("你好", 22);
        User u4 = new User("你好", 23);
        User u5 = new User("你好好", 24);
        User u6 = new User("你好", 21);
        //添加到树组
        treeSet.add(u1);
        treeSet.add(u2);
        treeSet.add(u3);
        treeSet.add(u4);
        treeSet.add(u5);
        treeSet.add(u6);
        System.out.println(treeSet);

    }

    /**
     * 创建一个储存数据的类
     */
     class User implements Comparable<User> {
        private String name;
        private int age;

        public User() {
        }

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(User o) {
            //比较规则，年龄升序，姓名长度降序
            if (this.age > o.age) {
                //正数代表升序 负数代表降序，0代表元素相同
                return 1;
            } else if (this.age < o.age) {
                return -1;
            } else {
                if (this.name.length() > o.name.length()) {
                    return -1;
                } else if (this.name.length() < o.name.length()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}


