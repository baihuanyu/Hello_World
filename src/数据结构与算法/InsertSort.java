import java.util.Arrays;

/**
 *  插入排序 默认前面是有序的 然后拿后面的和前面的比较移动位置
 * @author baihuanyu bwx966955
 * @date 2020/11/11 19:05
 */
public class InsertSort {

    public static void main(String[] args) {
        int [] arr = new int[]{1,25,2,3,5,23,7,24,28};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] arr){
        // 遍历数组 第二个开始 默认第一个为有序的
        for (int i = 1; i < arr.length ; i++) {
            // 加入当前比前一个要小
            if (arr[i] <arr[i-1]){
                // 把当前给临时的
                int temp = arr[i];
                // 向前遍历
                int j ;
                for (j = i-1; j >=0 && arr[j]< temp ; j--) {
                    // 继续把前面的向后移
                    arr[j+1] = arr[j];
                }
                //  当不满足的时候 就把temp放在那个位置
                arr[j] = temp ;
            }
        }
    }
}
