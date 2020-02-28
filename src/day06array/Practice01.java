package day06array;

import java.util.Arrays;

public class Practice01 {
    public static void main(String[] args) {
        //定义一个数组[89,99,65,35,69,66,77,98,88,67]
        // 统计在 0- 60 60-80 80-100之间的个数
        int [] arr={89,99,65,35,69,66,77,98,88,67};
        int count1=0;
        int count2=0;
        int count3=0;
        for (int i =0;i<arr.length;i++){

            if (arr[i]<=60){
                count1++;
            }else if (arr[i]<=80 & arr[i]>60){
                count2++;
            }else{
                count3++;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("小于等于60的个数是："+count1);
        System.out.println("在60到80之间的个数是："+count2);
        System.out.println("大于80的个数是："+count3);
        /*int [] arr2 = {1,2,3};
        System.out.println(arr2);*/

    }


}
