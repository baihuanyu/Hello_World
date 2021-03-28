package Thread;

import java.util.concurrent.LinkedBlockingQueue;

/**
 *  生产者消费者模型 阻塞的队列
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/12/23
 */
public class TestLikedBlockIngQueue {
    public static void main(String[] args) {
        LinkedBlockingQueue<Object> queue = new LinkedBlockingQueue<>();
        for (int i = 0; i <2 ; i++) {
            int finalI = i;
            new Thread(()->{
                try {
                    while (queue.isEmpty()){
                        queue.put("a"+ finalI);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        for (int i = 0; i <10 ; i++) {
            new Thread(()->{
                try {
                    System.out.println(Thread.currentThread().getName()+queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
