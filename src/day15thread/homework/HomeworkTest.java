package day15thread.homework;
/**
 * 所有抢豆子方法的测试类
 * */
public class HomeworkTest {
    public static void main(String[] args) {
       /* RobBeansThread robBeansThread1 = new RobBeansThread("男一号");
        RobBeansThread robBeansThread2 = new RobBeansThread("女一号");
        robBeansThread1.start();
        robBeansThread2.start();*/

//        RobBeansThreadRunnaleImpl robBeansThreadRunnale = new RobBeansThreadRunnaleImpl();
//        Thread t1 = new Thread(robBeansThreadRunnale, "男二号");
//        Thread t2 = new Thread(robBeansThreadRunnale, "女二号");
//        t1.start();
//        t2.start();
        RobBeansThreadRunnaleLockImpl robBeansThreadRunnaleLock = new RobBeansThreadRunnaleLockImpl();
        Thread thread1 = new Thread(robBeansThreadRunnaleLock, "男三号");
        Thread thread2 = new Thread(robBeansThreadRunnaleLock, "女三号");
        thread1.start();
        thread2.start();
    }

}
