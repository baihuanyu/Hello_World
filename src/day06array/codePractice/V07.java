package day06array.codePractice;
/*
 基本数据不影响原来的值
 *	引用数据不影响原来的地址值：
 *	        引用地址，引用的值，如果被改变，原来引用的的值所引用的值也会被改变，
 */

import java.util.Arrays;

public class V07 {
    public static void main(String[] args) {
        int a =10;
        int[] arr = {1,2,3,4,5,6};
        System.out.println(arr);
        change(a,arr);
        System.out.println(a);// 10
        System.out.println(Arrays.toString(arr));//[0,0,0,0,0,0]  [1,2,3,4,5,6]

    }

    public static void  change(int t,int[] arr){
        System.out.println(arr);
        //改变 变量 a的值
        t=100;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=0;
        }

    }
}
