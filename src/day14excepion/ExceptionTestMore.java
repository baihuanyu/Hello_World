package day14excepion;
/**
 * 多异常处理
 * */
public class ExceptionTestMore {
    public static void main(String[] args) {
        System.out.println(divde("2.1","0"));
    }



    public static double divde(String s1 ,String s2){
        Double d1 = null;//设定两个空值来接收输入的字符串
        Double d2 = null;
        double result = 0;//设定一个数来接收结果
        try {//可能发生异常的地方
            d1 = Double.valueOf(s1);
            d2 = Double.valueOf(s2);
            result = d1/d2;
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("异常！！！！！");
        }catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println("请输入数字！");
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("除数不能为0");
        }
        return result;
    }

}
