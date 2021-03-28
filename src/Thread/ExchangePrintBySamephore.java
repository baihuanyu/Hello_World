package Thread;

import java.util.concurrent.Semaphore;

/**
 *  两个线程交替打印
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/12/20
 */
public class ExchangePrintBySamephore {
    static Thread t1,t2;
    static final Object o = new Object();
    public static void main(String[] args) {
        String s = "ABCDE";
        String s1 = "12345";
        Semaphore semaphore = new Semaphore(1, true);
        t1  = new Thread(() ->{
            for (int i = 0; i <s.length() ; i++) {
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(s.charAt(i));
                   semaphore.release();
            }
        });
       t2  = new Thread(() ->{
            for (int i = 0; i <s1.length() ; i++) {
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(s1.charAt(i));
                 semaphore.release();
            }
        });
       t1.start();
       t2.start();
    }
}
