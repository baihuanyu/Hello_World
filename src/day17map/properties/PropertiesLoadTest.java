package day17map.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 重硬盘上读取数据
 * 过程： 1。 创建properties对象
 *       2。创建FileInptSteam对象 (注意作用域问题)
 *       3. 使用load方法写入
 *              (写入后获取信息用getProperty方法)
 *       4。关流
 * */
public class PropertiesLoadTest {
    public static void main(String[] args) {
        //创建对象
        Properties p = new Properties();
        //创建io类对象去读取文件
        FileInputStream fis =null;
        try {
            fis = new FileInputStream("XXXXXXXXX");
            //调用载入方法
            try {
                p.load(fis);
                //调用Properties中的方法将数据取出来
                //String getProperty(String key) 使用此属性列表中指定的键搜索属性。
                String uname = p.getProperty("uname");
                String pwd = p.getProperty("pwd");
                System.out.print("账户："+uname);
                System.out.println(" 密码："+pwd);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("载入失败");
        }finally {
            if (fis != null) {
                //需要关流
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}
