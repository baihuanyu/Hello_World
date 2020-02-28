package Object;

public class ToString {
    public String toString() {
        //     得到字节码文件+全限定路径名字       把哈希值转换成16进制
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
