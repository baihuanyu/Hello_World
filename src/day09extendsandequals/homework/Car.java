package day09extendsandequals.homework;
/**
 * 汽车类
 *
 * */
public class Car {
    /**速度*/
    private  String speed;

    public Car() {
    }

    public Car(String speed) {
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    /**汽车run方法*/

    public  void run(){
        System.out.println("开车！滴滴滴。");
    }
}
