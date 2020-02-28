package day15thread.音乐线程案例;
/**
 *
 *
 * */
public class MusicThread extends Thread {
    @Override
    public void run() {//线程执行后 就要执行的方法
        System.out.println("音乐线程");
    }
}
