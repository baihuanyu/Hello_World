package codePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

/**
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/8/4
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        for (int i = 10; i <20 ; i++) {
            list1.add(i);
        }

        HashMap<Object, Object> map = new HashMap<>();
        list.parallelStream().forEach(o -> {
            map.put("key",o);
            list1.parallelStream().forEach(o1 -> {
                map.put("key1",o1);
                list2.add(map);
            });
        });
        //System.out.println(list2.size());
        for (Object o : list) {
            for (Object o1 : list1) {
                for (int i = 0; i <10 ; i++) {
                    map.put("list1",o);
                    map.put("list2",o1);
                    map.put("list3",i);
                    //map准备参数
                    //此处调用方法传入map
                }
            }
        }
    }
}
