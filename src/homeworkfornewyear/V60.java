package homeworkfornewyear;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 数组arr1: “1,7,9,11,13,15,17,19”;
 *  	数组arr2:”2,4,6,8,10”
 * 两个数组合并之后数组arr，在按照升序排列;
 * */
public class V60 {

    public static void main(String[] args) {
        int [] arr1={1,7,9,11,13,15,17,19};
        int [] arr2 ={2,4,6,8,10};
        System.out.println(Arrays.toString(V60.mergeAndSort2(arr1,arr2)));
        int [] arr = new int[arr1.length+arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr[arr.length-i-1]=arr2[i];
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static int[] mergeAndSort(int[] arr1,int[] arr2){
        //判断合理性
        if (arr1 == null ||arr2==null) {
            return null;
        }
        //创建新数组进行扩容  Arrays.copyof（原数组，新数组长度）
        //System.arraycopy(原数组，原数组开始下标，新数组，新数组长度)
        int[] newArr = Arrays.copyOf(arr1, arr2.length+arr1.length);
        for (int i = 0; i <arr2.length ; i++) {
            newArr[arr1.length+i] = arr2[i];//将数组二值给到新数组里面
        }
        Arrays.sort(newArr);
        return newArr;
    }
    public static int[] mergeAndSort2(int[] arr1,int[] arr2){
        //判断合理性
        if (arr1 == null ||arr2==null) {
            return null;
        }
        //创建新数组进行扩容  Arrays.copyof（原数组，新数组长度）
        //System.arraycopy(原数组，原数组开始下标，新数组，新数组长度)
        int[] newArr = Arrays.copyOf(arr1,arr1.length+arr2.length);
        // 将指定数组的指定索引开始 复制到新的数组
        //               需要复制的数组，开始的索引 ，新的数组，新的数组开始的索引，长度
        //省略了for循环遍历
        System.arraycopy(arr2,0,newArr,arr1.length,arr2.length);
        Arrays.sort(newArr);
        return newArr;
    }

}
