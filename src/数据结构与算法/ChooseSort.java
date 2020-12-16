package 数据结构与算法;

import java.util.Arrays;

/**
 *  选择排序 选取最小的一个依次比较
 * @author baihuanyu bwx966955
 * @date 2020/11/11 20:06
 */
public class ChooseSort {
    public static void main(String[] args) {
        int [] arr = new int[]{1,25,2,3,5,23,7,24,28};
        chooseSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void chooseSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            // 起始位置做标记
            int stand = i;
            for (int j = i+1; j <arr.length ; j++){
                if (arr[stand]>arr[j]){
                    stand = j;
                }
            }
            // 把值作为交换
            if (arr[stand] != arr[i]){
                int temp = arr[i];
                arr[i]=arr[stand];
                arr[stand] =temp;
            }
        }
    }
}
