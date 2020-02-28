package day10polymorphic.area;
/**
 *
 * 图案的父类
 *
 * */
public class Patterning {
    /**横坐标*/
    private double x ;
    /**纵坐标*/
    private double y ;
    /**构造方法*/
    public Patterning() {
    }

    public Patterning(double x, double y) {
        this.x = x;
        this.y = y;
    }
    /**get set*/
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void show(){
        System.out.println("中心坐标点为："+"("+getX()+","+getY()+")");
    }
    public  void area(){

    }
}
