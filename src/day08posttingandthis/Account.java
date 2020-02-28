package day08posttingandthis;
/**账户类
        *	封装：
        *		1. 概念，就是通过访问权限修饰符修饰 类或者类中的成员，而达到保护内部成员安全的目的，就是封装。
        *			访问权限修饰符：
        *				public		最大权限，被其修饰的成员，在任意目录下，都可以访问到
        *				protected	在同包类和子类中都可以使用
        *				默认不写		只能在同包类中访问
        *				private		只能在当前类中访问
        *
        *		2. 封装步骤：
        *			 1. 私有化成员变量（用private修饰成员变量）
        *			 2. 为每一个成员变量提供合理的
        *					getXxx()方法	获取成员变量的值，如果当前成员变量类型是boolean类型，将getXxx()改为 isXxx()
        *
        *					setXxx(...)方法	设置成员变量的值
        *			 3. 提供一个无参构造
        *			 4. 该类用public修饰
        *
        *		3. 封装作用：
        *			1. 保护内部数据
        *
        *		4. 使用场景：
        *			1. 不希望在外部类中随意访问类中的成员变量
        *			2. 达到权限要求的才能访问。
        *			3. 只是获取数据的时候，例如 单例模式
        *
        *		5. 小结：
        *			对象赋值的方式：
        *				1. 有参构造 :new 类名(...);
        *				2. 对象名.setXxx(...);
        *				3. 对象名.成员变量 = 值;//封装后不能用
        *				一般配合使用，如果成员变量比较少，可以直接用有参构造
        *				如果成员变量比较多或者在创建好对象后，需要修改值，都用setXxx(...)
        *
        *			对象赋值的方式：
        *				1. 对象名.getXxx();
        *				2. 对象名.成员变量 ;//封装后不能用
 		*/

public class Account {
    /** 创建一个私有化的成员变量 姓名*/
    private String name;
    /** 创建一个私有化的成员变量 余额*/
    private double money;
    /** 创建一个私有化的成员变量 判断是否是vip*/
    private boolean vip;
    /**
     * 为每个成员变量提供get ，set方法
     * */
    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public boolean isVip() {
        return vip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    /**提供有参无参构造方法*/
    public Account(){
    }

    public Account(String name, double money, boolean vip) {
        this.name = name;
        this.money = money;
        this.vip = vip;
    }
}
