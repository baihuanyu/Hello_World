package day21IO.字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;


/**
 *          public int read()
 * 				从此输入流中读取一个数据字节。
 * 			public int read(byte[] b)   推荐使用这种方式
 * 				从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
 * 			public int read(byte[] b,int off,int len)
 * 				从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。off:目标数组 b 中的起始偏移量
 *
 *
 * */
public class FileInptStreamTest {
    public static void main(String[] args) throws Exception {
        /**构造方法一：
         * FileInputStream(File file)
         *     打开一个连接到一个实际的文件创建一个 FileInputStream，文件在文件系统的 File对象 file命名。
         * */
//        File file = new File("斗破苍穹.txt");
//        FileInputStream fis = new FileInputStream(file);
        /**构造方法二：
         * FileInputStream(String name)
         * 打开一个连接到一个实际的文件创建一个 FileInputStream，文件由文件系统中的路径名 name命名
         *
         * */
        FileInputStream fis = new FileInputStream("斗破苍穹.txt");
        System.out.println("--------第一种读取方式------");
		/**long startTime = System.currentTimeMillis();
		int num = 0;
		read()方法   当文件读取到末尾的时候返回-1   ,每次读取一个字节，所有说如果读取大文件时效率会比较低
		while((num = fis.read())!=-1){

		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
         */

        System.out.println(" =====第二种读取方式======= ");
        //进行读取
        //设定每次读取长度
        byte[] by = new byte[1024];
        //保证不会读取到重复数据
        int num2 = 0 ;
        //使用while循环读取
        while((num2=fis.read(by)) !=-1){
            //使用String构造方法把读取出来的转换成字符串
            //参数： 第一个 数组 第二个 开始位置， 第三个 长度
            String s  = new String(by, 0, num2);
            System.out.println(s);
        }

        System.out.println("======第三种读取方式======");
        //创建缓冲区
        byte[] by3 = new byte[1024];
        int num3 = 0;
        while ((num3 = fis.read(by3,0,by3.length))!=-1){
            String s = new String(by3, 0, num3);
            System.out.println(s);
        }
        fis.close();

    }

}
