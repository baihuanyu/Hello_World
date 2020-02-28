package 机试题;

import java.util.Arrays;

import static java.util.Arrays.*;

/**
 * 4.	现在给出两个数组，数组A: “1,7,9,11,13,15,17,19”;
 *     数组B:”2,4,6,8,10”，两个数组 合并之后数组C，在按照升序排列
 *
 * */
public class D04 {
    public static void main(String[] args) {
        int [] arr1 ={1,3,5,7,9};
        int [] arr2 = {2,4,6,8};
        int[] ints = sortTwoArr(arr1, arr2);
        System.out.println(Arrays.toString(ints));

    }
    public static int[] sortTwoArr(int[] arr1,int[] arr2 ){
        int[] newArr = copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2,0,newArr,arr1.length,arr2.length);
        Arrays.sort(newArr);
        return newArr ;
    }
}
