package day15thread.音乐线程案例;

public class DownloadThreadImpl implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <=50 ; i++) {
            System.out.println("这是下载业务类");
        }
    }
}
