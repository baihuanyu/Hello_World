package homeworkfornewyear;
/**
 * java 实现杨辉三角
 *   第n行有n个数字.
 * 每一行的开始和结尾数字都为1.
 * 用二维数组表示就是a[i][0]=1;  a[i][j]=1(当i==j时)；
 *
 * 第n+1行的第i个数字等于第n行的i-1个数字加上第n行的i个数字。
 * 用二维数组表示就是 a[i+1][j]=a[i][j-1]+a[i][j];
 * */
public class V15 {
    public static void main(String[] args) {
        //定义了一个长度为10，高度为10的二维数组，数组中的值都为0；
        int[][] arr=new int[10][10];
        for(int i=0;i<arr.length; i++) {
            //由于只是给杨辉三角内的位置赋值，所以是j<=i
            for(int j=0;j<=i;j++) {
                //根据规律，使用if else 赋值
                if(j==0||j==i) {
                    arr[i][j]=1;
                }else {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
        /*由于只是输出杨辉三角范围内的值，所以在内层循环就输出，这种方法不能全部赋值完之后再输出
            "\t"的原因是10和小于10的数组的宽度不同，所以使用\t制表符能使数与数之间距离相等
        */
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

