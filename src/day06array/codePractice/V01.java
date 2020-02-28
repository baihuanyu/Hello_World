package day06array.codePractice;

public class V01 {
    static boolean  b;
    public static  void main(String[] args) {
        System.out.println(b);
        //4.计算  1！ + 2！ + 。。。10！ 1到10的阶乘和
        int count=0;
        for (int i = 1; i <= 10; i++) {
            int sum=1;
            for (int j = 1; j <=i; j++) {
                sum*=j;
            }
            count+=sum;
        }
        System.out.println(count);

    }

    public void add(){

    }
    public void add2(){
        add();
    }
}
