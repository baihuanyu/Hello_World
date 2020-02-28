package day15thread.线程通信之生产者消费者模式;
/**
 * 生产和消费测试类
 *
 *
 * */
public class ThreadTest {
    public static void main(String[] args) {
        Book book = new Book();
        ConsumerThreadImpl consumerThread = new ConsumerThreadImpl(book);
        ProductorThreadImpl productorThread = new ProductorThreadImpl(book);

        Thread thread = new Thread(consumerThread, "消费者");
        Thread thread1 = new Thread(productorThread, "生产者");
        thread.start();
        thread1.start();


    }
}
