package day06array;

import java.util.Arrays;

public class ErFen {
        // 二分搜索： binarySearch
    public static void main(String[] args) {
        int [] arr = {1,2,11,23,3,4,5,6,7,8,9};
        search(1,arr);
        System.out.println(Arrays.binarySearch(arr,5));
        System.out.println(Arrays.toString(arr));
    }

    public static void search(int x ,int [] arr){
        //先对数组进行排序
        Arrays.sort(arr);

       //创建最小索引,中间索引，最大索引；
        int min = 0;
        int max = arr.length-1;
        int mid =(min+ max)/2 ;

        while (min<=max) {
            if (arr[mid] == x) {
                System.out.println(x + "所在位置的索引在：" + mid);
                return ;
            } else if (x > arr[mid]) {
                min = mid+1;
            } else if (x<arr[mid]){
                max = mid-1;
            }
            mid = (min+max)/2;
        }
        System.out.println("无法匹配。");
    }
}
