package homeworkfornewyear;
//本金10000元存入银行，年利率是千分之三，每过1年，将本金和利息相加作为新的本金。计算5年后，获得的本金是多少

public class V23 {
    public static void main(String[] args) {
        double money = 10000;
        double rate = 0.003;
        for (int i = 1; i <=5 ; i++) {

            money = (1+rate)*money;
        System.out.println("第"+i+"年:"+money);
        }
    }
}
