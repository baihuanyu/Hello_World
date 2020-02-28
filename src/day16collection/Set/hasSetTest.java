package day16collection.Set;

import java.util.HashSet;
import java.util.Objects;

public class hasSetTest {
    public static void main(String[] args) {
        /*
		 * 构造方法：
		 * 		1. HashSet()
					构造一个新的空集合; 具有默认初始容量（16）和负载因子（0.75）。
				2. HashSet(Collection c)
					构造一个包含指定集合中的元素的新集合。
				3. HashSet(int initialCapacity)
					创建一个新的空集合; 可以指定的初始容量initialCapacity和默认负载因子（0.75：扩容机制，当达到75%容量就扩容）。
				4. HashSet(int initialCapacity, float loadFactor)  就是用默认的，经过测试效率和空间比是最高的
					创建一个指定容量和加载因子的空集合对象
		 */
        HashSet hashSet = new HashSet();
//		hashSet.add(1);
//		hashSet.add(1);
//		hashSet.add(true);
//		hashSet.add("篮球");
//		hashSet.add("篮球");
//		System.out.println(hashSet);//

        System.out.println("=============添加自定义类型===========");
        User u1 = new User("你好",22);
        User u2 = new User("你好",22);
        // 判断机制，先判断哈希码在判断值，都相同才是同一个元素

        System.out.println(u1.hashCode());//
        System.out.println(u2.hashCode());//

        System.out.println(u1.equals(u2));//false

        /*
         * 判断重复的机制：
         * 		1. 先判断元素的hashCode值
         * 		2. 在hashCode相等的情况下，继续判断equals比较，如果都相等认为是同一个元素
         */
        hashSet.add(u1);
        hashSet.add(u2);
        System.out.println(hashSet);

    }

}

class User{
    String name;
    int age;
    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public User() {
    }

    @Override
    public String toString() {
        return "[" +
                 name + "，" +
                 age +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

