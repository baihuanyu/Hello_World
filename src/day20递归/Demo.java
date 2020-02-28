package day20递归;
/**
 * 自己调用自己 
 *  斐波那契数列
 *  重第三项开始 每一项的值是前两项的和
 * */
public class Demo {
    public static void main(String[] args) {
        int f = f(20);
        System.out.println(f);


    }
    public static int f(int num){
        if (num < 0) {
            throw new IllegalArgumentException("不能小于0");
        }else if (num == 0 ||num ==1){
            return num ;
        }else {

            return f(num-1)+f(num-2);
        }
    }
}
