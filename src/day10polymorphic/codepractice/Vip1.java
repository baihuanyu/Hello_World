package day10polymorphic.codepractice;

public class Vip1 extends Vip {
    /**1级会员页面*/
    public  void privilege(){
        System.out.println("----------1⃣----------");
    }
    @Override
    public void show() {
        super.show();
        System.out.println("贵族1级");
        privilege();
    }

}
