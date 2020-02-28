package homeworkfornewyear;
/**
 * 打印 1-100 之间的数，如果这个数，是3或者5的倍数，就忽略掉
 * */
public class V50 {
    public static void main(String[] args) {
        for (int i = 0; i <=100 ; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
