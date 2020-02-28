package day05constructor;
// 求88-200之间前10个3的倍数的和
public class Pratice01 {
    public static void main(String[] args) {
        int sum = 0;//求和
        int count = 0;//记数
        for (int i=88;i<=200;i++){
            if (i%3==0){
                sum +=i;
                count++;
                if (count>9){
                    break;
                }
            }
        }
        System.out.println("总和"+sum+"    个数："+count);
    }
}
