package day06array.codePractice;

public class V02 {
    public static void main(String[] args) {
        //数据类型[] 变量名 = new 数据类型[长度];   定义一个长度为18的空数组
        int[] arr = new int[18];
        //数组的放值：
        //ArrayIndexOutOfBoundsException
        arr[1]=100;
        arr[1]=110;

        //数组的取值
        System.out.println(arr[1]);

        int s =arr[0];
        System.out.println(s);

        //验证：
        String[] arrs=new String[5];
        System.out.println(arrs[0]);//null
        double[] arrd = new double[5];
        System.out.println(arrd[0]);//0.0
    }
}
