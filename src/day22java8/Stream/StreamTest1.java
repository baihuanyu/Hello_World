package day22java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        //获取一个list集合
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //获取Stream流
        Stream<Integer> stream = list.stream();
        //获取consumer对象
        Consumer con = t -> System.out.println(t);
        //forEach 需要传入一个consumer对象
       // stream.forEach(con);
        //可以合成一步写： 调用的方式是system。out 里面的输出方法
        stream.forEach(System.out::println);

        //获取一个字符串列表
        List<String> asList = Arrays.asList("", "你好", "我是", "你爹", " ");
        Stream<String> stream1 = asList.stream();
        // 此处限制遍历个数，
        asList.stream().limit(3l).forEach(System.out::println);
        //断言 判断是否为空 里面的方法是test
        Predicate<String> p = t ->t.isEmpty();
        System.out.println(p.test(""));
        //这是一个链式结构，   filter 匹配
        long count = asList.stream().filter(String::isEmpty).count();
        System.out.println(count);

    }
}
