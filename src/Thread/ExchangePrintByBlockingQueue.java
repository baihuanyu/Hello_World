package Thread;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *  两个线程交替打印
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/12/20
 */
public class ExchangePrintByBlockingQueue {
    static Thread t1,t2;
   static BlockingQueue<String> q1 = new ArrayBlockingQueue<>(1);
   static BlockingQueue<String> q2 = new ArrayBlockingQueue<>(1);
    public static void main(String[] args) {
        String s = "ABCDE";
        String s1 = "12345";
       t1  = new Thread(() ->{
            for (int i = 0; i <s.length() ; i++) {
               System.out.print(s.charAt(i));
                try {
                    q1.put("ok");
                    q2.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
       t2  = new Thread(() ->{
            for (int i = 0; i <s1.length() ; i++) {
                try {
                    q1.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(s1.charAt(i));
                try {
                    q2.put("ok");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
       t1.start();
       t2.start();
    }
}
