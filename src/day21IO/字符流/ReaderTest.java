package day21IO.字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 *
 *
 * */
public class ReaderTest {
    public static void main(String[] args) throws Exception {
        //创建读取对象
        Reader r = new FileReader("斗破苍穹.txt");
        // 进行读取
        char[] c = new char[1024];
        int num = 0 ;
        while ((num=r.read(c))!=-1){
            String s = new String(c, 0, num);
            System.out.println(s);
        }
    }
}
