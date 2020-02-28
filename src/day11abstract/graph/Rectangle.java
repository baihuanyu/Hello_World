package day11abstract.graph;
/**
 * 长方形类
 *
 * */
public class Rectangle extends AbstractGraph {
    /**长方形长*/
    private double height;
    /**长方形宽*/
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return getHeight()*getWidth();
    }
}
