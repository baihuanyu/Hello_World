package homeworkfornewyear;

import java.util.Scanner;

public class V55 {
    public static void main(String[] args) {
        double sum = 0;//用来将每个阶乘的值相加
        double num = 1.0;//用于求每个阶乘的值
        for(int i=1;i<=12;i++){
            num *= i;
            sum += num;
        }
        System.out.println("阶乘之和为 :" + sum);

    }

    }


