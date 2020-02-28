package day11abstract.employeesystem;

public class EmployeeFactor2 extends AbstractEmployee implements IWeChatPay {
    @Override
    public void work() {
        System.out.println("二厂。。。");
    }

    @Override
    public void weChatPay() {
        System.out.println("二厂阿里支付");
    }
}
