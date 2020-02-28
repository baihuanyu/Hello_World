package day05constructor.codePractice;

public class V01 {
    public static void main(String[] args) {
		/*int sum=0;
		for(int i=10;i<=30;i++){
			//2.判断是否是奇数
			if (i%2!=0) {//获取所有的奇数
				sum=sum+i;
			}
		}
		System.out.println(sum);
		*/
        int i =10;
        int sum=0;
        do{
            if (i%2!=0) {//获取所有的奇数
                sum=sum+i;
            }
            i++;
        }while(i<=30);
        System.out.println(sum);

    }

    private static void t9() {
        //十二、用for循环计算1-10的积
        int sum=1;
        for(int i=1;i<=100;i++){
            sum*=i;
        }
        System.out.println(sum);
    }
}
