package day08posttingandthis.codePractice;

/**
 * this测试类
 * */

public class V04Test {
    public static void main(String[] args) {
        //创建了一个对象
        V04 cang = new V04();

        //调用赋值方法setXxx
        cang.setName("苍老师");

        //调用取值方法getXxx
        String name = cang.getName();
        System.out.println("姓名：" + name);

        //创建了一个对象
        V04 bobo = new V04();

        //调用赋值方法setXxx
        bobo.setName("波波老师");

        //调用取值方法getXxx
        String name2 = bobo.getName();
        System.out.println("姓名2：" + name2);
    }
}
