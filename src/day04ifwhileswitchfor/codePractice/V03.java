package day04ifwhileswitchfor.codePractice;

public class V03 {
    public static void main(String[] args) {

        System.out.println(8 > 5 ? 8 : "5");

        //3>5?"XX":"OO";  "OO"
        //"OO";
        //boolean str = 8>5?8:"5";

        //应用
        /*int num = 98745;
        String  str= num%2==0?"偶数":"奇数";
        System.out.println(str);
        */

        /*     判断一个人的成绩等级   90-100  A
         *     				  80-89  B
         *                    ---
         *                    <30 下个班见
         */
        int s = 69;
        String str = s >= 90 && s <= 100 ? "A" : (s >= 80 && s <= 89 ? "B" : (s >= 70 && s <= 79 ? "C" : (s >= 60 && s <= 69 ? "D" : "下个班见")));

        System.out.println(str);
    }

}
