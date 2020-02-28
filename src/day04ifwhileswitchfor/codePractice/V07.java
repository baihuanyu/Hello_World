package day04ifwhileswitchfor.codePractice;

public class V07 {
    public static void main(String[] args) {
        //练习
        int i = 1;
        //定义一个变量用来求和
        int sum = 0;
        while (i <= 10) {
            //sum=sum+i;
			/*
			sum+=i;
			i++;
			*/
            //继续优化
            sum += i++;
        }
        //循环结束以后 打印累加的结果
        System.out.println(sum);
    }
}
