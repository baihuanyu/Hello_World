package 机试题;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.*;

/**
 * 7.	有如下的一个字符串  String str = “ksjhfkjashfkahfkahfiuuytwurekahd”;
 * 	① 请统计出其中每一个字母出现的次数，并把结果保存到一个文件中去：
 * 	② 请打印出字母次数最多的那一对
 * 	   请用到知识：泛型、Map、IO
 * */
public class D07 {
    public static void main(String[] args) {
        String str = "ksjhfkjashfkahfkahfiuuytwurekahd";
        try {
            getStr(str);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void getStr(String str) throws Exception {
        //创建写入流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("统计.txt"));
        //创建map用于统计
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        //遍历字符串
        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);
            //如果有值 就在值+1
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Character, Integer> next = iterator.next();
            String s = next.getKey() + "----" + next.getValue();
            osw.write(s+"\n");
        }
        // 取出map中的值
        Collection<Integer> values = map.values();
        //通过集合工具类选出最大值
        Integer max = Collections.max(values);
        Set<Character> c = map.keySet();
        for (Character character : c) {
            if (map.get(character).equals(max)) {
                osw.write("出现最多的组是"+character+"----"+map.get(character)+"\n");
            }
        }
        osw.flush();
        osw.close();

    }

}

