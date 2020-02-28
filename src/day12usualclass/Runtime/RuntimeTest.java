package day12usualclass.Runtime;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        /**
         *static Runtime	getRuntime() 此类类似于单例设计模式 需要用此方法获取实例；
         *                 返回与当前Java应用程序关联的运行时对象。
         *
         *
         * Process	exec(String command) 用于运行应用程序  返回进程
         *           在单独的进程中执行指定的字符串命令
         * */
        Runtime runtime = Runtime.getRuntime();// 获取实例
        //打开网易云实例
        runtime.exec("/Applications/NetEaseMusic.app/Contents/MacOS/NetEaseMusic");
    }
}
