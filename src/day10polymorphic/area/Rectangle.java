package day10polymorphic.area;
/**
 *
 * 矩形的类
 *
 * */

public class Rectangle extends Patterning {
    /**高*/
    private double height;
    /**宽*/
    private double weight;

    public Rectangle() {
    }

    public Rectangle(double x, double y, double height, double weight) {
        super(x, y);
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("长："+getWeight()+"宽"+getHeight());
    }
    @Override
    public  void area(){
        System.out.println("面积为："+getWeight()*getHeight());
    }
}
