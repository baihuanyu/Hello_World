package day06array.codePractice;

import java.util.Arrays;

public class V08 {
    public static void main(String[] args) {
        char[] arr = {'源','代','码','教','育'};
        reverse(arr);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }

   /*  6.设计一个方法,翻转传入数组中的元素
    例如有这样的数组 char[] arr = {'源','代','码','教','育'};
    调用完上面的方法之后，arr中的内容是这样的{'育','教','码','代','源'}*/
   public static void reverse(char [] arr){
       for (int i = 0; i <arr.length/2 ; i++) {
           char temp = arr[i];
                arr[i] = arr[arr.length-i-1];
                arr[arr.length-i-1] = temp;
       }
   }

}
