package day16collection.List.LinkedList;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
    /*
		 * 构造方法
		 * 		LinkedList() 构造一个空列表。
				LinkedList(Collection c) 构造一个包含指定集合的元素的列表，按照它们由集合的迭代器返回的顺序。
		 */
        LinkedList list = new LinkedList();

        //常用方法：
        //void push(E e) 元素入栈（栈的特点）
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.push("E");
        list.push("F");
        list.push("G");
//		System.out.println(list);//[G, F, E, D, C, B, A]

//		//区别add方法
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("D");
//		list.add("E");
//		list.add("F");
//		list.add("G");
//		System.out.println(list);//[A, B, C, D, E, F, G]

        //E pop() 删除并且返回最后添加的元素（栈的特点）
        System.out.println(list.pop());

        //练习题
        //[G, F, E, D, C, B, A]
        for (int i = 0; i < list.size(); i++) {
            //GFED
            //因为size在逐渐变小， pop指弹出第一个对象
            System.out.println(list.pop());

        }

        //boolean add(E e) 将指定的元素追加到此列表的末尾。
        list.add("你好");
        System.out.println("添加元素你好:"+list);
        //void add(int index, E element) 在此列表中的指定位置插入指定的元素。
        list.add(0,"hello");
        System.out.println("在第一行添加元素hello"+list);
        //boolean addAll(Collection<? extends E> c) 按照指定集合的迭代器返回的顺序将指定集合中的所有元素追加到此列表的末尾。
        //boolean addAll(int index, Collection<? extends E> c) 将指定集合中的所有元素插入到此列表中，从指定的位置开始。
        //void addFirst(E e) 在该列表开头插入指定的元素。
        //void addLast(E e) 将指定的元素追加到此列表的末尾。
        //void clear() 从列表中删除所有元素。
        list.clear();
        System.out.println("清空列表"+list);
        //boolean contains(Object o) 如果此列表包含指定的元素，则返回 true 。
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //E element() 检索但不删除此列表的头（第一个元素）
        list.element();
        System.out.println("检索列表的第一个是"+list.element());
        //E get(int index) 返回此列表中指定位置的元素。
        System.out.println("列表的第3个元素数"+list.get(2));
        //E getFirst() 返回此列表中的第一个元素。
        //E getLast() 返回此列表中的最后一个元素。
        //int indexOf(Object o) 返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。
        //int lastIndexOf(Object o) 返回此列表中指定元素的最后一次出现的索引，如果此列表不包含元素，则返回-1。
        //ListIterator<E> listIterator(int index) 从列表中的指定位置开始，返回此列表中元素的列表迭代器（按适当的顺序）。
        //boolean offer(E e) 将指定的元素添加为此列表的尾部（最后一个元素）。
        list.offer("钱多多");
        System.out.println("将钱多多添加到列表尾部："+list);
        //boolean offerFirst(E e) 在此列表的前面插入指定的元素。
        //boolean offerLast(E e) 在该列表的末尾插入指定的元素。
        //E peek() 检索但不删除此列表的头（第一个元素）。
        //E peekFirst() 检索但不删除此列表的第一个元素，如果此列表为空，则返回 null 。
        //E peekLast() 检索但不删除此列表的最后一个元素，如果此列表为空，则返回 null 。
        //E poll() 检索并删除此列表的头（第一个元素）。
        list.poll();
        System.out.println("检索并删除第一个元素"+list);
        //E pollFirst()检索并删除此列表的第一个元素，如果此列表为空，则返回 null 。
        //E pollLast()检索并删除此列表的最后一个元素，如果此列表为空，则返回 null 。
        //E remove() 检索并删除此列表的头（第一个元素）。
        //E remove(int index) 删除该列表中指定位置的元素。
        //boolean remove(Object o) 从列表中删除指定元素的第一个出现（如果存在）。
        //E removeFirst() 从此列表中删除并返回第一个元素。

        //E removeLast() 从此列表中删除并返回最后一个元素。

        //E set(int index, E element) 用指定的元素替换此列表中指定位置的元素。
        //int size()  返回此列表中的元素数。

        //Object[] toArray()  将集合对象转换为数组

    }
}
