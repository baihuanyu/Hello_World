package day26net.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 模拟tomcat
 * */
public class TomcatSever {
    //服务端 套接字
    private ServerSocket ss ;
    /** 通过构造方法去生成*/
    public TomcatSever() throws IOException {
        ss = new ServerSocket(8888);
    }
    /**工作方法*/
    public void start() throws IOException {
        //阻塞客服端 得到的是客户端的socket
        Socket socket = ss.accept();
        //创建流 输入 输出流 读取socket的内容，并写在指定地方
        FileInputStream fis = new FileInputStream("day26net/tcp/login.html");
        BufferedReader bf = new BufferedReader(new InputStreamReader(fis));

        OutputStream stream = socket.getOutputStream();
        PrintStream ps = new PrintStream(stream);
        // 设置响应状态， 必须准守http协议
        ps.println("HTTP/1.1 200 OK");
        //告诉浏览器 响应状态
        ps.println("Content-Type:text/html;charset=UTF-8");
        // 设置一个空行表示结束
        ps.println();
        //读取内容
        String s =null;
        while ((s=bf.readLine())!=null){
            //写入读取的内容
            ps.println(s);
        }
        //关流
        ps.close();
        bf.close();

    }

    public static void main(String[] args) throws Exception {
        TomcatSever tomcatSever = new TomcatSever();
        while (true){
            tomcatSever.start();
        }
    }
}
