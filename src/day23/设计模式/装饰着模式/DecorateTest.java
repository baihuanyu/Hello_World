package day23.设计模式.装饰着模式;
/**
 * 主要用于当导入的jar包无法满足使用，需要扩大他的功能的时候
 *
 * */
public class DecorateTest {
    public static void main(String[] args) {
        String str = "";
        StringUtil util = new StringUtil();
        // 加强钱
        System.out.println(util.isNull(str));
        // 加强后
        StringUtilPlus utilPlus = new StringUtilPlus(util);
        System.out.println(utilPlus.isNullPlus(str));
    }
}
/**
 * 字符串工具类
 * */
class StringUtil{
    /**判断字符串是否为null*/
    public boolean isNull(String str){
        if (str == null) {
            return true;
        }
        return false;
    }
}
/**
 * 字符串工具加强类，
 *
 * */
class StringUtilPlus{
    StringUtil util;

    public StringUtilPlus(StringUtil util) {
        this.util = util;
    }

    /**在原有的基础上添加判断""也为空*/
    public boolean isNullPlus(String str){
        if (util.isNull(str)){
            return true;
        }else if (str.equals("")){
            return true;
        }
        return false;
    }
}