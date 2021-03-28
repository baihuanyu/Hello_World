package Thread;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/12/23
 */
public class TestCurrentLinkedQueue {
       static Queue<String> queue = new ConcurrentLinkedQueue<>();

       static {
           for (int i = 0; i <100 ; i++) {
               queue.add("a"+i);
           }
       }

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            new Thread(()->{
                while (true){
                    String s = queue.poll();
                    if (s ==null) break;
                    System.out.println("获得了"+s);
                }
            }).start();
        }
    }
}
