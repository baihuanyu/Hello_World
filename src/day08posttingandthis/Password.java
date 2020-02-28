package day08posttingandthis;
/**
 * 创建一个密码类  用于测试this构造方法之间的互相调用
 * 1. 要求所有人的密码都统一
 * */
public class Password {
    /** 姓名*/
    private String name;
    //private String psd= "000";
    /**密码*/
    private  String psd;
    /**this调用*/
    public Password(String name){
        this(name,"000");
    }
    /**进行有参无参构造*/
    public Password() {
    }

    public Password(String name, String psd) {

        this.name = name;
        this.psd = psd;
    }
    /**get方法*/
    public String getName() {
        return name;
    }

    public String getPsd() {
        return psd;
    }
    /**set*/
    public void setName(String name) {
        this.name = name;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }
    // 打印信息
    void show(){
        System.out.println(name+"  "+psd);
    }
}
