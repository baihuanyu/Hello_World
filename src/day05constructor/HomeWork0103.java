package day05constructor;
/*
*
* 1.	使用for循环计算1-10的积
2.	求出100以内前5个3的倍数的数字。（请使用for 并且结合break 实现）
3.	提示：前5个，当统计个数的计数器到5的时候就break
4.	计算  1！ + 2！ + 。。。10！ 1到10的阶乘和
5.	定义一个方法getMax，接收两个int参数，返回较大的一个数。
6.	定义一个方法，接受三个int参数，返回最小的一个数。
7.	设计一个方法求多个整数积的方法(提示：定义一个方法，方法的参数是 int 数组，参考求多个整数和的示例)
8.	总结你对方法参数传递 值传递  和 引用传递  的理解
*/
public class HomeWork0103 {
    public static void main(String[] args) {

        //1.使用for循环计算1-10的积
        int accumulate1 = 1;
        for (int i =1 ;i<=10;i++){
            accumulate1 *=i;
        }
        System.out.println(accumulate1);
        //2.求出100以内前5个3的倍数的数字。（请使用for 并且结合break 实现）
        int count =1;
        int accumulate2 = 1;
        for (int i =1;i<101;i++){
            if (i%3==0){//判断3的倍数
                accumulate2 *=i;
                count++;//次数++
                if (count ==5){
                    break;
                }
            }
        }
        System.out.println(accumulate2);
        System.out.println(count);
        //3.计算  1！ + 2！ + 。。。10！ 1到10的阶乘和
        int sum=0;
        for (int i=1;i<3;i++){
            int accumulate3 =1;
            for (int j=1;j<=i;j++){
                accumulate3 *= j;
            }
                sum +=accumulate3;
        }
        System.out.println(sum);
        int [] arr={1,2,3,4,5,6};
        System.out.println(accumulate(arr));
    }
        //4.定义一个方法getMax，接收两个int参数，返回较大的一个数。
        public static int compareBig(int a,int b){
            return a>b?a:b;
        }
        //5.定义一个方法，接受三个int参数，返回最小的一个数
        public  static int compareSmall(int a , int b , int c){
            return (a>b?(a>c?a:c):(b>c?b:c));
        }
        //6.设计一个方法求多个整数积的方法(提示：定义一个方法，方法的参数是 int 数组，参考求多个整数和的示例)
        public static int accumulate(int [] arr){
            int accumulate6 =1;
            for (int i=0;i<arr.length;i++){
                accumulate6 *=arr[i];
            }
            return accumulate6;
            }
        //8.	总结你对方法参数传递 值传递  和 引用传递  的理解
            /*
            * 值传递： 将值传递过去，修改不会影响本身的值，
            *
            * 引用传递： 即把自己本体传递过去，修改会影响本身。
            *
            * */
}

