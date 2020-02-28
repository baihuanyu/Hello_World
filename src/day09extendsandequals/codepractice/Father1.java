package day09extendsandequals.codepractice;

/**	       super:
 *		1. 概念：指代父类对象
 *		2. 作用：
 *			在子类中访问父类中的成员
 *
 *		3. 语法：
 *			this.成员变量	访问当前类自己的成员
 *			this.实例方法	访问当前类自己的成员
 *			this(...);必须在构造方法第一行	访问当前类自己的成员
 *
 *			super.父类成员变量	访问父类成员变量
 *			super.父类实例方法	访问父类实例方法
 *			super(...);必须在子类构造方法第一行	访问父类构造方法
 *
 *		4. 注意事项：
 *			每一个类都有一个super()，如果没有看到则会存在一个隐式的无参super();
 */
public class Father1 {
    String str;
    private int a;
    static int b;

    public Father1() {
//		super();
        System.out.println("Father无参构造...");
    }

    public Father1(int a) {
        //调用当前类直接的无参构造
        this();
        System.out.println("Father有参构造...");
    }

    public void test() {
        System.out.println("普通方法");
    }

    public static void testStatic() {
        System.out.println("静态方法..");
    }

    private void testPrivate() {
        System.out.println("私有化方法..");
    }
}
