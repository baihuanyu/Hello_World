package day09extendsandequals.codepractice;

public class Son1 extends Father1 {
    public Son1() {
    //super(...);必须在子类构造方法第一行	访问父类构造方法
        super();

    //super.父类成员变量	访问当前类自己的成员
        super.str = "张三";

    //super.父类实例方法	访问父类实例方法
        super.test();

//		super.a//不能访问父类私有化的成员

//		super.b = 2;//不要用super访问父类static成员

}

    public void testSuper() {
        //super(...);必须在子类构造方法第一行	访问父类构造方法
//		super();

        //super.父类成员变量	访问当前类自己的成员
        super.str = "张三";

        //super.父类实例方法	访问父类实例方法
        super.test();

//		super.a//不能访问父类私有化的成员

//		super.b = 2;//不要用super访问父类static成员
    }
}
