package day10polymorphic.vipsystem;

public class Vip3 extends Vip {
    @Override
    public void privledge() {
        System.out.println("会员等级3级");
    }
    public void show(){
        System.out.println("会员3级福利");
    }
}
