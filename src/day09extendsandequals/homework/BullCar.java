package day09extendsandequals.homework;
/**
 *  牛车
 * */
public class BullCar extends Car {

    public void eat(){
        super.setSpeed("50km");
        System.out.println("速度"+super.getSpeed());
        System.out.println("吃草");
    }

    @Override
    public void run() {
        //this.eat();
        eat();
    }
}
