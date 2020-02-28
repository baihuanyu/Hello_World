package day15thread.homework.线程通信;
/**测试类
 *
 * Java提供一种等待唤醒机制
 *
 *   		等待唤醒
 *   			wait()等待  当前对象的线程等
 *   			notify()唤醒单个线程 需要等待对象的线程去唤醒
 *   			notifyAll()唤醒所有等待的线程
 *
 *
 *   			wait和sleep区别？
 *   				wait等待需要被唤醒
 *   				sleep休眠，一定时间会自动醒来
 *
 *
 *
 * */
public class BeansTest {
    public static void main(String[] args) {
        Beans beans = new Beans();
        DemoImpl demo = new DemoImpl(beans);
        DTwoImpl dTwo = new DTwoImpl(beans);
        Thread t1 = new Thread(demo, "线程一");
        Thread t2 = new Thread(dTwo, "线程二");
        t1.start();
        t2.start();
    }

}
