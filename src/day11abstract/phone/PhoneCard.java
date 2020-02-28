package day11abstract.phone;
/**
 * 手机卡
 *
 * */
public class PhoneCard {
    private String number;

    public PhoneCard() {
    }

    public PhoneCard(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
