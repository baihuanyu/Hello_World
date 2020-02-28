package day11abstract.phone;
/**
 * 手机类
 * */
public class Phone {
    public void showNumber(PhoneCard phoneCard){
        String number = phoneCard.getNumber();
        System.out.println("本机号码是："+number);
    }
}
