package day05constructor.codePractice;

public class V05 {
    public static void main(String[] args) {
        //求两个整形的和
        int k = 100;
        int n = 56283;
        //调用方式一：
        add(n,k);
        //求三个数的和 3 5 8
        //1 先求两个数的和
        // 2.将两个数的和 再和 第三个数相加
        /*
         * add2方法有返回值类型，返回值的用法
         * 	1.直接打印-- System.out.println(add2(3,5));
         *  2.使用变量接收
         */
        //直接打印方法的结果
        //System.out.println(add2(3,5));
        int sum =add2(3,5);
        System.out.println(sum);

        System.out.println(add2(sum,8));

    }
    //定义一个方法，求两个数的和
    /*形参-规定调用者需要传入的参数类型
     * 形参a  和 b 只能在当前的方法里面使用
     *
     */
    public static void add(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    /*
     * 1.返回值类型：用来约束方法执行以后返回的结果类型
     * 2.返回值类型，如果不是void 必须要return 语句
     * */
    public static int add2(int a,int b){
        int sum =a+b;
        //返回  数据 sum
        /*
         * 返回数据给调用者
         */
        return sum;
    }
}
