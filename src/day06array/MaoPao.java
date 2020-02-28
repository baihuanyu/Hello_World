package day06array;

import java.util.Arrays;

public class MaoPao {
    public static void main(String[] args) {

        int [] arr = {55,11,33,66,23,213,567,25,89,12};
        for (int i = 0,k=arr.length; i <k ; i++) { //把length写在初始条件，避免每次都去读取length的值
            for (int j = 0; j <arr.length-1; j++) {

                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
