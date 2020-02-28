package day15thread.模拟购票窗口.悲观锁;

/**
 * runnable接口实现类的测试类
 * */
public class SaleTicketRunnableImplTest {
    public static void main(String[] args) {
        // 创建对象
        SaleTicketThreadRunnableImpl ticket = new SaleTicketThreadRunnableImpl();
        //获取实例线程
        Thread one = new Thread(ticket, "一号");
        Thread two = new Thread(ticket, "二号");
        Thread three = new Thread(ticket, "三号");
        //启动线程
        one.start();
        two.start();
        three.start();
    }

}
