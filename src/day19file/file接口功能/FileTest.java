package day19file.file接口功能;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * 过滤器*/
public class FileTest {
    public static void main(String[] args) {

    }
}
class A implements FilenameFilter{

    @Override
    public boolean accept(File dir, String name) {
        //参数表示 1 传入路径 二 文件名字
        return name.endsWith("avi");
    }
}
class  B implements FileFilter{


    @Override
    public boolean accept(File pathname) {
        //此处只传入文件路径
        if (pathname.isDirectory()) {
            return false;
        }else {
            // 返回匹配规则
            return pathname.getName().endsWith("avi");
        }
    }
}