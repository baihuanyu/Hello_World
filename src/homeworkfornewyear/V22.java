package homeworkfornewyear;
/*String s=”name=zhangsan age=18 classNo=090728”;
        将上面的字符串拆分，结果如下 : zhangsan 18 090728*/


import java.util.Arrays;

public class V22 {
    public static void main(String[] args) {
        String s="name=zhangsan age=18 classNo=090728";
        String[] s1 = s.split(" ");//将字符串分开
        for (String s2:s1) {//遍历字符串
            System.out.println(s2.substring(s2.indexOf("=")+1));//substring截取某个下标开始的字符串
        }
    }

}
