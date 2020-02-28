# 1.java跨平台实现原理
    jvm（java虚拟机）< jrf(java运行环境)<jdk
    即是java程序在不同平台上，运用虚拟环境进行运行。
# 2.第一次输出helloworld
    / public 修饰类名时 文件名字必须相同
    class day01.Hello{
        public static void main(String[]args){
            System.out.println("hello world");
            #其中println输出换行
            #print 输出不换行
        }
    }
    javac +文件.java 把文件解析成字节码后能运行
# 3. 如何寻找jdk的路径 以及环境变量的配置
   -  mac:打开终端（在launchpad-其他中可以找到）
    输入：/usr/libexec/java_home -V  
    不需要配置环境变量 
   -  win : 安装时自己注意
     环境变量的配置 计算机》属性》高级系统设置》环境变量
     -新建一个 名字【JAVA_HOME】 路径及jdk路径
      path设置{%JAVA_HOME%\bin} 名字与上面相同
      ps： %起匹配作用。
# 4. 常用的一些快捷键：
                 win：          mac：           
    1、复制快捷键：contorl+c      command+c  
    2、粘贴快捷键：contorl+v      command+v
    3、剪切       x 
    4、保存       s
    5、打开终端   win+r           老老实实打开
    ....