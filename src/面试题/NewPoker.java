package 面试题;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 通过开关来发牌
 *
 * @author shirokansakai*/
public class NewPoker {
    public static void main(String[] args) {
        /*声明一个数组*/
        int[] arr = new int[52];
        /*声明一个计数器*/
        int count = 0;
        /*当数组还没满的时候*/
        while (count<52){
            /*声明一个开关*/
            boolean flg = true;
            /*生成随机数*/
            ThreadLocalRandom current = ThreadLocalRandom.current();
            int random = current.nextInt(1, 53);
            /*遍历数组*/
            for (int i = 0; i <count ; i++) {
                if (arr[i]==random){
                    flg = false;
                    break;
                }
            }
            if (flg){
                arr[count] = random;
                count++;
            }
        }
    }
}
