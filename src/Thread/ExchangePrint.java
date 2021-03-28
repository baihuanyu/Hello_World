package Thread;
/**
 *  两个线程交替打印
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/12/20
 */
public class ExchangePrint {
    static Thread t1,t2;
    static final Object o = new Object();
    public static void main(String[] args) {
        String s = "ABCDE";
        String s1 = "12345";
       t1  = new Thread(() ->{
            for (int i = 0; i <s.length() ; i++) {
                synchronized (o){
                    o.notify();
                    System.out.print(s.charAt(i));
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    o.notify(); // 确保程序解释 不让线程在等待
                }
            }
        });
       t2  = new Thread(() ->{
            for (int i = 0; i <s1.length() ; i++) {
                synchronized (o){
                    o.notify();
                    System.out.print(s1.charAt(i));
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
       t1.start();
       t2.start();
    }
}
