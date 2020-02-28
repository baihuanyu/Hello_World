package day23.设计模式.适配器模式;
/**
 * 适配器模式
 *
 *
 * @author shirokansakai*/
public class AdapaterTest {
    public static void main(String[] args) {
        IImpl i = new IImpl();
        i.iCharge();
        i.AdaCharge();
    }
}
/** 安卓接口*/
interface IAda{
    void AdaCharge();
}
/**苹果接口*/
interface II{
    void  iCharge();
}
class AdaImpl implements IAda{

    @Override
    public void AdaCharge() {
        System.out.println("给安卓手机充电");
    }
}
/**多项充电器*/
class IImpl extends AdaImpl implements II{

    @Override
    public void iCharge() {
        //调用父类功能
        super.AdaCharge();
        System.out.println("给苹果手机充电!!");
    }
}