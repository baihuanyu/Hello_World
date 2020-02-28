package codePractice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

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
public class Demo {
    public static void main(String[] args) {
        String str = "QWERTYUIQQQWJHDAADADBBBBCAD";
        HashMap<String, Integer> hashMap = new HashMap<>();
        //第一步 将他去重 进行统计
        //用于统计
        int count = 0 ;
        String s = quChong(str);
        for (int i = 0; i <s.length() ; i++) {
            for (int j = 0; j <str.length() ; j++) {
                if (s.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(s.charAt(i)+"---------"+count);
            hashMap.put(String.valueOf(s.charAt(i)),count);
            count = 0 ;
        }
        System.out.println(hashMap);
        Collection<Integer> values = hashMap.values();

    }

    private static String quChong(String str) {
        //创建一个字符容器进行添加
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length();i++){
            //判断如果是第一次出现
           if (str.indexOf(str.charAt(i)) == i){
               sb.append(str.charAt(i));
           }
        }
        String s = sb.toString();
        return s ;
    }
}
