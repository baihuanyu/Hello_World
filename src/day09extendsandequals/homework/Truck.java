package day09extendsandequals.homework;
 /**
  *  货车
  *
  * */
public class Truck extends Car {
    public void transport(){
        super.setSpeed("80km");
        System.out.println("速度"+super.getSpeed());
        System.out.println("我的功能是运输！");
    }

     @Override
     public void run() {
         this.transport();// 加不加this都可以的～～～
     }
 }
