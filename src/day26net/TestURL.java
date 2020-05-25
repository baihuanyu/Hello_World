package day26net;

/*import org.apache.commons.io.IOUtils;*/

import java.io.FileWriter;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.douban.com");
        //获取输入流
        InputStream inputStream = url.openStream();
        //获取输出流
        FileWriter writer = new FileWriter("douban.html", true);
        //读取文件
        /*byte [] b = new byte[1024];
        int num = 0;
        while ((num = inputStream.read(b))!=-1){
            String s = new String(b, 0, num);
            writer.write(s);
        }
        inputStream.close();
        writer.close();*/
       /* IOUtils.copy(inputStream,writer);
        inputStream.close();
        writer.close();
    }*/
    }
}
