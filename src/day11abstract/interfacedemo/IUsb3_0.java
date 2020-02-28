package day11abstract.interfacedemo;
/**
 * USB接口模拟 实现功能 充电和数据传输
 *  提供功能，
 * 接口命名前面加大写的I
 * */

public interface IUsb3_0 {
    /** 有public abstract修饰*/
    void transfer();
    void charge();
}
