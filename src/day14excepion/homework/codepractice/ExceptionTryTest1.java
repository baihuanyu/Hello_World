package day14excepion.homework;

import java.util.Arrays;

/**
 *   异常：
 *       1.概念：
 *          一种不正常的状态，
 *       2.异常分类：
 *          throwable：
 *            Error(无法处理的):
 *            Excepiton(可处理的)：
 *                     1. RuntimeException(运行异常):
 *                     2. 非运行是异常：
 *       3.异常处理机制：
 *          层层向上抛，直到jvm。
 *       4.处理异常的方式：
 *           4.异常的捕获
 * 	(1)语法格式
 * 		try{
 * 			可能产生异常对象的语句块。
 *                }catch(异常类型  引用名){
 * 			针对当前异常类型对象的处理语句块；
 *        }
 * 		...... （可以写多个catch）
 * 		finally{
 * 			无论是否发生异常都应该执行的语句块。
 *        }
 *
 * 	(2)注意事项
 * 		当捕获异常的结构中有多个catch分支时，切记小范围的异常类型放在大范围的异常类型上面
 *
 * 		懒人的写法：
 * 			catch(Exception e){......}
 *
 *
 * 	(3)执行流程
 * 		try{
 * 			a;
 * 			b;可能产生异常的语句
 * 			c;
 *
 *        }catch(Exception e){
 * 			e;
 *        }finally{
 * 			f;
 *        }
 *
 * 		当没有产生异常的时候，程序的执行流程时：a b c f
 * 		当产生异常时，程序执行流程是 a b e f
 *
 *
 * 5.异常的抛出
 * 	(1)基本概念
 * 		在某些特殊的场合中，当产生异常后却无法直接处理的/不想处理时，此时就可以将异常转移给当前方法的调用着，这就叫异常的抛出。
 *
 * 	(2)语法格式
 * 		返回值类型    方法名称(形参列表) throws 异常类型{...............}
 *
 * 	(2)方法重写的原则
 * 		a.要求方法名相同、参数列表相同、返回值类型也相同，从jdk1.5开始允许返回子类类型。
 * 		b.访问权限不能变小，可以相同或者变大。
 * 		c.不能抛出更大的异常
 *
 *
 * 		注意：
 * 			子类中重写以后的方法可以选择抛出与父类一样的异常、更小的异常、不抛出异常，但是不能抛出更大的异常、不同的异常。
 *
 * */

public class ExceptionTryTest1 {
    public static void main(String[] args) {
        System.out.println("异常发生前");
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        try {
            System.out.println(1/0);//算术异常
        } catch (ArithmeticException e){//只能捕捉算术异常和算术异常的子类异常
            //处理异常的方式
            //1。打印异常的原因 一般后台返回前台是 给用户的提示
            String message = e.getMessage();
            System.out.println("发生异常的原因"+message);
            //2. 打印日志 堆栈追踪 给it看的
            StackTraceElement[] stackTrace = e.getStackTrace();
            //[day14excepion.ExceptionTest.main(ExceptionTest.java:76)]
            System.out.println(Arrays.toString(stackTrace));
            e.printStackTrace();
            //3.异常的原因和类型（了解）
           // String s = e.toString();
           // System.out.println(s);
        }
        System.out.println("异常发生后");
    }
}
