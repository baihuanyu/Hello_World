package day26net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 通过方法获取本机地址和ip
 * */
public class TestGetIp {
    public static void main(String[] args) throws Exception {
        InetAddress localHost = InetAddress.getLocalHost();
        //bhy.local/192.168.0.108
        System.out.println(localHost);
        //通过域名获取ip地址
        InetAddress name = InetAddress.getByName("www.baidu.com");
        System.out.println(name);

    }
}
