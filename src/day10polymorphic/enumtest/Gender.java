package day10polymorphic.enumtest;

/**枚举：
		1. 概念：跟类类似的新结构，就是用了简化类中的常量这种代码的。
            每一个枚举类都隐式继承了抽象类Enum
		2. 作用：简化类中的常量这种代码的。
		3. 使用：
			声明语法：
            enum 枚举类名字{
                字段
                实例变量
                        实例方法
                类方法
                构造方法 - 枚举中的构造方法默认都是private修饰，不能够是public，protected修饰
                作用：只能在当前枚举类中使用，就是给当前枚举对象初始化成员变量的
            }

		4. 注意事项：
                1. 字段之间用逗号，最后一个字段用分号结束
                2. 可以写中文字段，但是不建议
                3. 枚举类都会隐式继承了Enum类（所有枚举类的基类），不能显示写出来
                4. 构造方法必须是private的

                5. 使用场景：一些固定取值的情况用枚举。
                如：vip、段位、星座、日期、生肖、QQstatu*/

public enum Gender { //用enum来修饰 gender表示一个性别的枚举
	/**下面表示一个常量，public static final 修饰  */
	MALE("男"),
	FEMALE("女");
	private String name;
	/**
	 * 构造方法 是私有化 隐式private
	 * */
	Gender() {
	}
	Gender(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}



	public static void main(String[] args) {
		System.out.println(Gender.FEMALE);// 可直接打印
	}

}
