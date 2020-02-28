package day06array;

import java.util.Arrays;

public class Practice02 {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(print(arr));
        System.out.println(Arrays.toString(arr));
    }




    //声明一个方法来打印数组: 写出来的方法就是： System.out.println(Arrays.toString(arr));
     public static String print(int[] arr){
         String s="";
         for (int i = 0; i <arr.length ; i++) {
             if (i==arr.length-1){
                 s+=arr[i];
             }else{
                s+=(arr[i]+",");
             }
         }
         return "["+s+"]";
     }


}
