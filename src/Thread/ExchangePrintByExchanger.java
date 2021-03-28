package Thread;

import java.util.concurrent.Exchanger;

/**
 *  两个线程交替打印
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/12/20
 */
public class ExchangePrintByExchanger {
    static Thread t1,t2;
    public static void main(String[] args) {
        Exchanger<Object> exchanger = new Exchanger<>();
        String s = "ABCDE";
        String s1 = "12345";
       t1  = new Thread(() ->{
            for (int i = 0; i <s.length() ; i++) {
                System.out.print(s.charAt(i));
                try {
                    exchanger.exchange("1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
       t2  = new Thread(() ->{
            for (int i = 0; i <s1.length() ; i++) {
                System.out.print(s1.charAt(i));
                try {
                    exchanger.exchange("2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
       t1.start();
       t2.start();
    }
}
