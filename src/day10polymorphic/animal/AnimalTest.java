package day10polymorphic.animal;
/**
 * 测试类
 * */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Person();
        // a 指向人
        a.eat();
        Animal a1 = new Pig();
        //a1指向猪
        a1.eat();
        //强制转换 如果需要调用本身特有的方法 需要向下转换
        Person p =(Person)a;
        p.rest();

    }
}
