package day15thread.模拟购票窗口.乐观锁;

/**
 * 测试类
 * */

class SaleTicketThreadTest {
    public static void main(String[] args) {
        SaleTicketThread a = new SaleTicketThread("A");
        SaleTicketThread b = new SaleTicketThread("B");
        SaleTicketThread c = new SaleTicketThread("C");
        a.start();
        b.start();
        c.start();
        System.out.println("------------------------");
        SaleTicketThreadRunnableImpl ticket = new SaleTicketThreadRunnableImpl();
        Thread q = new Thread(ticket, "Q");
        Thread w = new Thread(ticket, "W");
        Thread e = new Thread(ticket, "E");
        q.start();
        w.start();
        e.start();
    }
}