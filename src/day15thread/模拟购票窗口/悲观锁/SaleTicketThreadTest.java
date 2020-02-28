package day15thread.模拟购票窗口.悲观锁;

/**
 *
 * 测试卖票类
 * */

class SaleTicketThreadTest {
    public static void main(String[] args) {
        //创建三个对象
        SaleTicketThread qiandd = new SaleTicketThread("钱多多");
        SaleTicketThread maomi = new SaleTicketThread("猫咪");
        SaleTicketThread bhy = new SaleTicketThread("白桓宇");

        //启动线程
        qiandd.start();
        maomi.start();
        bhy.start();
    }

}