package day09extendsandequals.homework;
/**
 * 据车
 * */
public class Army_Vehicle extends Car {

    public  void pao(){
        super.setSpeed("150km");
        System.out.println("速度"+super.getSpeed());
        System.out.println("放炮");
    }

    @Override
    public void run() {
        super.run();
        pao();
    }
}
