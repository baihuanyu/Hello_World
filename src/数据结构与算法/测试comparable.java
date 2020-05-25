package 数据结构与算法;

/**
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/5/11
 */
public class 测试comparable {
    /**
     *  <? extends T> 上界通配符
     *  <? super T> 下界通配符
     *  compareTo 大于0 即是降序
     * @param arr 数组
     * @param <Anytype> 任意类型
     * @return 返回最大值
     */
    public static <Anytype extends Comparable<? super Anytype>> Anytype findMax(Anytype [] arr){
        int max = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].compareTo(arr[max])>0){
                max=i;
            }
        }
        return arr[max] ;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,9};
        Integer max = findMax(arr);
        System.out.println(max);
    }
}
