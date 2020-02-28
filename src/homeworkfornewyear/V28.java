package homeworkfornewyear;
/*
28.		请将下面所有的文件中选出所有是txt类型的文件，并将该类型文件所有首字母改为大写（中级）
        String[] arr = {"hao.html","Hello.exe","haha.txt","abc.txt","cdf.doc","test.png","test2.jpg"};
*/

import java.util.Arrays;

public class V28 {
    public static void main(String[] args) {
        String[] arr = {"hao.html","Hello.exe","haha.txt","abc.txt","cdf.doc","test.png","test2.jpg"};
        for (String s:arr) {
            if (s.endsWith(".txt")){
                String s1 = s.toString();
                String s2 = s1.substring(0, 1).toUpperCase() + s1.substring(1);//截取字符串第一个
                System.out.println(s2);
                //System.out.println(s);
                char[] chars = s.toCharArray();
                //System.out.println(Arrays.toString(chars));
                if (chars[0]>='a'&&chars[0]<='z'){//判断首字母是否为小写字母
                    chars[0] = (char)(chars[0]-32);//小字母-32就是大字母
                }
                System.out.println(new String(chars));
                }
            }
    }
}

