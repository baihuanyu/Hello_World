package day10polymorphic.codepractice;

public class Vip2 extends Vip {

    public void privilege(){
        System.out.println("-----------2⃣-----------");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("贵族2级");
        privilege();
    }
}
