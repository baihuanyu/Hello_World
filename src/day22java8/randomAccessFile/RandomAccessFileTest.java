package day22java8.randomAccessFile;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * 文件随机访问
 *
 * */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        // 文件名。 模式： r 读 w 写 rw 读写 如果没有文件会被创建
        try {
            RandomAccessFile rw = new RandomAccessFile("斗破苍穹.txt", "rw");
            //获取文件的长度
            System.out.println(rw.length());
            // void seek(long pos)  设置到此文件开头测量到的文件指针偏移量，在该位置发生下一个读取或写入操作。
            //指针重0开始
            rw.seek(rw.length()-1 );
            System.out.println((char)rw.read());
            rw.write("你好".getBytes());
            //void setLength(long newLength)   设置此文件的长度。
            //用于计算内存空间

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
