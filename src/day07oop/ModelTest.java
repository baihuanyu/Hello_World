package day07oop;

public class ModelTest {
    public static void main(String[] args) {
        /** 实例化对象*/
        Model m1 = new Model();
        m1.name = "结衣老师";
        m1.age = 18;
        m1.sex="female";
        m1.height="175cm";
        m1.bwh="89cm,65cm+92cm";
        m1.price ="5000/夜";
        /**第二个对象*/
        Model m2 =new Model();
        m2.name = "玛利亚老师";
        m2.age = 22;
        m2.sex="female";
        m2.height="173cm";
        m2.bwh="88cm,64cm+90cm";
        m2.price ="5000/夜";
        /**第三个对象*/
        Model m3 =new Model();
        m3.name = "何老师";
        m3.age = 45;
        m3.sex="male";
        m3.height="165cm";
        m3.bwh="84cm,65cm+88cm";
        m3.price ="20000/年";
        /**对象方法的调用*/
        m1.skillFor1And2();
        m2.skillFor1And2();
        m3.skillForHe();
    }
}
