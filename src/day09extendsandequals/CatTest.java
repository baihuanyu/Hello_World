package day09extendsandequals;
/**
 * 测试equals重写
 * */
public class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat("猫咪", "Amerian shortair");
        Cat cat1 = new Cat("猫咪", "Amerian shortair");
        boolean b = cat == cat1;
        System.out.println(cat.equals(cat1));
    }
}
