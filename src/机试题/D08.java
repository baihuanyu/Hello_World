package 机试题;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 8.	使用IO流实现文件的拷贝
 *
 */

public class D08 {
    public static void main(String[] args) {
        //先读取文件
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("斗破苍穹.txt");
            fos = new FileOutputStream("D08.txt");
            byte[] by = new byte[1024];
            int num = 0;
            while ((num = fis.read(by)) != -1){
                fos.write(by,0,num);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
