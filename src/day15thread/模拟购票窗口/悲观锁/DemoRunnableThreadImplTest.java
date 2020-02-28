package day15thread.模拟购票窗口.悲观锁;


class DemoRunnableThreadImplTest {
    public static void main(String[] args) {
        DemoRunnableThreadImpl ticket = new DemoRunnableThreadImpl();
        Thread a = new Thread(ticket, "A");
        Thread b = new Thread(ticket, "B");
        Thread c = new Thread(ticket, "C");
        a.start();
        b.start();
        c.start();
    }
}