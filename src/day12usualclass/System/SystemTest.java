package day12usualclass.System;

import java.util.Arrays;

public class SystemTest {
    public static void main(String[] args) {

    /**                       源数组        开始索引      目标数组     目标数组开始下标   复制的个数
     * static void	arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
     *              将指定源数组中的数组从指定位置复制到目标数组的指定位置。
     *
     * static long	currentTimeMillis()
     *              返回当前时间（以毫秒为单位）。
     *              程序开始一个  结束一个
     *
     *static void	exit(int status) 了解   填写非0的数
     *              终止当前运行的Java虚拟机。
     *
     * static void	gc()了解    回收堆中的匿名对象 使用的时候 程序会停止
     *              运行垃圾回收器。
     * */
        long time = System.currentTimeMillis();
        //开始的时间
        System.out.println(time);
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};
        int[] newArr = Arrays.copyOf(arr1,arr1.length+arr2.length);
        System.arraycopy(arr2,0,newArr,arr1.length,arr2.length);
        System.out.println(Arrays.toString(newArr));
        long end = System.currentTimeMillis();
        System.out.println("程序运行的时间："+(end-time)+"毫秒");


    }
}
