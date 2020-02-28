package day13review;

import java.util.Arrays;

/**
 *3.设计一个方法,翻转传入数组中的元素
 *
 * */

public class Test03 {
    public  static void arrReverse(int[] arr){
        for (int i = 0; i <arr.length/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1];
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static Object [] aR(Object[] obj){
        Object[] newObj = new Object[obj.length];
        int i = obj.length-1;
        for (int j = 0; j <obj.length ; j++,i--) {
            newObj[i] = obj[j];
        }
        return newObj;
    }

    public static void main(String[] args) {
        Object[] arr = {1,3,4,5,6};
        System.out.println(Arrays.toString(Test03.aR(arr)));
    }
}
