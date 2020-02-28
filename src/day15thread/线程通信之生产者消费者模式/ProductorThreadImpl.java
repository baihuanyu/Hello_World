package day15thread.线程通信之生产者消费者模式;
/**
 * 生产者业务类
 * */
public class ProductorThreadImpl implements Runnable{
    private  Book book;
    /**表示书的数量*/
    private int num = 0 ;

    public ProductorThreadImpl(Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        while (true){
            String name = Thread.currentThread().getName();
            synchronized(book){
                if (book.flag ) {
                    try {
                        book.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 假如是偶数就生产三国演义 基数就生产西游记
                if (num%2==0){
                    book.setName("三国演义");
                    book.setRmb("199");
                }else{
                    book.setName("西游记");
                    book.setRmb("188");
                }
                System.out.println(name+"生产了"+book.getName()+"售价"+book.getRmb());
                num++;
                book.flag = true;
                book.notify();

            }
        }
    }
}
