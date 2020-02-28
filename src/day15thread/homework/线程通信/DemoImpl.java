package day15thread.homework.线程通信;

public class DemoImpl implements Runnable{
    private  Beans beans;

    public DemoImpl(Beans beans) {
        this.beans = beans;
    }

    @Override
    public void run() {
        while (beans.getNum()>1){
            synchronized (beans){
                if (!beans.flag){
                    try {
                        beans.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"抢"+beans.getNum());
                beans.setNum(beans.getNum()-1);
                beans.flag = false;
                beans.notify();
            }
        }
    }
}
