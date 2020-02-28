package codePractice;

import java.util.*;

/**
 * 1、有如下的一个字符串  String str = “QWERTYUIQQQWJHDAADADBBBBCAD”;  必做
 * ① 请统计出其中每一个字母出现的次数，在控制台打印如下的格式：map.containsKey(Key k)
 * 	A----3
 * 	B----4
 * 	C----1
 * 	D----2
 * ② 请打印出字母次数最多的那一对
 * 	1. str.toCharArray()
 * 	2. for if else
 * 		map.containsKey(Key k)
 * 		map.put()//第一次添加
 * 		map.replace()//多次添加key-value
 *
 * 	3. values()
 * 		Collections.max(values)
 * 		map.containsValue();
 *
 *
 * */
public class Demo1 {
    public static void main(String[] args) {
        String str = "QWERTYUIQQQWJHDAADADBBBBCAD";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            //如果key存在 就将它的值+1
            if (map.containsKey(c)){
                map.replace(c, map.get(c),map.get(c)+1);
             // 如果不存在，就添加
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
        //创建一个新map 用来输出字母次数最多的那个
        //创建一个treemap 去排序
        TreeMap hashMap = new TreeMap();
        //获取map中的key
        Set<Character> set = map.keySet();
        //获取map中的值
        Collection<Integer> values = map.values();
        //遍历key
        for (Character c: set) {
            System.out.println(c +"---->"+map.get(c));
            //如果map的值和提取出来的最大的值相等 就添加到新的map中
            if (map.get(c) == Collections.max(values) ){
                hashMap.put(c,map.get(c));
            }
        }
        System.out.println("字符出现最多的是："+hashMap);

    }
}