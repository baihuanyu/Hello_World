package day26net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 模拟服务器端口
 * */
public class TestSever {

    private ServerSocket ss;

    public TestSever() throws IOException {
        System.out.println("服务器初始化");
        ss = new ServerSocket(8880);
        System.out.println("初始化成功");
    }
    public void start() throws IOException {
        System.out.println("正在等待客服端链接");
        //监听客服端的链接 保证服务器一直开启 此处accept是客服端的数据
        Socket accept = ss.accept();
        //通过服务器获取客服端的ip
        String ip = accept.getInetAddress().getHostAddress();
        System.out.println("当前链接的客服端的ip："+ip);
        // 获取客服端发送的
        InputStream stream = accept.getInputStream();
        //获取输入流
        InputStreamReader isr = new InputStreamReader(stream);
        //包装成缓冲字符流
        BufferedReader reader = new BufferedReader(isr);
        String s = reader.readLine();
        System.out.println("客服端的信息："+s);

    }

    public static void main(String[] args) throws IOException {
        TestSever testSever = new TestSever();
        testSever.start();

    }
}
