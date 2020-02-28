package day13review;

import javax.swing.*;

/**
 * 打印1-500 6的倍数的前十个
 * */
public class TextNumberMultipleOf6 {
    public static void main(String[] args) {
        /**用于计数*/
        int count = 0;
        for (int i = 1; i <=500 ; i++) {
            if (i%6==0){
                System.out.println(i);
                count++;
                if (count == 10){
                    break;
                }
            }
        }
    }
}
