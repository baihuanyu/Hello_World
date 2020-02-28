package codePractice;

import java.util.*;

/**
 * 4. 最简单方式将集合中的元素去重 new HashSet(Collection c)
 * */

public class ArrQuChong {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,1,2,3,4,2};
        String[] arr = {"1","2","1","2","1","2"};
        HashSet<String> strings = new HashSet<>(Arrays.asList(arr));
        System.out.println(strings);
        HashSet<Integer> integers = new HashSet<>(Arrays.asList(arr1));
        System.out.println(integers);

        HashSet hashSet = new HashSet();
        for (int i = 0; i < arr.length; i++){
            hashSet.add(arr[i]);
        }
        Object[] objects = hashSet.toArray();
        System.out.println(Arrays.toString(objects));

    }




}
