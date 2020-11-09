package 数据结构与算法;

import java.util.Arrays;

/**
 *  选择排序之 快速排序
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/11/9
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {1,25,2,4,6,21,74,3,4,6};
        quickSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr , int start ,int end){
        // 保证 开始和解释不相等在排序
        if (start > end ){
            int temp = end;
            end = start;
            start = temp ;
        }
      if (start<end){
          // 选取标准数 一般为第一个数
          int stand = arr[start] ;
          // 记录坐标 最左边的指针 和最右边的指针
          int low = start;
          int high = end ;
          // 当两者不想的的适合
          while (low<high){
              // 先比较高的那边 如果 高的比基准数大 那么指针 就往左边移一个
              while (low<high && stand <= arr[high]){
                  high--;
              }
              // 如果高的比标准数小， 那么就替换到低的那边的指针的第一个数
              arr[low] = arr[high];
              // 此时移动左边的 小的 比标准数小 那么指针向前移动一个
              while (low<high && arr[low]<=stand){
                  low++;
              }
              // 如果左边的比标准数大 那么就把右边的指针的数替换
              arr[high] = arr[low];
          }
          // 最后把标准数赋到指针重合的地方
          arr[low] = stand;
          // 完事之后继续对两个数组进行排序
          quickSort(arr,start,low);
          quickSort(arr,low+1,end);
      }
    }
}
