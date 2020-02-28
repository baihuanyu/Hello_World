package day04ifwhileswitchfor;

public class Practice02 {
    public static void main(String[] args) {
        //1.	用for循环计算1-10的 积
        int sum1 =1;
        for (int i=1;i<11;i++){
            sum1 = sum1*i;
        }
        System.out.println(sum1);
        //1.求1-5的 的阶乘和(1!+2!+3!+4!+5!)
        int sum2 = 0;
        for (int i =1;i<6;i++){
            int ji =1;
            for (int j=1;j<=i;j++){
                ji *= j;
            }
            System.out.println(ji);
            sum2 +=ji;
            System.out.println("前"+i+"的阶层的和是："+sum2);
        }
        //七、	10到30之间所有奇数的和（用do-while实现）。
        int i3 =10;
        int sum3 = 0;
        do {
            if (i3%2!=0){
                sum3 +=i3;
            }
            i3++;
        }while(i3<=30);
        System.out.println(sum3);



    }

}
