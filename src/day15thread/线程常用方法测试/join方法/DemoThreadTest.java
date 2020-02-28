package day15thread.线程常用方法测试.join方法;
/**
 * 测试类
 * */

class DemoThreadTest {
    public static void main(String[] args) {
        //创建下载线程对象
        DownloadThread downloadThread = new DownloadThread();
        //创建显示线程对象
        ShowThread showThread = new ShowThread(downloadThread);
        //线程启动
        downloadThread.start();
        showThread.start();
    }
}