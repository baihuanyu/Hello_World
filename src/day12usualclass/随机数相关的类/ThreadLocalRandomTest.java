package day12usualclass.随机数相关的类;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 此类单利模式：
 *          获取方法 static ThreadLocalRandom	current()
 *                                              返回当前线程的 ThreadLocalRandom 。
 * 随机数生成方法：
 *         double	nextDouble()
 *                  返回在零（包括）和一（独占）之间的伪随机 double值。
 * 
 * 
 *
 * @author shirokansakai*/
public class ThreadLocalRandomTest {
    public static void main(String[] args) {
        //获取对象
        ThreadLocalRandom current = ThreadLocalRandom.current();
        //调用方法生成随机数
        //获取1到9之间的随机数，左闭又开
        int nextInt = current.nextInt(1, 10);
        System.out.println(nextInt);


    }
}
