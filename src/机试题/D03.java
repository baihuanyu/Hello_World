package 机试题;
/**3.	定一个求多个整数积的方法（使用可变参数）
 *
 * */
public class D03 {
    public static void main(String[] args) {
        int multiply = getMultiply(1, 2, 3, 4, 5,6);
        System.out.println(multiply);
    }

    public static int getMultiply(int ...items){
        int result = 1;
        for (int i : items) {
            result *= i ;
        }
        return result ;
    }
}
