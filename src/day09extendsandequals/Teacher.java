package day09extendsandequals;

public class Teacher extends Person {
    /**科目*/
    private String subject;
    /**构造方法*/
    public Teacher() {
        super();
    }
    public Teacher(int age, String name, String subject) {
        super(age, name);
        this.subject = subject;
    }
    /** get set*/
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    //方法重新

    @Override
    public void show() {
        super.show();
        System.out.println("教学科目："+this.subject);
    }

    @Override
    public void study() {
        System.out.println("我是教师里面的学习方法");
    }
}
