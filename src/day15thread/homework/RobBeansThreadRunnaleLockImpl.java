package day15thread.homework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 实现类接口抢豆子  使用锁
 *
 * @author shirokansakai
 * */
public class RobBeansThreadRunnaleLockImpl implements Runnable {
    /**设定一个豆子*/
    private int num = 200 ;
    /**创建一个锁*/
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            getBean();
        }
    }
    public void getBean(){
        //获取线程名字
        String name = Thread.currentThread().getName();
        lock.lock();
        try {
            if (num > 0 ) {
                System.out.println(name+"抢了第"+num-- +"个豆子");
            }
        }finally {
            lock.unlock();
        }
    }

}
