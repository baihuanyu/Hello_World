package day08posttingandthis;
/**
 * 账户的测试类
 *
 * */
public class AccountTest {
    public static void main(String[] args) {
        // 创建一个对象
        Account a = new Account();
        // 给对象赋值
        a.setName("楼的话");
        a.setMoney(9527.0);
        a.setVip(true);
        // 取值
        System.out.println(a.getName());
        System.out.println(a.getMoney());
        System.out.println(a.isVip());
        System.out.println("============================");
        //有参构造创建对象
        Account a2 = new Account("helo",111.2,false);
        System.out.println("姓名："+a2.getName()+" 余额："+a2.getMoney()+" 客服等级："+(a2.isVip()? "Vip":"非vip"));
    }
}
