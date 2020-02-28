package day13review;
/**
 * 2.设计一个方法,传入一个int的一维数组,返回该数组中最大的值;
 * */
public class Test02 {
    public static int finMax(int[] arr){
        int max = arr[0];//假设第一项就是最大的
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }
}
