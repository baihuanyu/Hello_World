package day15thread.死锁;
/**
 * 线程死锁
 * */
public class DeadLock implements Runnable{
    /**创建一个中国人锁*/
    public static Object obj1 = new Object();
    /**创建一个美国人锁*/
    public static Object obj2 = new Object();
    /**创建一个判断条件*/
    boolean flag ;

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        //如果是true  中国人     false  美国人
        if(flag){

            synchronized (obj1) {
                System.out.println("一根筷子");
                synchronized (obj2) {
                    System.out.println("一把叉");
                }
            }
        }else{
            synchronized (obj2) {
                System.out.println("一把刀");
                synchronized (obj1) {
                    System.out.println("一根筷子");
                }
            }
        }

    }
}
