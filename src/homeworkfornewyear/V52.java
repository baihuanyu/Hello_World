package homeworkfornewyear;
/**设计一个方法，获取数组中最小的元素的下标
*/
public class V52 {
    public static void main(String[] args) {
        int[] arr = {19,24,35,23,21,1,323,52};
        V52.getMin(arr);
    }

    public static void getMin(int[] arr){
        /**定义一个最小值,假设数组第一个值就是最小值*/
        int minValue = arr[0];
        /**定义一个最小值的索引*/
        int minIndex = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] <= minValue) {
                minValue = arr[i];
                minIndex = i ;
            }
        }
        System.out.println("数组的最小值是"+minValue+"其索引是"+minIndex);
    }
}
