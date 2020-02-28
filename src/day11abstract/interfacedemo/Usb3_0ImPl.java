package day11abstract.interfacedemo;
/**
 * 接口实现类
 *  命名 后面加Impl
 *   需要强制重写接口方法
 *
 * */

public class Usb3_0ImPl implements IUsb3_0 {
    @Override
    public void transfer() {
        System.out.println("数据传输");
    }

    @Override
    public void charge() {
        System.out.println("充电");
    }
}
