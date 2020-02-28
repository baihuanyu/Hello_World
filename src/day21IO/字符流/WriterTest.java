package day21IO.字符流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Writer：字符输出流基类
 * 		FileWriter：子类
 *
 * 		FileWriter的构造方法
 * 		FileWriter(File file)
 * 		FileWriter(String fileName)
 * 		FileWriter(File file,boolean append)
 * 		FileWriter(String fileName,boolean append)
 *
 * 		public void write(String str)
 * 		public void write(String str,int off,int len)
 * 		public void write(int c)
 * 		public void writer(char[] cbuf)
 * 		public void write(char[] b,int off,int len)
 * 		注：字符流使用了缓冲区
 *
 * */
public class WriterTest {
    public static void main(String[] args) throws Exception {
        //创建一个写入对象
        Writer w = new FileWriter("斗破苍穹.txt",true);
        // 写入
        w.write("哈哈哈哈哈哈哈");
        //字符流存在缓冲区 ，如果不关流 那么文件不会写入
        w.flush();
        w.close();
        System.out.println("写入成功！！！");
    }
}
