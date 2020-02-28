package 机试题;
/**
 * 10.	写出一个类中主要成员有哪些，并用代码展示出来
 *     成员变量 代码块 构造方法 方法
 * */
public class D10 {
    private String name ;

    public D10() {
    }

    public D10(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
