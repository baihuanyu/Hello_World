package day22java8.lambda;
/**
 *  lanmda测试: 缩写规则
 *  1、=右边的类型会根据左边的函数式接口类型自动推断；
 * 	2、如果形参列表为空，只需保留()；
 * 	3、如果形参只有1个，()可以省略，只需要参数的名称即可；
 * 	4、如果执行语句只有1句，且无返回值，{}可以省略，若有返回值，则若想省去{}，则必须同时省略return，且执行语句也保证只有1句；
 * 	5、形参列表的数据类型会自动推断；
 * 	6、lambda不会生成一个单独的内部类文件；
 * 	7、lambda表达式若访问了局部变量，则局部变量必须是final的，若是局部变量没有加final关键字，系统会自动添加，此后在修改该局部变量，会报错；
 * */
public class LambdaTest {
    public static void main(String[] args) {
        // 无参数 无返回值 基本写法， 可以继续省略
        Myinterface my  =  ()-> System.out.println("这是show方法");
        //有参数 无返回值
        Myinterface1 my1 = str -> System.out.println(str+"这是有参数的");
        //无参数，有返回值
        Myinterface2 my2 = ()-> 0 ;
        //有参数，有返回值
        Myinterface3 my3 = (a,b) -> a + b;
    }
}
/**
 * 函数式接口
 * */
interface Myinterface{
    /** show方法 无返回值*/
    void show();
}
interface  Myinterface1{
    /** 有参数 无返回值*/
    void  show (String str);
}interface  Myinterface2{
    /** 无参数 有返回值*/
    int show();
}interface  Myinterface3{
    /** 有参数 有返回值*/
     int  show(int a, int b);

}