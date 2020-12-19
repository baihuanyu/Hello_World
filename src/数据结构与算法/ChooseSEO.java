package 数据结构与算法;

import java.util.Arrays;

/**
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/12/13
 */
public class ChooseSEO {
    public static void main(String[] args) {
        int[] arr = {5,4,7,3,2,8,9,1,6};
        chooseSEO(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void chooseSEO(int[] arr){
        for (int i = 0; i <(arr.length -1) ; i++) {
            int minVal = i;
            int maxVal = arr.length - i -1;
            for (int j = i+1; j <arr.length ; j++) {
                minVal = arr[j] < arr[minVal] ? j:minVal;
                maxVal = arr[j] > arr[maxVal] ? j : maxVal;
            }
//            for (int j = arr.length-1-i; j >=0 ; j--) {
//            }
            swap(arr,i,minVal);
            swap(arr,arr.length - i -1,maxVal);
        }
    }
    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
