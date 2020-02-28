package day11abstract.graph;
/**
 *  圆形
 * */
public class Circle extends AbstractGraph {
    /**  圆形的半径*/
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }
}
