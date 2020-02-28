package day08posttingandthis.codePractice;
/**
 *	账户类
 *		this：
 *			1. 概念： this指代的当前的对象。即，谁调用就指代谁
 *			2. 作用：
 *				1. 解决了成员变量和局部变量的二义性问题
 *				2. 构造方法之间的相互调用,必须是第一行
 *			---------------了解-----------------
 *				3. 可以作为参数传递
 *				4. 可以作为返回值返回
 */


public class V01 {
    private String name;
    /**密码*/
    private String pwd;

    public V01() {
    }

    public V01(String name) {
        //需求：每个账号对象的pwd都是相同的，都有默认值。
        /*
         * this(...)调用当前类自己的构造方法，会根据参数自动匹配调用对应的
         * 必须在构造方法第一行
         */
//		int a = 1;//必须在构造方法第一行
        this(name, "111111");
    }

    public V01(String name,String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public void setName(String name){
        this.name = name;//将name赋值给成员变量name
    }

    public String getName(){
        return this.name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
