package 面试题;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 随机生成1-52 分别插入一个数组中
 * */
public class Poker {
    public static void main(String[] args) {
        int[] arr = new int[52];
        /*获取随机数生成方式*/
        ThreadLocalRandom current = ThreadLocalRandom.current();
        //循环遍历
        for(int i =0;i< arr.length;i++){
            arr[i] = current.nextInt(1,53);
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    /*如果出现重复 则重新生成 将i退档*/
                    i--;
                    break;
                }
            }
        }
       
        System.out.println(Arrays.toString(arr));

    }


    }
