package day08posttingandthis;

public class DemoTest {
    public static void main(String[] args) {
        //创建对象；
        Demo d1 = new Demo();//无参创建， 可以直接调用无参构造里面的内容
        Demo d2 = new Demo("大茲花",28);
        //给无参构造赋值：
        d1.name = "小即";
        d1.age = 18;
        //取值
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d2.name);
        System.out.println(d2.age);
        //调用方法：
        d1.show();
        d2.show();
        //Demo.show(); static修饰才能这样调用！
    }
}
