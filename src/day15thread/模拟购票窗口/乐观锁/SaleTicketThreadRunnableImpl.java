package day15thread.模拟购票窗口.乐观锁;

import java.util.concurrent.locks.ReentrantLock;

public class SaleTicketThreadRunnableImpl implements Runnable {
    /**继承实现类 共享数据可不加static 只创建了一个对象*/
    private int num = 50;
    /**创建锁*/
    ReentrantLock lock = new ReentrantLock();
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
    public void saleOne(){
        //获取线程名字
        String name = Thread.currentThread().getName();
        lock.lock();
        try {
            if (num>0) {
                System.out.println(name+"---->"+num--);
            }
        }finally {
            lock.unlock();
        }
    }
}
