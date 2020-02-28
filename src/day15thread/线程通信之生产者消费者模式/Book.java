package day15thread.线程通信之生产者消费者模式;
/**
 * 图书类
 * */
public class Book {
    /**图书名字*/
    private String name;
    /**图书价格*/
    private String rmb;
    /**表示有没有书*/
    boolean flag ;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRmb() {
        return rmb;
    }

    public void setRmb(String rmb) {
        this.rmb = rmb;
    }
}
