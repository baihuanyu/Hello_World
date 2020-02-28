package day10polymorphic.single.lazy;
/**
 * 懒汉测试类
 *
 * */

public class SingleTonTest {
    public static void main(String[] args) {
        SingleTon s = SingleTon.getsingleTon();
        SingleTon s1 = SingleTon.getsingleTon();
        System.out.println(s==s1);
    }
}
