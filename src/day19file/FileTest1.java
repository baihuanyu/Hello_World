package day19file;

import java.io.File;
import java.io.IOException;

/**
 * 文件测试类
 * 创建file对象的三种方法
 *
 * @author shirokansakai*/
public class FileTest1 {
    public static void main(String[] args) {
        
        //第一种创建File的方式  File(String pathname)   推荐使用这种方式
        File file = new File("/Users/shirokansakai/Desktop/老司机带带我.mp4");
        try {
            boolean newFile = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.delete();
        
        //第二种方式  File(File parent, String child)
//        File parent = new File("H:\\");
//        File file1 = new File(parent,"Java\\OOO\\老司机带带我.mp4");

        //第三种方式   File(String parent, String child)
//        File file2 = new File("H:\\","Java\\OOO\\老司机带带我.mp4");


    }
}
