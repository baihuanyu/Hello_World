package Thread;

import java.util.concurrent.CountDownLatch;

/**
 *  两个线程交替打印
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/12/20
 */
public class ExchangePrintCAS {
    static Thread t1 ,t2 ;
    enum ready {T1,T2}
    static volatile ready r = ready.T1;
    public static void main(String[] args) throws InterruptedException {
        String s = "ABCDE";
        String s1 = "12345";
        CountDownLatch latch = new CountDownLatch(s.length() + s1.length());
        t1  = new Thread(() ->{
            for (int i = 0; i <s.length() ; i++) {
              while (r != ready.T1){}
                  System.out.print(s.charAt(i));
                  r =ready.T2;
                  latch.countDown();

            }
        });
       t2  = new Thread(() ->{
            for (int i = 0; i <s1.length() ; i++) {
                while (r != ready.T2){}
                    System.out.print(s1.charAt(i));
                    r =ready.T1;
                    latch.countDown();
                }
        });
       t1.start();
       t2.start();
       latch. await();
        System.out.println(" 程序结束");
    }
}
