package day19file;

import java.io.File;

/**
 * 创建单级目录或者多级目录
 *
 * */
public class FileTest3 {
    public static void main(String[] args) {
        File file = new File("bhy/ww/1.txt");
        //创建多级目录， 如果父级目录不存在 就创建
        // 获取父级目录
        String parent = file.getParent();
        //通过父级目录判断是否存在
        File file1 = new File(parent);
        // 判断path是否存在
        boolean exists = file1.exists();
        if (!exists) {
            //如果不存在 那么就创建
            file1.mkdirs();
        }

    }
}
