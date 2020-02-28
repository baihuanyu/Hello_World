package day03operation.codePractice;
/*字符型   char 一次只能存儲一個字符
 * 一下内容了解
 * 	1.每一个字符后面都对应一个数字（ASCII表）
 * 	2.可以把一个  char赋值给一个int
 *  3.可以把一个数字赋值给 char
 *
 *
 */

public class V03 {
    public static void main(String[] args) {
        char c1 = '1'; //当char需要去声明一个变量的时候 用单引号表示。
        //特殊用法：
        char temp_char1='A';
        char temp_char2=65;
        System.out.println(temp_char1);//因为ASCII表  其中A65 a97
        System.out.println(temp_char2);

    }
}
