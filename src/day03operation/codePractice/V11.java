package day03operation.codePractice;
/*
 * +作为连接符的作用
 *
 *
 */

public class V11 {
        public static void main(String[] args) {
            String str="100";
            //字符串之前的数字会 计算结果
            System.out.println(101+3.2+str);//104.2100
           // System.out.println(10+3.14+true+str);//在前面才能进行拼接
            //在str后面的 数字不会参与运行，只会作为字符串 进行拼接
            System.out.println(str+10+3.14+true);
        }
}

