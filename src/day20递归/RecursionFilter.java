package day20递归;

import java.io.*;

/**
 * 运用递归查询文件夹中的文件
 * */
public class RecursionFilter {
    public static void main(String[] args) {
        File file = new File("/Users/shirokansakai/Downloads/");
        getFile(file);
    }

    /**
     * 查询文件的方法
     * */
    public static void getFile(File file){
        // 假如是个文件
        if (file.isDirectory()){
            // 遍历文件 添加筛选器
            File[] files = file.listFiles(new MyFilter());
            for (File f:files) {
                //遍历 在继续调用
                getFile(f);
            }
        }
    }
}
class MyFilter implements FileFilter {
    // 重写筛选器的过滤规则
    @Override
    public boolean accept(File pathname) {
        // 写入到制定文件
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(new FileOutputStream("统计.txt",true));
            if (pathname.isDirectory()){
               return true;
           }else {
               String name = pathname.getName();
               if (name.endsWith(".txt")){
                   printStream.println(pathname);
                   return true;
               }
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printStream.flush();
        printStream.close();
       return false;
    }
}
class MyFilter1 implements FilenameFilter{

    @Override
    public boolean accept(File dir, String name) {
        if (name.endsWith(".txt")){
            return true;
        }
        return false;
        /*if (dir.isDirectory()){
            return true;
        }else if (name.endsWith(".txt")) {
            System.out.println(dir);
            System.out.println(name);
            System.out.println("---------------------------");
            return true;
        }
        return false;*/
    }
}
