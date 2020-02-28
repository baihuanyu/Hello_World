package day13wrapper;

public class IntegerTest {
    public static void main(String[] args) {
        /*
		 * 调用Integer类中的字段：调用方式：类名.字段名
		 *  static int BYTES 		用于表示二进制补码二进制形式的 int值的字节数。
			static int MAX_VALUE 	一个持有最大值一个 int可以有2 31 -1。
			static int MIN_VALUE 	的常量保持的最小值的 int可以具有，-2 31。
			static int SIZE 		用于表示二进制补码二进制形式的 int值的位数。
			static 类<Integer> TYPE		类原始类型 int的 类实例。
		 */
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648


		/*
		 *	因为当前类中有非static方法，所以需要创建对象
		 *	构造方法：
		 * 		1.Integer(int value) 构造一个新分配的 Integer对象，该对象表示指定的 int值。
				2.Integer(String s) 构造一个新分配 Integer对象，表示 int由指示值 String参数。
		 */
        Integer integer = new Integer(1);
        /*
         * 在将字符串转换为Integer对象的时候有非数字相关的字符就会报该错误
         */
        Integer integer2 = new Integer("2");//NumberFormatException数字格式异常，通常是将字符串转换为数值类型的时候，有非数字的字符的时候发生该错误

        System.out.println(integer);
        System.out.println(integer2);


        //调用普通方法：1. static修饰的 =>类名.方法名(....)	2. 非static修饰的	=>对象名.方法名(....)
        //1. byte byteValue() 返回此值 Integer为 byte的基本收缩转换后。  如果超出表示范围，会强制转换
		byte byteValue = integer.byteValue();//转换的时候，如果超过byte表示范围，会以二进制方式进位
        System.out.println("-------------1------------");
        System.out.println(byteValue);
//
//		//2. static int max(int a, int b) 返回两个 int的较大值，就像调用 Math.max一样 。
//		//3. static int min(int a, int b) 返回两个 int的较小值，就像调用 Math.min一样 。
//		int max = Integer.max(1,5);
//		System.out.println(max);
//
//		//4. static int parseInt(String s) 将字符串参数解析为带符号的十进制整数。
//		int parseInt = Integer.parseInt("-3");
//		System.out.println(parseInt);
//
//		//5. static int sum(int a, int b) 根据+运算符将两个整数相加。
//		int sum = Integer.sum(1,2);
//		System.out.println(sum);
//
//		//6. static String toHexString(int i) 将int类型的十进制值转换为十六进制的值
//		String hexString = Integer.toHexString(15);
//		System.out.println("十六进制的值是：" + hexString);
//
//		//7. static Integer valueOf(String s)  将String类型转换为Integer类型
//		Integer valueOf = Integer.valueOf("1");
//		System.out.println(valueOf);
    }
}
