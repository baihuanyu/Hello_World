package day14excepion.homework;
/**
 *  自定义异常：
 *       1。继承异常类
 *       2。 必须有有参无参构造
 *
 *
 * */
public class CustomException1 extends Exception {
    /**
     * 生成识别码
     * */
    private static final long serialVersionUID = -2398756623427483501L;

    public CustomException1() {
    }

    public CustomException1(String message) {
        super(message);
    }
}
