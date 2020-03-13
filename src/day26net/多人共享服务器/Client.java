package day26net.多人共享服务器;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * 客服端 与主机无限对话， 直到bye
 * */
public class Client {
    public static void main(String[] args) {
        try {
            //获取主机链接
            Socket s = new Socket("localhost", 8888);
            //创建输入流获取输入的信息
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //创建输入流获取服务器发送的信息
            BufferedReader r = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //创建一个打印流给客服端发送信息
            PrintStream ps = new PrintStream(s.getOutputStream());
            while (true){
                System.out.println("请输入你要发送的消息");
                String str = br.readLine();
                ps.println(str);
                //获取客服端回话
                if ("bye".equalsIgnoreCase(str)){
                    break;
                }
                String ss = r.readLine();
                System.out.println("服务器消息是："+ss);

            }
            //关流
            ps.close();
            r.close();
            br.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
