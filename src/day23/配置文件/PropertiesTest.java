package day23.配置文件;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 配置文件的写法
 *
 * */
public class PropertiesTest {
    public static void main(String[] args) {
        // 特俗的map 键值对都是string
        Properties ps = new Properties();
        //获取文件   这样写没有写死文件 并获得一个流
        InputStream ras = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
        // ps.load 需要传入一个输入流
        try {
            ps.load(ras);
            // 根据key 获取值
            //ps.getProperty();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
