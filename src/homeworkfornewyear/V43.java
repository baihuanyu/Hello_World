package homeworkfornewyear;
/**
 * 递归打印1-100。
 *
 * */
public class V43 {
    public static void main(String[] args) {
        V43.printNmuber(3);
    }

    public static void printNmuber(int num){
        if (num == 1) {
            System.out.println(1);
            return;
        }else
            printNmuber(num-1);
            System.out.println(num);
            return;
    }
}
