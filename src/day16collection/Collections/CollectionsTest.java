package day16collection.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {
    public static void main(String[] args) {
        // 1.static boolean addAll(Collection c,Object...elements)将所有指定的元素添加到指定的集合。
        ArrayList list = new ArrayList();
        Collections.addAll(list,1,"西红柿","土豆");
        System.out.println(list);

        // 6.static void fill(List list, Object obj)用指定的元素代替指定列表的所有元素。(批量初始化)
        // 格式化
        Collections.fill(list,"钱多多");
        System.out.println(list);
        // 7.static Object max(Collection coll)根据其元素的自然顺序返回给定集合的最大元素。

        // 8.static Object max(Collection coll, Comparator comp)根据定制排序返回给定集合的最大元素。
        // 9.static Object min(Collection coll)根据其元素的自然顺序返回给定集合的最小元素。
        // 10.static Object min(Collection coll, Comparator comp)据定制排序返回给定集合的最小元素。

        // 11.static void reverse(List list)反转指定列表中元素的顺序。

        // 12.static void shuffle(List list)常常用来洗牌，打乱集合中元素的排序

        // 16.static void sort(List list) 根据其元素自然排序。

        // 17.static void sort(List list, Comparator c)根据指定的比较器引起的顺序对指定的列表进行排序。

        // 18.static void swap(List list, int i, int j)交换下标i和下标j的元素位置。

        // 19.static List synchronizedList(List list)将list对象转换为线程安全的。
        // 20.static Map<K,V> synchronizedMap(Map<K,V> m)将map对象转换为线程安全的。
        // 21.static Set<T> synchronizedSet(Set s)将set对象转换为线程安全的。
    }
}
