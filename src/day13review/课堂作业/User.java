package day13review.课堂作业;
/**
 * 练习题：
 * 		设计一个用户类，有成员变量：姓名、密码、手机号码、身份证号、地址
 * 		性别，
 * 		行为：爱好，擅长
 *
 * 		有一个普通用户类，都继承了用户类
 * 			擅长 ：吹牛皮。。。
 * 		有一个Vip用户类，都继承了用户类
 * 			擅长：打枪枪
 *
 * 		请用标准封装的方式设计
 *
 * 		在测试类中，
 * 			1. 创建不同的子类对象分别调用所有的方法测试
 * 			2. 创建3个不同的VIp对象，但是有两个姓名和身份证是相同的
 * 			判断这三个对象是否“相等”
 *
 * 			new 3个对象
 * 			u1 u2比较
 * 			u2 u3比较
 * 			u1 u3比较
 *
 * 			比较的根据（身份证号和姓名）
 *
 *
 * */
public class User {
    /**姓名*/
    private String name;
    /**密码*/
    private String password;
    /**电话号码*/
    private String phoneNumber;
    /**身份证*/
    private String ID;
    /**住宅*/
    private String addr;

    public User() {
    }

    public User(String name, String password, String phoneNumber, String ID, String addr) {
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.ID = ID;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    public void hobby(){
        System.out.println("爱好");
    }
    public  void goodAt(){
        System.out.println("擅长");
    }
}
