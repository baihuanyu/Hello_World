package day11abstract.employeesystem;
/**
 * 测试类
 * */
public class AbstractactEmployeeTest {
    public static void main(String[] args) {
        AbstractEmployee t1 = new EmployeeFactor1();
        t1.clockIn();
        t1.clockOut();
        t1.work();
        if (t1 instanceof EmployeeFactor1){
            ((EmployeeFactor1) t1).aLiPay();
            ((EmployeeFactor1) t1).weChatPay();

        }else if (t1 instanceof EmployeeFactor2){
            ((EmployeeFactor2) t1).weChatPay();
        }else if (t1 instanceof EmployeeFactor3){
            System.out.println("请使用现金支付");
        }
    }

}
