package day09extendsandequals.codepractice;
/**
 * 重写obj里面的toString方法
 * */
public class Student {
    /**姓名*/
    private String name;
    /**电话号码*/
    private String phoneNumber;
    /**构造方法*/
    public Student() {

    }

    public Student(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    /**get set*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "["+name+","+phoneNumber+"]";
    }
}
