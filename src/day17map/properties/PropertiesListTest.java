package day17map.properties;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Properties;

/**
 *	Properties类：常用来做配置文件
 *		Properties文件不支持中文，所以，写在文件中的中文看到的是十六进制格式
 *		文件中注释用#，可以通过插件显示中文注释内容
 *
 *		1. 概念：就是一个特殊的HashTable，key和value都是String类型，常用来做配置文件
 *		2. 作用：
 *				解决了Java编程中的硬编码问题。
 *
 *		3. 使用：一定要使用Properties自己的方法，才能使key和value都是String类型
 *			3.1. 将内存中的数据，写出到硬盘
 *				void list(PrintStream out) 将此属性列表打印到指定的输出流。
                void list(PrintWriter out) 将此属性列表打印到指定的输出流。
 *			3.2. 将硬盘中的数据，读取到内存
 *				void load(InputStream inStream) 从输入字节流读取属性列表（键和元素对）。
                void load(Reader reader) 以简单的线性格式从输入字符流读取属性列表（关键字和元素对）。
 */
public class PropertiesListTest {
    public static void main(String[] args) {
        //将内存写出到硬盘
        //1.创建一个properties类
        Properties p = new Properties();
        //2. 调用Properties中setProperty(key, value)方法，给当前对象赋值
        p.setProperty("uname","admin");
        p.setProperty("pwd","root");
        /*
		 * 步骤3. 调用Properties对象的list方法，将内存中数据写出到硬盘
		 * 		void list(PrintStream out) 将此属性列表打印到指定的输出流。
		 *
		 * 			这里需要PrintStream对象，所以需要从API中找到构造方法(找最熟悉)
		 *					PrintStream(String fileName) 使用指定的文件名创建新的打印流，无需自动换行。
		 *						fileName：文件名
		 *							1. 绝对路径：是从盘符（Windows）或者根目录（Linux）开始的
		 *							2. 相对路径：是从当前项目开始，保存到当前项目下
		 *
				void list(PrintWriter out)
				使用IO流的时候，必须要记得关流： close();用finally
		 */
        //参数写入的文件名字 可以是绝对路径 也可以是相对路径
        PrintStream ps = null;
        try {
             ps = new PrintStream("XXXXXXXXX");
             //调用写入方法
             p.list(ps);
            System.out.println("写入成功!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("写入失败");
        }finally {
            //判断 当ps不是空的时候要关流
            if (ps != null) {
                ps.close();
            }
        }

    }
}
