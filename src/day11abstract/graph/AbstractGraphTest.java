package day11abstract.graph;
/**
 * 测试类
 *
 * */
public class AbstractGraphTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        Rectangle rectangle = new Rectangle(3.1, 2);
        System.out.println("圆的面积是："+circle.getArea());
        System.out.println("矩形的面积是："+rectangle.getArea());
    }
}
