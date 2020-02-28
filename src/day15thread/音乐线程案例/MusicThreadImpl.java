package day15thread.音乐线程案例;

public class MusicThreadImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <50 ; i++) {
            System.out.println("这是音乐业务类");
        }
    }
}
