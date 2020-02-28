package day09extendsandequals;
/**
 * 用于测试狗类中 toString方法重写
 * */

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("钱多多", "Labrador");
        System.out.println(dog.toString());
    }
}
