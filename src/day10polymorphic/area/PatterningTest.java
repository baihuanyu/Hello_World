package day10polymorphic.area;
/**
 * 测试类
 * */
public class PatterningTest {
    public static void main(String[] args) {
        Patterning p = new Rectangle();
        if (p instanceof Rectangle) {
            p.setY(2);
            p.setX(2);
            ((Rectangle) p).setHeight(2);
            ((Rectangle) p).setWeight(3);
            p.show();
            p.area();
        }



    }
}
