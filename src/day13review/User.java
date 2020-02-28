package day13review;
/**
 * 设计一个用户类
 *  成员变量 姓名 年龄 性别
 *
 * */
public class User {
    /**姓名*/
    private String name;
    /**年龄*/
    private int age;
    /**性别*/
    private String Gander;

    public User() {
    }

    public User(String gander, int age, String name) {
        Gander = gander;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGander() {
        return Gander;
    }

    public void setGander(String gander) {
        Gander = gander;
    }
}
