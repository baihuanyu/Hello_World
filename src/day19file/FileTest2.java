package day19file;

import java.io.File;
import java.io.IOException;

/**
 * 创建文件的方法
 *
 * */
public class FileTest2 {
    public static void main(String[] args) {
        //1.获取对象
        File file = new File("001.text");
        //2 使用放个creatNewfile创建一个文件
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
