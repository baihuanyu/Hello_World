package codePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/6/19
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.printf("添加前列表的size= %d\n",arrayList.size());
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        System.out.printf("添加后列表的size= %d\n",arrayList.size());
        System.out.println("使用迭代器遍历");
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("使用下标的for循环遍历");
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i)+" ");
        }
        System.out.println("使用foreach");
        for (Integer integer : arrayList) {
            System.out.println(integer+" ====");
        }
        System.out.println("转换为array");
        Integer[] integers = arrayList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));
    }
}
