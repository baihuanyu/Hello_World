package day15thread.模拟购票窗口.悲观锁;
/**
 * 用runnable 实现
 *
 * */
public class SaleTicketThreadRunnableImpl implements Runnable {
    /**
     * 票数
     * */
    private  int  num = 50;
    @Override
    public void run() {
        while (num>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            saleOne();
        }

    }

    public void saleOne(){
        //卖票的方法
        String name = Thread.currentThread().getName();
        //卖票
        synchronized (this){
            if (num > 0) {
                System.out.println(name +"出票"+num);
                num--;
            }
        }
    }
}
