package day09extendsandequals.homework;
/**
 * 1. char charAt(int index)  查找指定索引的值。
 * 2. String concat(String str) 将指定的字符串连接到该字符串的末尾。
 * 3. int indexOf(int ch) 返回指定字符第一次出现的字符串内的索引。
 * 4. boolean endsWith(String suffix) 测试此字符串是否以指定的后缀结尾。
 * 5. boolean isEmpty() 返回 true如果，且仅当 length()为 0 。
 * */
public class PracticeApi {
    public static void main(String[] args) {
       // 1. 格式：char 变量名（用于接收结果）= 字符串.charAt(所要的索引) ；
        String str1 = "你还记得我吗";
        char result = str1.charAt(3);
        System.out.println(result);
        //2. 格式： String 变量名 = 原字符串.concat（要添加的字符串）;
       String str2 = str1.concat("？记得");
        System.out.println(str2);
        //3.格式 int 变量名（用于接收结果）= 字符串.indexof(所要匹配的字符)
        int result2 = str2.indexOf("记");
        System.out.println(result2);
        //4.格式 boolean b = 字符串.endwith("查找的字符串")
        boolean result3 = str2.endsWith("记得");
        System.out.println(result3);
        String str3 = " ";
        //检测字符串是否为空
        boolean result4 = str3.isEmpty();// 其中 空格也算是字符 所有返回为false
        System.out.println(result4);

    }
}
