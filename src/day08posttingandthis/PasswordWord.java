package day08posttingandthis;

/**用于测试*/
public class PasswordWord {
    public static void main(String[] args) {
        // 使用默认密码
        Password p = new Password("zhangsan");
        p.show();
        // 不使用默认密码
        Password p1 = new Password("nisi","123456");
        p1.show();
    }
}
