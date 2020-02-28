package day16collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        /*
		 * 构造方法：
		 * 		1. ArrayList() 构造一个初始容量为十的空列表。
				2. ArrayList(Collection c) 构造一个包含指定集合的元素的列表，按照它们由集合的迭代器返回的顺序。
				3. ArrayList(int initialCapacity) 构造具有指定初始容量的空列表。
		 */
        ArrayList list = new ArrayList();

        // 1.boolean add(E e)将指定的元素追加到此列表的末尾。如果添加的是其他集合，则会将其他集合作为整体插入
        list.add("hello");
        list.add("world");
        list.add(2);
        list.add(true);
        list.add('c');
        System.out.println(list);

        ArrayList list2 = new ArrayList();
        list2.add("hello");
        list2.add("python");
        list2.add("java");
        list2.add("php");
        System.out.println(list2);
       // 讲list2作为一个整体传入list
        list.add(list2);
        System.out.println("添加后的列表:"+list);
        // 2.void add(int index, Object element)在此列表中的指定位置插入指定的元素。
        list.add(0,"白桓宇");
        System.out.println("在指定位置添加元素后:"+list);

        // 3.boolean addAll(Collection c)按指定集合的Iterator返回的顺序将指定集合中的所有元素追加到此列表的末尾。

        //会将集合中元素插入，而不是将集合作为整体插入
        list.addAll(list2);
        System.out.println("每个元素插入后的新列表："+list);

        // 4.void clear() 从列表中删除所有元素。
        list2.clear();
        System.out.println("已经被清楚的列表"+list2);
        // 5.boolean contains(Object o) 判定当前集合中是否包含 o这个元素
        boolean result = list.contains("白桓宇");
        System.out.println("白桓宇是否在这个列表里："+result);
        // 6.E get(int index)返回此列表中指定位置的元素。
        System.out.println("索引4的元素是"+list.get(4));

        // 7.int indexOf(Object o) 返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。
        // 如果是-1 则没有这个元素
        System.out.println("白桓宇第一次出现的位置是"+list.indexOf("白桓宇"));
        // 8.int lastIndexOf(Object o) 返回此列表中指定元素的最后一次出现的索引，如果此列表不包含元素，则返回-1。

        // 9.boolean isEmpty()如果此列表不包含元素，则返回 true 。
        System.out.println("列表二是不是空的："+list2.isEmpty());
        // 10.E remove(int index) 删除该列表中指定位置的元素。
        //只要传入的是int类型都会当成是下标，不会当成是元素
        //如果要删除整数，则需要装箱成引用类型
        Object remove = list.remove(Integer.valueOf(2));
        System.out.println("被移除的元素是"+remove);
        System.out.println(list);


        // 12.boolean removeAll(Collection c)从此列表中删除指定集合中包含的所有元素。
        //删除所有的指定元素，因为collection 是单例模式
        list.removeAll(Collections.singleton("hello"));
        System.out.println("移除 hello 后的列表:"+list);
        // 13.E set(int index, E element)将指定下标index处的元素修改为element
        list.set(0,"钱多多");
        System.out.println("讲");

        // 14.int size() 返回此列表中的元素数
        System.out.println("列表含有"+list.size()+"个元素");

        // 15.Object[] toArray()将ArrayList对象转换为数组	重要
        Object[] arr = list.toArray();
        System.out.println("转换的数组"+ Arrays.toString(arr));
        //将数组换成集合
        List<Object> objects = Arrays.asList(arr);
        System.out.println("现在是集合"+objects);

        //扩展：将数组转换为集合对象	static <T> List<T> asList(T... a) 返回由指定数组支持的固定大小的列表。  注意：这里必须是包装类的数组才能转换为集合对象
        //数组是什么类型，集合中元素就全是这个类型的
        //数组是什么类型，集合中元素就全是这个类型的

        // 16.void trimToSize() 将ArrayList对象中未使用的空间去除（基本不用）
    }

}

