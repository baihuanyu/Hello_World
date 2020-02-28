package homeworkfornewyear;
/**
 * 计算2000年到2008年多少天
 * */
public class V09 {
    public static void main(String[] args) {
        // 用于统计总共天数
        int sum = 0;
        int day;
        for (int i = 2000; i <2008 ; i++) {
            if ((i%4==0&&i%100!=0) || i%400==0 ){//闰年的定义：是4的倍数但不是100的倍数但是400的倍数
                day =366;
            }else{
                day = 365;
            }
            sum += day;
        }
        System.out.println("共有:"+sum+"天");
    }
}
