package day15thread.线程常用方法测试.join方法;
/**
 * 下载线程
 *
 * */
public class DownloadThread extends Thread {
    @Override
    public void run() {
        System.out.println("正在下载。。。。。");
        for (int i = 0; i <101 ; i++) {
            try {
                Thread.sleep(100);//线程阻塞
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("下载进度："+i+"%");
        }
        System.out.println("下载完成");
    }
}
