package day10polymorphic.animal;

/**
 * 猪类
 *
 * */
public class Pig  extends  Animal{
    int age=1;

    @Override
    public void eat() {
        System.out.println("猪吃。。。。。。。。。");
    }
}
