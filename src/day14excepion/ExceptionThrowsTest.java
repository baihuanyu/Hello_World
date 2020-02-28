package day14excepion;
/**
 * 异常抛出测试类
 *
 * */
public class ExceptionThrowsTest {
    public static void main(String[] args) {
        //main 方法调用的时候要去处理异常
        // 抛出异常是 main方法作为最有一个调用者 需要try 否则异常会抛给jvm
        int result = 0;
        try {
            result = divide("2","1");
        }catch (ArithmeticException e){//可能发生的异常 子异常平级
            e.printStackTrace();
            System.out.println("除数不能为0");
        } catch (Exception e) {//最大异常放在最后
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static int divide(String s1 ,String s2)throws Exception{
        Integer integer1 = Integer.valueOf(s1);
        Integer integer2 = Integer.valueOf(s2);
        int i = integer1 / integer2;
        return i;
    }
}
