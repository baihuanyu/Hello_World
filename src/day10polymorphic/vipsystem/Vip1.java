package day10polymorphic.vipsystem;

public class Vip1 extends Vip {
    @Override
    public void privledge() {
        System.out.println("会员等级1级");
    }
    public  void show(){
        System.out.println("1级会员福利");
    }
}
