package day12usualclass.正则表达式;
/**
 * 由普通字符和特殊字符(元字符)组成。
 *
 *
 * 字符
 *     x       字符 x  。  举例：'a'  表达式字符a
 *     \\      反斜杠字符
 *     \n      换行
 *     \r      回车符
 *
 *
 * 字符类
 *     [abc]       表示abc中任意单个字符
 *     [^abc]      表示除了abc任意单个字符
 *     [a-zA-Z]    表示a到z A到Z中任意单个字符
 *     [0-9]       表示0-9任意单个字符
 *
 *
 * 预定义字符类
 *     .           除了换行符以外的任意单个字符。    我的就是.字符本身，怎么表示呢？ \.
 *     \d          数字[0-9]
 *     \D          非数字： [^0-9]
 *     \w          数字字母下划线[a-zA-Z_0-9]
 *     \W          非单词字符：[^\w]
 *     \s          空白字符
 *     \S          非空白字符：[^\s]
 *
 * 边界匹配器
 *     ^           开头
 *     $           结尾
 *     \b          单词边界
 *
 *
 * 数量词
 *     X?          表示X可以出现一次或一次也没有
 *     X*          零次或多次
 *     X+          一次或多次
 *     X{n}        恰好 n 次
 *     X{n,}       至少 n 次
 *     X{n,m}      至少 n 次，但是不超过 m 次
 *
 *
 * 特殊符号
 *     ()          子字符集
 *     |           或
 *     &&          与
 *     \           转义字符
 *     ？          设置括号内的选项是可选的
 *
 *
 *
 * */
public class RegexTest {
    public static void main(String[] args) {
        String rgx = "^[0-9]$";//表示匹配数字
        //String rgx2 = "[\d]";
        String s = "1";
        boolean matches = s.matches(rgx);
        System.out.println(matches);

        rgx = "^[abcd]*$";// 表示匹配abcd中任意字符0个或者多个， 类似于^[abcd]{0,}$
        s = "aaca";
        boolean matches1 = s.matches(rgx);
        System.out.println(matches1);

        s = "18599958004"; //匹配电话号码
        //电话号码，一般1开头 第二位在3-9之间
        // \d 表示数字0-9 需要对\进行转意
        rgx="^1[3-9][\\d]{9}$";
        boolean matches2 = s.matches(rgx);
        System.out.println(matches2);
    }

}
