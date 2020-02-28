package day04ifwhileswitchfor;

import java.util.Scanner;

public class IfInputScore {
    public static void main(String[] args) {
        while(true) {
            System.out.println("请输入你的成绩：");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num >= 90 && num <=100) {
                System.out.println("优秀");
            } else if (num >= 80 && num < 90) {
                      System.out.println("良好");
            } else if (num >= 70 && num < 80) {
                System.out.println("中等");
            } else if (num >= 60 && num < 70) {
                System.out.println("差等");
            } else if (num < 60) {
                System.out.println("不及格");
            } else {
                System.out.println("非法成绩");
                break;
            }
        }
        System.out.println("退出系统");
    }
}
