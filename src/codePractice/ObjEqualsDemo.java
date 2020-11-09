package codePractice;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/6/17
 */
public class ObjEqualsDemo {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        if (Objects.equals(a, b)){
            System.out.println(Arrays.asList(args));
        }else {
            System.out.println("aaa ");
        }
    }
}
