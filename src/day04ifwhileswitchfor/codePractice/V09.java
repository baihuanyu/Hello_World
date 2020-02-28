package day04ifwhileswitchfor.codePractice;

public class V09 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i += 2) {
            /*
            *i: 1 - 3 -5 -7- 9 (11)
            *
            * */
            System.out.println("i=" + i);
        }

        /* j：1 4 7 10 14

          打印：2 5 8 11  */
        for (int j = 1; j++ <= 10; j += 2) {
            System.out.println("j=" + j);
        }
    }

}