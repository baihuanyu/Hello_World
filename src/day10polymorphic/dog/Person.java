package day10polymorphic.dog;

public class Person {

    public void feedDog(Dog dog){
        dog.eat();
    }


    public static void main(String[] args) {
        Person person = new Person();

        person.feedDog(new ChinaDong());

    }
}
