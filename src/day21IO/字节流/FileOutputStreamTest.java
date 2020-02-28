package day21IO.字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 输出流/写入
 * 利用字节输出流向指定文件中写入"helloworld"字符串
 *
 *      FileOutputStream(File file)
 * 		FileOutputStream(String name)
 * 		FileOutputStream(File file,boolean append) 表示是否可以追加
 * 		FileOutputStream(String fileName,boolean append)
 *
 *
 * 		public void write(int b)   将指定字节写入次文件输出流
 * 		public void write(byte[] b)  将b.length个字节从指定byte数组写入到文件输出流中去。
 * 		public void write(byte[] b,int off,int len) 指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。
 * */
public class FileOutputStreamTest {
    public static void main(String[] args) throws Exception {
        //输出流/写入  如果没有文件会自动创建一个
        //使用第二个构造方式创建
        FileOutputStream fos = new FileOutputStream("斗破苍穹.txt");
        //写入10行helloworld
        for (int i = 0; i <10 ; i++) {
            fos.write("hello,world".getBytes());
            //表示换行
            fos.write("\n".getBytes());
        }
        //用完之后刷新，和关流
        fos.flush();
        fos.close();

    }
}
