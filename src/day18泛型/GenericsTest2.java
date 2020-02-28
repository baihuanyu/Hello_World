package day18泛型;
import	java.util.ArrayList;

public class GenericsTest2 {
    public static void main(String[] args) {
    //当我们不确定用户需要传入什么数据的时候，使用占位符
        ArrayList<Point> list = new ArrayList<>();
        Point<Integer,String> p1 = new Point<Integer,String>(1,"你好");
        list.add(p1);
        System.out.println(list);

    }
}
class Point<T1,T2> {
    //不确定数据类型的X，Y值
    private T1 x;
    private T2 y;

    public Point(T1 x, T2 y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
