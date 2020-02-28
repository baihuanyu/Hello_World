package day23.设计模式.单例设计模式;
/**
 * 饿汉模式
 * */
public class HungrySingle {
    /**
     * 考虑到以后会在构造方法中添加很多操作 导致加载过慢，
     * 所以将创建实例设置为静态， 这样只用加载一次，提高效率
     * */
    private static HungrySingle instance ;
    static {
      instance = new HungrySingle();
    }
    private HungrySingle() {
        /*
         * 以后真正的单例  要在这里写很多初始化的代码
         * 		 * 	如：加载配置文件
         * 		 * 	       远程链接数据库
         * 		 *     创建数据库的链接对象
         * 		 *     windows开机 ---
         * 		 *     手机开机---
         *
         * */
    }
    public static HungrySingle getInstance(){
        return instance;
    }
}
