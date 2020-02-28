package day12usualclass.string_;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 *	字符串相关的类：
 *		1. String 字符串类，底层是基于char[], 一旦创建长度就固定不变了,适用于字符串不经常增删改的操作的场景。父接口：CharSequence
 *			该接口的实现类：String、StringBuffer、StringBuilder
 *		String str = "abc";
 *		str += "d";//会创建新对象
 *
 *		2. 将其他类型转换为String类型的方式效率问题：
 *			toString() > String.valueOf(Object obj); > +
 *			因为+号，底层先将字符串对象转换为StringBuilder对象，然后调用StringBuilder对象的append追加字符串方法，再调用toString方法
 *			转换为String对象
 *
 *		3. 拼接字符串效率最高的方式：
 * 			StringBuilder.append() > StringBuffer.append() > +
 *
 *			如果经常操作字符串用StringBuilder和StringBuffer，如果是单线程或者多线程且不要求线程安全问题，用StringBuilder，
 * 			如果是多线程且是线程安全要求用StringBuffer
 *
 *	注意：
 *		常用字符集有：
 *			iso8859-1	不支持中文
 *			GBK（中国）（英文数字1个，中文2个字节）
 UTF-8（世界通用编码集）变长字符：1-6个字节
 一个utf8数字占1个字节
 一个utf8英文字母占1个字节

 占2个字节的：0
 占3个字节的：基本等同于GBK，含21000多个汉字
 占4个字节的：中日韩超大字符集里面的汉字，有5万多个

 少数是汉字每个占用3个字节，多数占用4个字节。
 占用3个字节的范围

 U+2E80 - U+2EF3 : 0xE2 0xBA 0x80 - 0xE2 0xBB 0xB3      共 115 个
 U+2F00 - U+2FD5 : 0xE2 0xBC 0x80 - 0xE2 0xBF 0x95      共 213 个
 U+3005 - U+3029 : 0xE3 0x80 0x85 - 0xE3 0x80 0xA9      共 36 个
 U+3038 - U+4DB5 : 0xE3 0x80 0xB8 - 0xE4 0xB6 0xB5      共 7549 个
 U+4E00 - U+FA6A : 0xE4 0xB8 0x80 - 0xEF 0xA9 0xAA      共 44138 个
 U+FA70 - U+FAD9 : 0xEF 0xA9 0xB0 - 0xEF 0xAB 0x99      共 105 个

 合计： 52156 个

 占用4个字节的范围
 U+20000 - U+2FA1D : 0xF0 0xA0 0x80 0x80 - 0xF0 0xAF 0xA8 0x9D      共 64029 个

 合计： 64029 个
 */

public class StringTest {
    public static void main(String[] args) throws UnsupportedEncodingException {

        //常用方法：
        //1.char charAt(int index) 返回 char指定索引处的值。
        char[] c = {'a','b','c','d'};
        String s = new String(c);//将
        System.out.println();
        s.charAt(1);


        //2.String concat(String str) 将指定的字符串连接到该字符串的末尾。 相当于：+
        String s1 = "hello";
        String s2 = " world";
        String s3 = s1.concat(s2);

        //3.boolean contains(CharSequence s) 判断当前对象是否包含连续的CharSequence（String、StringBuffer、StringBuilder）串
        //判断当前对象str是否包含连续的参数abc
        String s4 = "hello";
        System.out.println(s4.contains("ll"));
        
        //4.boolean endsWith(String suffix) 判断当前字符串是否以指定的后缀suffix结尾。
        String s5 = "hello";
        System.out.println(s5.endsWith("l"));

        //5.boolean startsWith(String prefix) 判断当前字符串是否以指定的前缀prefix开头。
        String str5 = "hello";
        str5.startsWith("h");

        //6.byte[] getBytes()  编码：将字符串对象按照默认字符集转换为字节数组
        String str6 = "hello";
        str6.getBytes();
        //7.byte[] getBytes(String charsetName)   编码：将字符串对象按照指定字符集转换为字节数组
        String str7 = "hello";
        str7.getBytes("utf-8");

        //8.void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 将此字符串中的字符复制到目标字符数组中。  (含头不含尾)[srcBegin,srcEnd)
        String str8 = "hello";
        char [] ss8 ={8};
        str8.getChars(0,2,ss8,0);
        //9.int indexOf(String s) 返回s第一次在当前对象str中出现的索引 ，-1表示没有找到（注意：这里s必须也是匹配连续的字符串）
        String str9 = "hello";
        System.out.println(str9.indexOf("h"));
        //10.int indexOf(String s, int fromIndex) 返回s在当前对象指定下标fromIndex后第一次出现的索引  (str是作为一个整体匹配下标的)
        String str10 = "hello";
        System.out.println("10"+str10.indexOf("l",2));
        //11.int lastIndexOf(String str) 返回指定子字符串最后一次出现的字符串中的索引。
        String str11 = "hello";
        System.out.println("11 "+str11.lastIndexOf("l"));
        //12.int lastIndexOf(String str, int fromIndex) 返回指定子字符串的最后一次出现的字符串中的索引，从指定索引开始向前搜索。
        String str12 = "hello";
        System.out.println("12 "+str12.lastIndexOf("l",3));
        //13.boolean isEmpty() 当 length()为 0时，返回 true 。
        String str13 = "hello";
        System.out.println(str13.isEmpty());
        //14.int length() 返回此字符串的长度。
        String str14 = "hello";
        System.out.println(str14.length());
        //15.boolean matches(String regex)  判断当前字符串对象是否匹配给定的正则表达式regex，通常用来进行权限限制，字符格式限制   	一般用了做校验：如，用户名和密码的合法性
        //匹配a-z或者A-Z之间任意多个字符

        //16.String replace(CharSequence target, CharSequence replacement)   将当前字符串中的target替换为replacement,通常用来和谐用语
        //WQNMLGB/DSB/CNM：和谐用语


        //17.String replaceAll(String regex, String replacement) regex是正则表达式，将当前字符串中的regex全部替换为replacement

        //18.String replaceFirst(String regex, String replacement)  将当前字符串中的第一个regex替换为replacement

        /**
         * replace()和replaceAll()，replaceFirst()区别
         * replace()只能匹配String、StringBuffer、StringBuilder对象
         * replaceAll()和replaceFirst()可以匹配正则表达式，更灵活
         * 如：
         */
        System.out.println("============1============");
        //在正则表达式中,.表示匹配任意一个字符

        System.out.println("============2============");
        //19.String[] split(String regex)  将当前字符串对象按照给定的正则表达式regex分割为String[]
        //请将字符串中所有的AVI文件打印出来
        String str = "hello.avi nice.avi to.avi";
        String[] s19 = str.split(".avi");
        System.out.println("第十九题："+Arrays.toString(s19));

        //20.CharSequence subSequence(int beginIndex, int endIndex)  从当前字符串中beginIndex和endIndex之间截取子串（含头不含尾）

        //21.String substring(int beginIndex)   从当前字符串中截取beginIndex到最后的子串
        //搭配indexof更好用
        String str22 = "hello";
        str22.substring(str22.indexOf("l"));
        //22.String substring(int beginIndex, int endIndex)  从当前字符串中beginIndex和endIndex之间截取子串（含头不含尾）

        //23.char[] toCharArray() 将此字符串转换为新的字符数组。  方便遍历当前所有的字符
        String str23 = "hello";
        char [] s23 = str23.toCharArray();
        //24.String toUpperCase() 将此字符转换为全大写	一般用于验证码
        String str24 = "hello";
        System.out.println(str24.toUpperCase());

        //25.String toLowerCase() 将此字符转换为全小写	一般用于验证码
        String str25 = "hello";
        System.out.println(str25.toLowerCase());

        //26.String trim() 将当前字符串对象中字符前面和后面的空格去除	用了避免用户的一些不当输入
        String str26="   hello   world   ";
        str26.trim();

        //27.static String valueOf(Object obj) 将其他类型转换为String对象
        String.valueOf(str5);
        //这里其实是1的包装类Integer
    }
}
