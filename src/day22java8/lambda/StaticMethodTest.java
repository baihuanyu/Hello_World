package day22java8.lambda;

import java.util.function.Function;

/**
 * lambda 调用静态方法
 * */
public class StaticMethodTest {
    public static void main(String[] args) {
        // 用lambda 表达式调用函数方法
        Function<String,Integer> fc = s -> Integer.parseInt(s);
        Integer apply = fc.apply("110");
        System.out.println(apply);
        //lambda的简写 使用类名
        Function<String,Integer> fc1 = Integer::parseInt;
        Integer apply1 = fc1.apply("002210");
        System.out.println(apply1);
    }
}
