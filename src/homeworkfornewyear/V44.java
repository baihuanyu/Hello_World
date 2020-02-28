package homeworkfornewyear;

import java.util.Arrays;

/*有数组arr[n]，用java 代码将数组中元素顺序翻转*/
public class V44 {
    public static void main(String[] args) {
        V44.fanZhuanArr(3);

    }
    public static void fanZhuanArr(int n){
        int[] arr = new int[n];
        for (int i = 0; i <arr.length/2 ; i++) {
            int temp;
            temp = arr[i];
            arr[i]=arr[arr.length-1];
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
