package day15thread.音乐线程案例;
/**3. 使用
 *			语法：
 *				1. 继承Thread类
 *					步骤：
 *					1. 写一个线程类XxxThread extends Thread类
 *					2. 重写run()方法（该方法是业务方法，启动线程后，会自动执行该方法）
 *					3. 写一个测试类，在测试类中创建线程对象，调用对象的start()启动线程
 *
 *				2. 实现Runnable接口
 *					1. 写一个实现业务类XxxRunnableImpl implements Runnable接口
 *					2. 重写run()方法（该方法是业务方法，启动线程后，会自动执行该方法）
 *					3. 写一个测试类，在测试类中
 *						先创建业务类对象
 *						再创建线程对象，并且将业务类对象作为参数传入线程的构造方法中，调用线程对象的start()启动线程
 *
 *			怎么选择	：
 *				以后都用实现的方式，因为Java中单继承多实现，实现的扩展性强
 *
 *		4. 注意：
 *			1. 只有继承Thread类的才是线程类
 *
 *		5. Thread中常用方法：
 *			1. 构造方法：
 *					Thread() 创建一个新的 Thread对象。
                    Thread(String name) 创建一个新的有指定线程名的 Thread对象。
                    Thread(Runnable target)  将Runnable业务类对象作为参数，创建一个新的 Thread对象。
                    Thread(Runnable target, String name) 将Runnable业务类对象作为参数，创建一个新的有指定线程名的 Thread对象。
 *
 *			2. 普通方法：
 *					1. static Thread currentThread() 返回对当前正在执行的线程对象的引用。
                   2. String getName() 返回此线程的名称。
                   3. void setName(String name) 设置线程对象的名字
                   4. void setPriority(int newPriority)   设置线程对象的优先级
                   5. int getPriority()  获取线程的优先级
                   1-10，越大优先级越高，执行越早，越小就执行越晚（1-10，5默认）
 5是默认优先级。
 当前线程的优先级与创建线程对象的环境的优先级一致

 6. boolean isDaemon() 判断这个线程是否是守护线程。  GC是守护线程
 一个线程的默认状态和创建它的环境线程状态一致

 7. void setDaemon(boolean on) 将当前线程设置为守护线程
 活跃的线程不能设置为守护线程

 8. void join() 等待join线程执行完后，再执行当前线程
 9. void join(long millis)等待join线程线程死亡最多 millis毫秒。
 10. static void sleep(long millis)  阻塞当前线程指定的毫秒数后再执行
 一般用来模拟网络延迟，可以做计时器，还可以做倒计时

 以下在在多线程中常用
 11. void interrupt() 中断这个线程。  在多线程中常用
 12. static boolean interrupted() 测试当前线程是否中断。  在多线程中常用
 13. boolean isAlive() 测试这个线程是否活着。
 14. Thread.State getState() 返回此线程的状态。
 15. long getId() 返回此线程的标识符。
 *
 *
 * */
public class ThreadTest {
    public static void main(String[] args) {
       /**
        * 创建线程的方法一：
        *           1. 继承Thread类
        *  *					步骤：
        *  *					1. 写一个线程类XxxThread extends Thread类
        *  *					2. 重写run()方法（该方法是业务方法，启动线程后，会自动执行该方法）
        *  *					3. 写一个测试类，在测试类中创建线程对象，调用对象的start()启动线程
        * */
        DownloadThread downloadThread = new DownloadThread();
        downloadThread.start();//线程启动要用start
        MusicThread musicThread = new MusicThread();
        musicThread.start();//线程执行看时间片 栈内存是独立的 谁抢到执行谁
        System.out.println("------------分割线------------");
        /**
         * 方法二： 扩展性更好
         *				2. 实现Runnable接口
         *					1. 写一个实现业务类XxxRunnableImpl implements Runnable接口
         *					2. 重写run()方法（该方法是业务方法，启动线程后，会自动执行该方法）
         *					3. 写一个测试类，在测试类中
         *
         * */
        //第一步创建业务类对象
        MusicThreadImpl musicThread1 = new MusicThreadImpl();
        DownloadThreadImpl downloadThread1 = new DownloadThreadImpl();
        //第二步业务类对应的线程类对象
        Thread mt = new Thread(musicThread1);
        Thread dt = new Thread(downloadThread1);
        // 调用线程方法启动
        mt.start();
        dt.start();
    }
}
