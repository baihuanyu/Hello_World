package day15thread.homework;
/**
 * 实现类接口抢豆子 使用同步方法
 *
 * @author shirokansakai
 * */
public class RobBeansThreadRunnaleImpl implements Runnable {
    /**设定一个豆子*/
    private int num = 200 ;

    @Override
    public void run() {
        while (true){
            getBean();
        }
    }
    public synchronized void getBean(){
        //获取线程名字
        String name = Thread.currentThread().getName();
        if (num > 0 ) {
            System.out.println(name+"抢了第"+num-- +"个豆子");
        }
    }

}
