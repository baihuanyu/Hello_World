package day15thread.线程通信之生产者消费者模式;
/**
 *消费者业务类
 * */
public class ConsumerThreadImpl implements Runnable{
    private Book book;

    public ConsumerThreadImpl(Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        int i = 30;
        while(i > 0){
            String name = Thread.currentThread().getName();
            synchronized (book){
                //如果有书
                if (!book.flag){
                    try {
                        book.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(name+"购买了"+book.getName()+ "花了："+book.getRmb()+"rmb");
                book.flag = false;
                book.notify();
            }
            i--;
        }
    }
}
