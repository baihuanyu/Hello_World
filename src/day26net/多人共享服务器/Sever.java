package day26net.多人共享服务器;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器
 *  无限接待
 *   当有新的链接，就分配新的线程给它
 * */
public class Sever {
    public static void main(String[] args) {
        try {
            // 创建一个服务器
            ServerSocket ss = new ServerSocket(8888);
            while (true){
                //接收客服端
                System.out.println("等一个有缘人");
                //链接上的客服端
                Socket s = ss.accept();
                //分配一个线程给它
                new SeverThread(s).start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
