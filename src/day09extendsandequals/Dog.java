package day09extendsandequals;
/**
 * 用于重写object中的toString方法
 *
 *
 *
 * */

public class Dog {
    /**名字*/
    private String name;
    /**品种*/
    private String strain;
    /**
     * 构造方法
     * */
    public Dog() {
    }

    public Dog(String name, String strain) {
        this.name = name;
        this.strain = strain;
    }
    /**
     * get set 方法
     * */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public String toString() {
        return "名字："+this.name+"， 品种 ："+this.strain;
    }
}
