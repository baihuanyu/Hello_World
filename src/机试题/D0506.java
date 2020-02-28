package 机试题;
/**
 * 测试懒汉模式线程安全问题
 * */
public class D0506 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(LH.getInstance());
            }
        };
        // 线程启动
        long start = System.currentTimeMillis();

        new Thread(runnable).start();
        //
        new Thread(runnable).start();
        //机试题.LH@48d82c9c
        //机试题.LH@51252877
        System.out.println(System.currentTimeMillis()-start);

    }
}
/**
 * 单例模式
 * */
class LH {
    /**构造方法私有化*/
    private LH(){}
    /** 获取一个实例成员变量*/
    public static LH instance;
    /** 提供一个外部获取实例的方法*/
    public static synchronized LH getInstance(){
        //判断实例是否创建 ，没有就创建一个
        if (instance == null){
            instance = new LH();
        }
        return instance;
    }
}
/**
 * 饿汉模式
 * */
class  Hungry {
    private Hungry(){}
    public static Hungry instance = new Hungry();
    public static Hungry getInstance(){
        return instance ;
    }
}