package day08posttingandthis;
/**
 * 定义一个model类进行private封装
 * */
public class Model {
    /**姓名*/
    private String name;
    /**年龄*/
    private int age;
    /**国籍*/
    private String country;
    /**
     * 进行有参无参构造
     * */
    public Model() {//无参构造
    }
    //有参构造
    public Model(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
    /**
     * 创建get  方法
     * */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
    /**
     * 创建set 方法
     * */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    void show(){
        System.out.println("姓名："+this.name+", 年龄:"+this.age+", 国籍："+this.country);
    }
}
