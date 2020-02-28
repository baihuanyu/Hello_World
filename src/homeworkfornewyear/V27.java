package homeworkfornewyear;
/*
将int[] arr = ｛22，11，44，8，2，80，77｝ 复制到新数组 newArr
        只复制 从第2个元素到第5个元素并且降序排列
        arraycopy(arr,1,newArr,0,4)
        11，44，8，2		reverse()		StringBuffer
*/


import java.util.Arrays;

import static java.util.Arrays.sort;

public class V27 {
    public static void main(String[] args) {
        int[] arr ={22,11,44,8,2,80,77};
        int[] arr1 = Arrays.copyOfRange(arr, 1, 5);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        StringBuilder sb = new StringBuilder();
        for (int i:arr1) {
            sb.append(i);
        }
        sb.reverse();

        int [] arr2 = new int[4];
        for (int i = 0 ;i<sb.length();i++){
            arr2[i]=sb.charAt(i);
        }
        System.out.println(Arrays.toString(arr2));
    }
}
