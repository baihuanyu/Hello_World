package day11abstract.employeesystem;

public class EmployeeFactor1 extends AbstractEmployee implements IALiPay,IWeChatPay {
    @Override
    public void work() {
        System.out.println("一场工作");
    }


    @Override
    public void weChatPay() {
        System.out.println("微信支付");

    }

    @Override
    public void aLiPay() {
        System.out.println("支付宝支付");
    }
}
