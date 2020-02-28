package codePractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

/**
 * 2、请写一个工具类DisposeFileUtil，该类有两个方法，一个是从硬盘中读取文件，
 * 	一个是写出到硬盘一个文件
 * 	1. writeToDisk(String fileName);
 * 	2. readFromDisk(String fileName);
 * 	文件名称自定义
 *    测试类，只需要将两个方法完成功能后打印输出即可
 * */
public class DisposeFileUtil {
    //写出到硬盘的方法
    public void writeToDisk(String fileName){
        //1 创建properties对象
        Properties p = new Properties();
        p.setProperty("uname","admin");
        p.setProperty("pwd","root");
        //调用写入的方法
        PrintStream ps = null;
        try {
            ps = new PrintStream(fileName);
            p.list(ps);
            System.out.println("写入成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("写入失败");
        }finally {
            //进行关流
            if (ps!= null) {
                ps.close();
            }
        }
    }
    // 重硬盘读取的方法
    public void readFromDisk(String fileName) {
        //创建porperties对象.
        Properties p = new Properties();
        //创建读取类对象
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
            try {
                p.load(fis);
                System.out.println("账号名："+p.getProperty("uname"));
                System.out.println("密码:"+p.getProperty("pwd"));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("读取失败");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
