package day06array.codePractice;

import java.util.Arrays;

public class V06 {
    public static void main(String[] args) {
        int[] arr={66,55,88,22,55,99,84};
        //打印数组的地址值
        System.out.println(arr);//[I@15db9742

        //调用JDK提供的工具类打印数组
        String str = Arrays.toString(arr);
        System.out.println(str);
    }
}
