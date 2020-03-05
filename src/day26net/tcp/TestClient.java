package day26net.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *  客服端
 * */
public class TestClient{
    private Socket ss ;
    /** 初始化客服端*/
    public TestClient() throws IOException {
        System.out.println("正在链接。。。。。");
        ss = new Socket("localhost",8880);
        System.out.println("链接成功！");
    }
    public void start(){
        //获取ip地址
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        //通过客服端向服务器发送数据，
        try {
            // 获取输出流
            OutputStream out = ss.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(out);
            writer.write("你好啊。。。。。");
            writer.flush();
            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        TestClient testClient = new TestClient();
        testClient.start();

    }
}
