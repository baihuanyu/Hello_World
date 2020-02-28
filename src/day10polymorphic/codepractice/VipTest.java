package day10polymorphic.codepractice;

public class VipTest {
    public static void main(String[] args) {
        Vip vip = new Vip1();
        if (vip instanceof Vip1){
            vip.show();
        }else if(vip instanceof Vip2){
            vip.show();
        }else if(vip instanceof Vip3){
            vip.show();
        }
    }
}
