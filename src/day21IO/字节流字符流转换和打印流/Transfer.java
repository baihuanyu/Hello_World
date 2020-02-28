package day21IO.字节流字符流转换和打印流;

import java.io.*;

/**
 * 字节流和字符流的相互转换
 *
 * */
public class Transfer {
    public static void main(String[] args) {
        // 字节流转换为字符流
        try {
            Reader r = new InputStreamReader(new FileInputStream("豆豆.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 字符流转换为字节流
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("豆豆.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
