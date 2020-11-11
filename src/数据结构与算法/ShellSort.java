import java.util.Arrays;

/**
 *  希尔排序  把数组按照步长分为几组进行插入排序 步长 = length/2 直到 步长等于0
 * @author baihuanyu bwx966955
 * @date 2020/11/11 19:44
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,32,214,5,3,141,25,124,53,412,0,124,12,435,65,324,124,532,};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     *  第一步 确认 步长之后 已当前步长为起始 挨个往后遍历
     *  往后遍历的每个元素 减去步长 就是同组的前一个元素
     *  同组的前面元素可能有多个 所以一直减 直到大于等于0
     *  此时需要 拿前面的元素 与元素加上步长的元素作对比更换
     *  
     * @param arr
     */
    public static void shellSort(int[] arr){
        // 第一步 步长
        for (int i =arr.length/2 ; i >0 ; i /=2) {
            // 第二部 分组 遍历本组中的所有元素
            for (int j = i; j<arr.length ; j++) {
                // 第三步 本组里面的元素向前比较
                for (int k = j-i; k >=0 ; k -= i) {
                    if (arr[k]>arr[k+i]){
                        int temp = arr[k];
                        arr[k] = arr[k+i];
                        arr[k+i] = temp;
                    }
                }
            }
        }
    }
}
