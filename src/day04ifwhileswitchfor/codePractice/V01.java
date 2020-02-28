package day04ifwhileswitchfor.codePractice;
/*逻辑运算
 * 将多个比较 最终得到一个结果
 * 如果今天周六  并且 天不下雨  ----》去   不去    逻辑与
 * &(并且)  符号两边的判断 同时为true   表达式 最终的结果为true
 * |(或者)  符号两边的判断 只要一边为true   表达式 最终的结果为true
 *  双与 和双或 具有短路效果  目的是为了提高代码的执行效率
 * &&(并且)
 * ||(或者)
 *   最终结果和 & | 效果一样，前一个判断已经可以确定最终表达式的结果的时候，后一个判断不执行
 * ^(异或)  两边 要不一样 结果为true 两边一致 结果为false
 *
 * !(非)--取反
 */

public class V01 {
    public static void main(String[] args){
        //Java的 最佳学习年龄 18  60
        int age =26;
        System.out.println(age>18 & age<60);


        int a=10;
        age=16;
        //                false  --&&  后面的判断不执行
        System.out.println(age>18 && ++a>10);
        //                 true --不能确定整个表达式的结果 后面的判断继续执行
        System.out.println(age>=16 && ++a>10);
        System.out.println("------------------------------");
        //                false  --||前面的结果不能确定整个表达式的结果， 后面的判断继续执行
        System.out.println(age>18 || ++a>10);
        //                 true --||前面已经可以确定表达式的结果  后面不执行
        System.out.println(age>=16 || ++a>10);

        System.out.println(a);//12

        System.out.println(!("A"=="A"));
    }
}
