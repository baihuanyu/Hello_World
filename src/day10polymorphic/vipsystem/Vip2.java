package day10polymorphic.vipsystem;

public class Vip2 extends Vip {
    @Override
    public void privledge() {
        System.out.println("会员等级2级");
    }
    public void show(){
        System.out.println("会员2级福利");
    }
}
