package day15thread.homework;
/**
 * 敲： 1. 卖票案例： 1遍 2. 一共200个豆子，两个人一起抢，一次只能抢一个豆子，抢完为止
 * 设计：线程和测试类（注意线程安全问题） 并且用继承Thread和实现Runnable方式完成
 * 线程同步的3中方式：都使用 （扩展： 线程通信：小洁洁抢完一个后，小吕抢）
 * 了解的： 1.去了解死...
 *
 *
 * @author shirokansakai
 * */

public class RobBeansThread extends Thread{
    /**抢豆子的线程业务类*/
    /**豆子数量*/
    private static int num = 200;

    public RobBeansThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true){
            if (num > 0) {
                getBean();
            }
        }
    }
    public void getBean(){
        synchronized (this){
            if (num>0){
                System.out.println(getName()+"抢第"+num--+"豆子");
            }
        }
    }

}
