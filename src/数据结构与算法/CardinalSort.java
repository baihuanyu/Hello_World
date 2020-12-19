import java.util.Arrays;

/**
 *  基数排序
 *   即是 先比较个位 放在容器里 在取出来 比较十位 放在容器里
 *    比较的次数就是这个数组里面最大数的位数
 * @author baihuanyu bwx966955
 * @date 2020/11/13 14:58
 */
public class CardinalSort {
    public static void main(String[] args) {
        int []arr = new int[]{2,213,3,793,3243,12,32,6485,325,324,532,123,643,67,7,54,76,9,765,34,12,87};
        cardinalSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cardinalSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        // 拿到长度
        int maxLength = (max+"").length();
        // 排序次数 每次拿到对应的数 比如个位 10位
        for (int i = 0 , n =1; i <maxLength ; i++ ,n*=10) {
            // 声明一个二维数组来存选出来的数
            int[][] tmp = new int[10][arr.length];
            // 声明一个数组来记录装了几个
            int[] counts = new int[arr.length];
            // 循环遍历数组元素
            for (int j = 0; j < arr.length; j++) {
                int ys = arr[j]/n%10;
                //把这个数装入对应的二维数组中
                tmp[ys][counts[ys]] = arr[j];
                counts[ys]++;
            }
            // 在取出来放回原来的数组
            int index = 0;
            for (int j = 0; j < arr.length; j++) {
                if (counts[j] !=0 ){
                    for (int k = 0; k < counts[j]; k++) {
                        arr[index] =tmp[j][k] ;
                        index++;
                    }
                }
            }
            // 清空记录坐标的数组
            Arrays.fill(counts, 0);
        }
    }
}
