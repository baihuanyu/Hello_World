package day21IO.字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 通过字节流 把文件复制到另一个
 *
 * */
public class FileCopyTest {
    public static void main(String[] args) throws Exception {
        //创建写入对象
        FileOutputStream fos = new FileOutputStream("豆豆.txt",true);
        //创建读取对象
        FileInputStream fis = new FileInputStream("斗破苍穹.txt");
        // 进行读取并写入
        byte[] b = new byte[1024];
        int num = 0 ;
        while ((num=fis.read(b))!=-1){
            //读多长，写多长
            fos.write(b,0,num);
        }
        // 关流规则， 先开后关
        fos.flush();
        fos.close();
        fis.close();
        System.out.println("复制成功！！！");

    }
}
