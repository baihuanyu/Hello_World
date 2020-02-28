package day21IO.字节流字符流转换和打印流;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建一个记录聊天记录的类
 * */
public class ChatMsgTest {
    public static void main(String[] args) {
        //创建读取和打印流
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("a.txt",true));
            //System.in 是InputStream类型的，代表键盘输入
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            boolean flg = true                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ;
            //无限循环聊天，当输入bye的时候退出
            while (true){
                //提示说话
                System.out.println("请"+(flg?"张三":"李四")+"发表讲话");
                //读取一行
                String s = r.readLine();
                // 判断输入的是不是bye 区分大小写
                if ("bye".equalsIgnoreCase(s)){
                    System.out.println("聊天结束");
                    break;
                }
                // 加入聊天时间
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
                String format = sdf.format(date);

                //打印到日日志里面去 格式 时间 人 内容
                ps.println(format+(flg?"张三：":"李四：")+s);
                // 将flg取反 一人一次对话
                flg = !flg;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
