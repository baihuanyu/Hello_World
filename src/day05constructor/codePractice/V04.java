package day05constructor.codePractice;

public class V04 {
    public static void main(String[] args) {
        //定义一个计数器
        int c=0;
        //用来累加数字和
        int sum=0;
        //1.获取 88 -200 的所有数
        for(int i=88;i<=200;i++){
            //2.获取所有3的倍数
            if(i%3==0){
                //取 前10个数
                //System.out.println(i);
                sum+=i;
                c++;
            }
            //3.当计数器达到10的时候
            if (c==10) {
                //终止循环
                break;
            }

        }
        System.out.println(sum);

    }
    //return 语句
    private static void t3() {
        for (int i = 1; i <=5; i++) {
            System.out.println("i============="+i);
            for (int j = 1; j <=5; j++) {
                System.out.println("j="+j);
            }
            return;
        }
    }
    //continue
    private static void t2() {
        for (int i = 1; i <=5; i++) {
            System.out.println("i============="+i);

            for (int j = 1; j <=5; j++) {
                if(j==3){
                    continue;
                }
                System.out.println("j="+j);
            }
        }
    }
    //break
    private static void t1() {
        for (int i = 1; i <=5; i++) {
            System.out.println("i============="+i);
            for (int j = 1; j <=5; j++) {
                System.out.println("j="+j);
                if (j==3) {
                    break;
                }
            }

            //break;
        }
    }
}
