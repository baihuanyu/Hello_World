package day04ifwhileswitchfor;

public class TestPrintStar {
    public static void main(String[] args) {
        /*
         *****
         *****
         *****
         *****
         *****
                 */
        for (int i = 1;i<6;i++){
            for (int j =1;j<6;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
         *
         * *
         * * *
         * * * *
         * * * * *   */
        for (int i = 1;i<6;i++){
            for (int j =1;j<6;j++){
                if (j<=i){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i =1 ; i <=5;i++){
            for(int j =5;j>=1;j--){
                if (j>i){
                System.out.print("* ");
                }else{
                    System.out.print(" ");
                }

            }
        System.out.println();
        }
        System.out.println("============================================================================");
        for (int i =1;i<6;i++){
            for (int j =1;j<6-i;j++){
                System.out.print(" ");
                }
            for(int k =1;k<i+1;k++){
                System.out.print("* ");
                }
        System.out.println();
        }
    }

}
