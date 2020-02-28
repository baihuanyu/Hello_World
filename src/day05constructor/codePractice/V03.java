package day05constructor.codePractice;

public class V03 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6-i ;j++){// 内层的变化规律 5 4 3 2 1
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void t2() {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){ //内层循环的次数 发生变化
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
