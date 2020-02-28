package day10polymorphic.codepractice;

public class Vip3 extends Vip {

    public void privilege(){
        System.out.println("-----------3⃣-----------");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("贵族3级");
    }
}
