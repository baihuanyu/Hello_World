package 数据结构与算法;

import java.util.Arrays;

/**
 *  选择排序之冒泡排序
 * @author : 白桓宇  522858867@qq.com
 * @date : 2020/11/9
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,5,1,7,34,3,7,71,24,33};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        // 第一次控制需要进行多少轮
        for (int i = 0; i <arr.length-1 ; i++) {
            // 进行比较 如果 前面的比后面的大 那么就交换位置
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
}
