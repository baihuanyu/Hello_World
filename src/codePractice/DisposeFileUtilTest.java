package codePractice;

/**
 * 测试类
 * */

class DisposeFileUtilTest {
    public static void main(String[] args) {
        DisposeFileUtil ds = new DisposeFileUtil();
        ds.writeToDisk("myDataBase");
        ds.readFromDisk("myDataBase");
    }
}