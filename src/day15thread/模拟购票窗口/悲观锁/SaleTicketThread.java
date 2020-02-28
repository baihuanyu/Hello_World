package day15thread.模拟购票窗口.悲观锁;
/**
 * 模拟一个卖票
 * */
public class SaleTicketThread extends Thread {
    //票数 是公共的
    private static int num = 50;
    //有参构造 用于创建线程时取名
    public SaleTicketThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        //当票大于0的时候 一直卖票
        //涉及线程安全 当1号进去卖票的时候 二号三号可能也会进去  所以要使用线程同步
        while (num>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            saleTicket();
        }

    }
   /**
    * 卖票的方法 同步监听方法一 （方法体用关键字synchronized）
    方法不加static 同步的就是this 那么几个对象 就同步几个 没有共享数据
    一般情况下不会在extend的情况下使用 这样会添加static
    */
    public static synchronized void saleTicket(){
        //获取当前线程的名字
        String name = Thread.currentThread().getName();
        //判断票为0的时候 线程无法进入
        if (num >0) {
            System.out.println(name+"出票"+num);
            num--;
        }
    }
}
