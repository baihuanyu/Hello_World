import java.util.Arrays;

/**
 *  归并排序  分而治之的思想 先分开 在排序 把所有的数据分成两个另两个比较
 * @author baihuanyu bwx966955
 * @date 2020/11/12 20:11
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{20,23,53,123,5,45,12,36543,21,312,5,4,6,45};
        mergeSort(arr,0, arr.length-1);
       // merge(arr,0, 2, 7);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[]arr , int low , int high){
        int middle= (low + high) / 2 ;
        if (low < high){
            mergeSort(arr, low, middle);
            mergeSort(arr, middle+1, high);
            merge(arr,low,middle,high);
        }
    }

    public static void merge(int[] arr ,int low ,int middle , int high){
        int[] temp = new int[high-low+1];
        // 记录左边下标
        int i = low ;
        // 中间下标
        int j =middle+1;
        // 初始位置 用来存放选出来的值到新的数组中
        int index=0;
        // 遍历两边的元素
        while (i <=middle&&j <=high){
            if (arr[i]<=arr[j]){
                temp[index] = arr[i];
                i++;
                index++;
            }else {
                temp[index] =arr[j];
                j++;
                index++;
            }
        }
        // 当比较完了 如果有剩余的数据
        while (j<=high){
            temp[index] = arr[j];
            j++;
            index++;
        }
        while (i<=middle){
            temp[index] = arr[i];
            i++;
            index++;
        }
        // 最后把新数组替换旧数组
        for (int k = 0; k < temp.length; k++) {
            arr[k+low] =temp[k];
        }
    }
}
