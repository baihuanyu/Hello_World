package day22java8.lambda;

import java.util.function.Function;

/**
 * jdk1.8 提供的函数式接口
 * 	  interface Function<T,R>
 * 			参数类型
 * 			T -功能的输入类型
 * 			R -函数的结果类型
 * 			这是一个功能接口，因此可以作为赋值的目标一个lambda表达式或方法参考。
 *
 * 	抽象方法	R apply(T t) 将此函数应用于给定的参数。
 * 		1.上面的接口 本质上没有任何意义
 * 		2.接口本身并没有实现类
 * 		3.接口的功能完全由用户自己定义
 *
 * */
public class InterfanceMethodTest {
    public static void main(String[] args) {
        // 创建一个函数式接口
        //用lambda表达式表示筛选已什么结尾的 返回类型是布尔类型
        Function<String,Boolean> fc = s->s.endsWith("txt");
        Boolean apply = fc.apply("你好.txt");
        System.out.println(apply);
        // 使用lambda简写 前提需要有比较的字符串
        String string = "我是你爹";
        Function<String,Boolean> fc1 = string::endsWith;
        Boolean ff1 = fc1.apply("txt");
        System.out.println(ff1);


    }
}
