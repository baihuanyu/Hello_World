package day10polymorphic.vipsystem;

public class VipTest {

    public static void main(String[] args) {
        Vip vip = new Vip1();
        //欢迎页面
        vip.privledge();
        if (vip instanceof Vip1) {
            ((Vip1) vip).show();
        }else if (vip instanceof Vip2){
            ((Vip2) vip).show();
        }else if (vip instanceof Vip3){
            ((Vip3) vip).show();
        }
    }
}
