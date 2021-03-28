package 数据结构与算法;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 大于5的素数 要么在6的左边 有么在6的右边
 *
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/12/18
 */
public class 一万内的素数 {
    static volatile int num = 12;
    static volatile List<Integer> list;
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(4);
        list = new CopyOnWriteArrayList<>(Arrays.asList(2, 3, 5, 7));
        ExecutorService pool = Executors.newFixedThreadPool(4);
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 4; i++) {
            pool.execute(new Thread(() -> getNum(list)));
        }
        pool.shutdown();
        System.out.println(System.currentTimeMillis());
        Thread.sleep(100);
        System.out.println("---------");
        System.out.println(list);
       // getNum(list);
    }

    private static synchronized   void getNum(List<Integer> list) {
        while (num < 10000) {
            int k = num - 1;
            int j = num + 1;
            if (k % 5 != 0 && k % 7 != 0) {
                list.add(k);
            }
            if (j % 5 != 0 && j % 7 != 0) {
                list.add(j);
            }
            num += 6;
        }
    }
}
