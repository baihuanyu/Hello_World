package day12usualclass.随机数相关的类;

import java.util.UUID;

/**	UUID（Universally Unique Identifier）通用唯一识别码： 表示128位二进制值，32位十六进制	推荐使用
 *			一般用来做数据库唯一标识符：主键（primary key）
 *
 * UUID构造方法：
 *          UUID(long mostSigBits, long leastSigBits)
 *              构造一个新 UUID使用指定的数据。
 *
 * static UUID	randomUUID()
 *              静态工厂检索一个类型4（伪随机生成）的UUID。
 *
 *
 * */
public class UUIDTest {
    public static void main(String[] args) {
        String s = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        System.out.println(s);
    }
}
