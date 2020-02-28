package day15thread.模拟购票窗口.乐观锁;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 继承方式的多线程 实现锁
 *
 * */
public class SaleTicketThread extends Thread {
    /**共享的票数*/
    private static int num = 50;
    /**创建一个锁 , 继承要创建三个对象 所以用static修饰， lock便是一个常量*/
    private static final ReentrantLock LOCK =new ReentrantLock();

    public SaleTicketThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (num>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            saleOne();
        }
    }

    public static void saleOne(){
        //获取当前线程的名字
        String name = Thread.currentThread().getName();
        //卖票
        LOCK.lock();//上锁
        try {//有线程数据安全的语句块
            if (num >0) {
                System.out.println(name + "出票" + num);
                num--;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            LOCK.unlock();//释放锁
        }


    }
}
