package day15thread.线程常用方法测试.join方法;
/**
 *  显示方法
 * */
public class ShowThread extends Thread{
    /**
     * 需要等下载完了之后才能显示 需要用到业务线程join
     *  步骤， 1先创建一个成员变量 接下来才能使用
     *        2 用show的构造方法给变量赋值
     * */
    private DownloadThread downloadThread;

    public ShowThread(DownloadThread downloadThread) {
        this.downloadThread = downloadThread;
    }

    @Override
    public void run() {
        try {
            downloadThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("图片");
    }
}
