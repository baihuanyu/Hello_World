package day26net.多人共享服务器;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * 服务器线程
 *  提供读写操作
 * */
public class SeverThread extends Thread {
    private Socket s ;
    //创建一个构造方法给s复制
    public SeverThread(Socket s){
        this.s = s;
    }
    @Override
    public void run() {
        try {
            //获取输入流读取客服端发送的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //创建打印流用于回消息
            PrintStream ps = new PrintStream(s.getOutputStream());
            while(true){

                String str = br.readLine();

                if("bye".equalsIgnoreCase(str)){
                    System.out.println("客户端"+s.getInetAddress()+"已下线");
                    break;
                }
                System.out.println("客户端"+s.getInetAddress()+"发来的消息是:"+str);

                ps.println("I Receive!");
            }

            ps.close();
            br.close();
            s.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
