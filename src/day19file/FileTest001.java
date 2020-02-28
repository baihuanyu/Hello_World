package day19file;

import java.io.File;
import java.util.ArrayList;

/**
 * 查找自定文件夹里面的相关文件
 * */
public class FileTest001 {
    public static void main(String[] args) {
        File file = new File("/Users/shirokansakai/Desktop/test");
        getFiles(file,"txt");
    }
    public static void getFiles(File file , String str){
        //创建一个数组用于接收查找出来的
        ArrayList<File> result = new ArrayList();
        //判断文件夹是否为空或者是不是目录
        if (file != null && file.isDirectory()){
            //如果不是空的，判断是否有内容
            if (file.length() != 0 ) {
                //转换成数组遍历
                File[] files = file.listFiles();
                for (File file1 : files){

                    //判断是否以指定结尾
                    if (file1.getName().endsWith(str)) {
                        //添加出去
                        result.add(file1);
                    }
                }
            }
        }
        System.out.println(result);
    }
}
