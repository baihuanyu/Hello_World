package day10polymorphic.codepractice;
/**
 * 枚举
 *
 * */
public enum EnumDemo {
    ACCEPT("接受"), // 本身是这个类的一个实例
    REFUSE("拒绝");// public static final EnumDEMo REFUSE = new EnumDemo（"拒绝"）；
    private String message;
    EnumDemo() {
    }

    EnumDemo(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return getMessage();
    }

    public static void main(String[] args) {
        System.out.println(ACCEPT);
    }
}
