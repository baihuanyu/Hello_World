package day10polymorphic.animal;

/**
 * 人类
 * */
public class Person  extends Animal {
    @Override
    public void eat() {
        System.out.println("人类吃。。。。。。");
    }
    public  void rest(){
        System.out.println("人要睡觉的嘛。。。。。。。");
    }



}
