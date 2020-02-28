package day15thread.模拟购票窗口.悲观锁;

public class DemoRunnableThreadImpl implements Runnable {

   private int num = 50;
    @Override
    public void run() {
        while (num>0){
            saleOne();
        }
    }

    public synchronized void saleOne(){
        String name = Thread.currentThread().getName();
        if (num > 0) {
            System.out.println(name+"出票"+num);
            num--;
        }
    }
}
