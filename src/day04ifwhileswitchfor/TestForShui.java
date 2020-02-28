package day04ifwhileswitchfor;

public class TestForShui {
    public static void main(String[] args) {
        for (int n = 100;n<1000;n++){
            int i = n/100;
            int j = (n/10)%10;
            int k = n%10;
            if (n==i*i*i + j*j*j + k*k*k){
                System.out.println(n+"是水仙花数");
            }

        }
    }
}
