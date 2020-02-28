package homeworkfornewyear;
/*
49.		天朝有一个乞丐姓洪，去天桥要钱
        第一天要了1块钱
        第二天要了2块钱
        第三天要了4块钱
        第四天要了8块钱
        以此类推

        问题： 洪乞丐干10天，收入是多少？代码实现
*/

public class V49 {
   /** public static void main(String[] args) {
        int sum =0;
        for (int i = 0; i <10 ; i++) {
            sum+=2<<i-1;// 左移一次相当于乘2
        }
        System.out.println("乞丐10天要了："+(sum+1));
    }*/
   public static void main(String[] args) {
       /**每天收入多少钱*/
       int eachday=0;
       /**共有多少天*/
       int day = 0;
       /**总计收入多少钱*/
       int total = 0;
       for (int i = 0; i <10 ; i++) {
           if (eachday == 0) {//第一天的收入
               eachday = 1;
           }else
               eachday *=2;//每天的收入都是钱一天的2倍。 也可以看成an = 2**（n-1）
                total+=eachday;
                day++;
       }
       System.out.println("乞丐第"+day+"天，共要了"+total+"钱");
   }
}
