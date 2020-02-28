package day10polymorphic.single.hungry;

import day10polymorphic.single.hungry.SingleTon;

/**
 * 测试类
 *
 * */
public class SingleTonTest {
    public static void main(String[] args) {
        // 获取对象 通过类层级访问（类名.方法名）
        SingleTon test = SingleTon.getInstance();
        SingleTon test2 = SingleTon.getInstance();
        System.out.println(test==test2);
    }

}
