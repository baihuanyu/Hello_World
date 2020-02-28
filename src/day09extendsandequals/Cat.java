package day09extendsandequals;

import sun.tools.jconsole.inspector.XObject;

/**
 * 用于重写euqals
 *
 * */
public class Cat {
    /**姓名*/
    private String name;
    /**品种*/
    private String strain;
    /**构造方法*/
    public Cat() {
    }

    public Cat(String name, String strain) {
        this.name = name;
        this.strain = strain;
    }
    /**
     * get and set
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
    /**
     * 重写equals
     * */
    @Override
    public boolean equals(Object obj) {
        //首先判断是否为空
        if (obj == null) {
            return false;
        }
        //判断是否是同一类  此处可以用isinstanceof
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Cat cat = (Cat) obj;//强制转型
        if (this.name.equals(cat.getName()) && this.strain.equals(cat.getStrain())) {
            return true;
        }else{
            return false;
        }
    }
}
