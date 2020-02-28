package day03operation.task1231;

public class Task1231 {

    public static void main(String[] args) {
        int i = 21;
        i++;  //22

        System.out.println("i=" + i);// i = 22

        ++i; //23

        System.out.println("i=" + i);//i = 23

        int a = ++i; // 24 先自增 在赋值

        System.out.println("a=" + a);//a = 24

        System.out.println("i=" + i);//i = 24

        int b = i++;// b 24 i =25  先赋值在自增

        System.out.println("b=" + b);// b = 24

        System.out.println("i=" + i);// i = 25
        System.out.println("==================================================");
        //2 使用三目运算符语句判断一个数是奇数还是偶数。（自学，先尝试）
        int num = 20;
        String str = num / 2 == 0 ? "偶数" : "奇数";
        System.out.println(str);

        //4 使用三目运算计算出两个变量中最大值的那个变量
        int num1 = 20;
        int num2 = 30;
        String str2 = num1 > num2 ? "num1大" : "num2大";
        System.out.println(str2);

            /* 5 请你说说& | 和 && || 的区别
              & :与 前面条件运行后也要运行后面条件 不管前面真假
              && : 前面条件为假 整个为假 后面就不会运行
              ||:
              | :      */

        //7 分析下面程序的结果是： System.out.println(1+5+"=="+'1'+'5');
        // 是一个 6==15 的字符串；
        /* 8 分析说明下面两段代码的区别：
                        short s1 = 1;
                        s1 += 3; //
                        System.out.println(s1); 4 short

                        short s1 = 1;
                        s1 = s1 + 3;
                        System.out.println(s1); 4 int */
        /*  10 判断下面代码写法是否正确，如果有错，什么时候报错，以及错误原因
    ①	int i = 12L;// l 针对long标识
	② byte b = 189;// 超过了byte的范围
	③ float f = 0.1415;//f为精度 后面加f标识
	④ byte b = 133 + 19;// 数字默认为整型 由大转小 需在前面添加byte 且超过范围，会丢失精度
	⑥ byte b = 3;
        b += 1;
        怎么改？
        11. 对于以下，有
        int x = 5;
        int y = 7;
        int z;
        z = ++x + y++;  //13 此时 x = 6 y =8
        z = ++x + x++;  // 14  x = 8
        x = ++x + x++;  // 18
        z = x > y ? ++x : y++; //
        System.out.println("x:"+x+"   y:"+y+"   z:"+z);//
        12.	 int a=9;
        System.out.println(++a+a); //

        13.  	 int i =6;   
        int j = i++;   //6
        int k = --i; //6
        这段代码运行后，i等于多少？j等于多少？k等于多少？
        14.
        1. int i = 0;   
        2. int j = i++ + ++i;   //1 此时i=2
        3. int k = --i + i--; //2 i=0
        代码执行后i、j、k分别等于多少呢？
        15. 什么是隐式类型转换？什么是显示类型转换？
          1个是自动转换 1个是强制转换
        16.  解释什么是成员变量，局部变量，类成员变量？
        成员变量：在类中存在的变量
        类变量：类变量指静态变量由static修饰*/


    }
}
