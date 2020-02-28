package day12usualclass.随机数相关的类;

import java.util.Random;

/**
 * 	Random类：不推荐用
 *  *				1.创建对象：
 *  *					Random() 创建一个新的随机数生成器。
 * 					Random(long seed) 使用单个 long种子创建一个新的随机数生成器。  	不推荐用long种子，System.currentTimeMillis();
 * 				    2. 调用方法
 *  *					int nextInt() 生成int范围内的任意一个数字。
 * 					int nextInt(int bound)  生成直到范围内的随机数	 生成随机数范围：[0,bound);
 *
 *
 *
 * */
public class RandomTest {
    public static void main(String[] args) {
        //无参构造生成随机数
        Random random = new Random();
        int i = random.nextInt(5);//生成0-4之间的随机数
        System.out.println(i);
        //有参构造生成随机数  参数要传入可变的
        Random random1 = new Random(System.currentTimeMillis());
        int i1 = random1.nextInt();
        System.out.println(i1);
    }
}
