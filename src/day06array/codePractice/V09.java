package day06array.codePractice;

import java.util.Arrays;

public class V09 {
    public static void main(String[] args) {
        int [][] arr = new int[3][4];
        arr[1][1] = 100;
        System.out.println(arr);//结果是二位数字的内存地址值
        System.out.println(Arrays.toString(arr));//打印了个栈里面的地址值，二纬数组里面的一纬数组
    }
}
