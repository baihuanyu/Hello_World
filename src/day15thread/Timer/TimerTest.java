package day15thread.Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author shirokansakai
 */
public class TimerTest {
    public static void main(String[] args) {
        //创建定时器对象
        Timer timer = new Timer();

        Date date = new Date();
        //1.void schedule(TimerTask task, Date time) 在指定的时间执行指定的任务
       // MyTimerTask task = new MyTimerTask();
        //timer.schedule(task, date);

        //2.void schedule(TimerTask task, long delay) 在指定的毫秒数之后执行指定的任务。

        //3.void schedule(TimerTask task, Date firstTime, long period) 从指定 的时间开始 ，间隔指定的period毫秒数重复的执行
//		//过去时间也可以

        //4.void schedule(TimerTask task, long delay, long period) 从指定 的时间延迟后 ，间隔指定的period毫秒数重复的执行
//		//不能使用过去时间即 delay参数不能为负数

        //	5.void scheduleAtFixedRate(TimerTask task, Date firstTime, long period)
        //从指定 的时间开始 ，间隔指定的毫秒数重复的执行 (如果Time是过去时间，会一次性将所有缺少的任务执行完毕)
//		Date later = new Date(System.currentTimeMillis() + 2000);//2秒后的时间
//		timer.scheduleAtFixedRate(new TimerTask() {//匿名内部类
//			@Override
//			public void run() {
//				System.out.println("bang .bang   bang。。。。。");
//			}
//		}, later, 200);

        //6.void scheduleAtFixedRate(TimerTask task, long delay, long period)
        //从指定 的时间延迟后 ，间隔指定的毫秒数重复的执行(不能执行过去任务，否则会抛出异常，delay不能为负数)
//		//不能使用过去时间即参数delay不能为负数 m


        //7. void cancel() 终止当前任务。
        Date later = new Date(System.currentTimeMillis() + 2000);
        //2秒后的时间
        timer.scheduleAtFixedRate(new TimerTask() {
            //匿名内部类
            int count = 1;
            @Override
            public void run() {
                if (count == 5) {
                    timer.cancel();//满足条件终止任务
                }
                System.out.println("bang .bang   bang。。。。。");
                count++;//打印一次次数+1
            }
        }, later, 200);

    }
}
