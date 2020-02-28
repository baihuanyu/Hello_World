package day04ifwhileswitchfor;
/*
1.	求出10以内2的倍数的数字 和 个数。
        2.	求出 1-10的所有偶数的和
*/

public class Practice01 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int num = 0;
        while(i < 11){
            if (i%2==0){
                sum += i;
                num++;
            }
            i++;
        }
        System.out.println("1-10的偶数的和是:"+sum);
        System.out.println("1-10的偶数个数有："+num);
    }
}
