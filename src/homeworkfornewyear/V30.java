package homeworkfornewyear;

import java.util.Arrays;

/**
 * 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串，
 * 但要保证汉字不被截取半个，如“我 ABC”，4，应该截取“我 AB”，输入“我 ABC 汉 DEF”，
 * 6，应该输出“我 ABC”，而不是“我 ABC+汉的半个”。
 *
 * */

public class V30 {
    public static void main(String[] args) {
        String s = "我ABC汉DeF";
        V30.subStr(s,4);
        byte[] bytes = "我".getBytes();
        System.out.println(Arrays.toString(bytes));
    }




    public static void subStr(String str , int n){
        //将字符串换做字符数组
        char[] chars = str.toCharArray();
        //用于统计字节长度
        int sum = 0;
        //创建字符串容器用于添加
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <chars.length ; i++) {
            int length = (String.valueOf(chars[i]).getBytes()).length;
            if (length + sum > n) {
                break;
            }
            sb.append(chars[i]);
            sum +=length;
        }
        System.out.println("截取的字符串是："+sb.toString());
    }
}
