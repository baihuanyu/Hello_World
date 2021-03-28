package Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  两个线程交替打印
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/12/20
 */
public class ExchangePrintByLock {
    static Thread t1,t2;
    static final Object o = new Object();
    public static void main(String[] args) {
        String s = "ABCDE";
        String s1 = "12345";
        ReentrantLock lock = new ReentrantLock();
        Condition c1 = lock.newCondition();
        Condition c2 = lock.newCondition();
        t1  = new Thread(() ->{
            for (int i = 0; i <s.length() ; i++) {

                    lock.lock();
                    System.out.print(s.charAt(i));
                    try {
                        c2.signal();
                        c1.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }
            }
        });
       t2  = new Thread(() ->{
            for (int i = 0; i <s1.length() ; i++) {
                    lock.lock();
                    System.out.print(s1.charAt(i));
                    try {
                        c1.signal();
                        c2.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }
                }
        });
       t1.start();
       t2.start();
    }
}
