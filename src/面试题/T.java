package 面试题;

import java.io.File;
import java.util.Arrays;

public class T {
    public static void main(String[] args) {
       /*5.	编程题：把一个目录（包换若干子目录，子目录下面还有若干子目录）下所有的文件名打印出来*/
        File file = new File("/Users/shirokansakai/Downloads/面试笔试题");
        f(file);

    }
    /** 打印文件名字的方法*/
    public static void f(File file){
        /*如果是文件夹*/
        if (file.isDirectory()){
            //列出所有内容
            File[] files = file.listFiles();
            for (File file1 : files) {
                //判断是否是文件
                if (file1.isFile()){
                    System.out.println(file1.getName());
                }else {
                    f(file1);
                }
            }
        }
    }
}
