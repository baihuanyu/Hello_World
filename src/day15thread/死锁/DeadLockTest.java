package day15thread.死锁;

/**
 * 死锁测试类
 * */

class DeadLockTest {
    public static void main(String[] args) {
        DeadLock c = new DeadLock(true);
        DeadLock m= new DeadLock(false);
        Thread c1 = new Thread(c);
        Thread m1 = new Thread(m);
        c1.start();
        m1.start();

    }

}