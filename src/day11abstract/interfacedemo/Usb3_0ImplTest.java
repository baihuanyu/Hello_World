package day11abstract.interfacedemo;
/**
 * 测试类
 *
 * */
public class Usb3_0ImplTest {
    public static void main(String[] args) {
        //创建实例对象 去实现接口方法。
        Usb3_0ImPl usb = new Usb3_0ImPl();
        usb.charge();
        usb.transfer();
    }
}
