package day08posttingandthis;

public class ModelTest {
    public static void main(String[] args) {
        //创建一个实例对象
        Model m = new Model("linda",21,"victoria");
        m.show();
        //使用 set赋值
        Model m1 = new Model();
        m1.setName("gigi");
        m1.setAge(19);
        m1.setCountry("japan");
        m1.show();
    }
}
