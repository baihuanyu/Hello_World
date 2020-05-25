package day19file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * 基本获取功能
 * 		public String getAbsolutePath()  获取绝对路径
 * 		public String getPath()  获取相对路径
 * 		public String getName()  获取名称
 * 		public long length()  获取长度，字节数
 * 		public long lastModified()  获取最后一次修改时间，毫秒值
 * 	重命名
 * 		public  boolean renameTo(File dest)
 *
 * */
public class FileTest4 {
    public static void main(String[] args) {
        //创建文件夹
        File file = new File("/Users/shirokansakai/Desktop//test/1.txt");

        try {
            file.renameTo(new File("hahaha"));
            System.out.println("创建成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        file.mkdirs();
        //判断是否是目录
        boolean directory = file.isDirectory();
        System.out.println(directory);
        //获取绝对路径
        File absoluteFile = file.getAbsoluteFile();
        System.out.println(absoluteFile);
        //获取相对路径
        String path = file.getPath();
        System.out.println(path);
        // 文件夹标记为一个数组
        File[] files = file.listFiles();
        System.out.println(Arrays.toString(files));
        //获取最后一次修改的时间
        long l = file.lastModified();
        System.out.println(l);
        boolean delete = file.delete();
        // 判断是不是文件
        file.isFile();
        System.out.println(delete);
    }
}
