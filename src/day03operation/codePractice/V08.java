package day03operation.codePractice;
/*自增自减  ++  --
        * 针对变量的自增自减
        * ++在前   先自增，再使用
        * ++在后  先使用 ，再自增*/

public class V08 {
    public static void main(String[] args) {
        //声明一个变量
        int i = 20;
        //进行自增
        int add1 = i++ + i++ + i++ ; // 63 此时i为23
        //         20     21   22
        System.out.println(i);
        int add2 = ++i + ++i + ++ i ; // 75 此时i为26
        //         24    25     26
        System.out.println(i);
        System.out.println(add1);
        System.out.println(add2);

        System.out.println("-----------------------------------------");
        //声明一个变量

        int t = 30;
        // 进行自 减 subtraction
        int sub1 = t-- +t-- +t -- ; //87 此时t为27
        //          30   29   28
        System.out.println(t);
        int sub2 = --t + --t + --t; //75 此时t为23
        //         26     25    24
        System.out.println(t);
        System.out.println(sub1);
        System.out.println(sub2);


    }
}
