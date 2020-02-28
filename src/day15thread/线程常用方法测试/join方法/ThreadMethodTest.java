package day15thread.线程常用方法测试.join方法;

public class ThreadMethodTest {
    public static void main(String[] args) {

   /* 1. 构造方法：
   	Thread() 创建一个新的 Thread对象。
    Thread(String name) 创建一个新的有指定线程名的 Thread对象。
    Thread(Runnable target)  将Runnable业务类对象作为参数，创建一个新的 Thread对象。
    Thread(Runnable target, String name) 将Runnable业务类对象作为参数，
    创建一个新的有指定线程名的 Thread对象。
    */
        Thread dog = new Thread("dog");//给线程名字
        // 用runnable实现类创建线程并且命名
        DemoThreadImpl demoThread = new DemoThreadImpl();
        Thread ableDog = new Thread(demoThread, "ableDog");
//      ----------------------- 普通方法-------------------
//        1. static Thread currentThread() 返回对当前正在执行的线程对象的引用。
        Thread mainThread = Thread.currentThread();//当前是main线程
        System.out.println(mainThread);
//        2. String getName() 返回此线程的名称。
        String dogName = dog.getName();
        System.out.println(dogName);
//        3. void setName(String name) 设置线程对象的名字
        ableDog.setName("ableThread");
        System.out.println(ableDog.getName());
//        4. void setPriority(int newPriority)   设置线程对象的优先级
//        5. int getPriority()  获取线程的优先级

//        1-10，越大优先级越高，执行越早，越小就执行越晚（1-10，5默认）
//        5是默认优先级。
//        当前线程的优先级与创建线程对象的环境的优先级一致
//
//        6. boolean isDaemon() 判断这个线程是否是守护线程。  GC是守护线程
//                一个线程的默认状态和创建它的环境线程状态一致
        boolean daemon = dog.isDaemon();
        System.out.println("是否是守护线程："+daemon);
//
//        7. void setDaemon(boolean on) 将当前线程设置为守护线程
//                活跃的线程不能设置为守护线程

//
//        8. void join() 等待join线程执行完后，再执行当前线程
//        9. void join(long millis)等待join线程线程死亡最多 millis毫秒。
//        10. static void sleep(long millis)  阻塞当前线程指定的毫秒数后再执行
//        一般用来模拟网络延迟，可以做计时器，还可以做倒计时
//
//                以下在在多线程中常用
//        11. void interrupt() 中断这个线程。  在多线程中常用
//        12. static boolean interrupted() 测试当前线程是否中断。  在多线程中常用
//        13. boolean isAlive() 测试这个线程是否活着。
//        14. Thread.State getState() 返回此线程的状态。
        Thread.State state = ableDog.getState();//返回线程状态 返回值是enum
        System.out.println(state);
//        15. long getId() 返回此线程的标识符。

    }
}
