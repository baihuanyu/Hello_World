package day11abstract.phone;
/**
 * 测试类
 * */
public class PhoneTest {
    public static void main(String[] args) {
        PhoneCard phoneCard = new PhoneCard("666");
        Phone phone = new Phone();
        phone.showNumber(phoneCard);
    }
}
