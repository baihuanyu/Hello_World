package day05constructor;
/*
* 定义一个方法 比较两个数的大小
* 定义一个方法 比较三个数的大小
*
* */
public class Pratice02 {

    public static void main(String[] args) {
        System.out.println(compare(1,2,3));
        message("baihuanyu",0);
        System.out.println(add(0));
        chen(6);
    }
    // 输入一个数 传出对应的乘法表：
    public static void chen(int b){
        for(int i=1;i<b+1;i++){
            for (int j=1;j<i+1;j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
        System.out.println();//换行在第一个for里面
        }
    }


    // 定义一个方法 求出传入数据和0之间的3的倍数的和
    public static int add(int a){
        int sum = 0;
        for (int i =0;i<=a;i++){
            if (i%3==0){
                sum +=i;
            }
        }

        return sum;
    }
    // 定义一个方法 返回名字和成绩
    public  static String message(String name,int score){
        return ("姓名："+name+"  成绩:"+score);
    }



    public static int compare(int a, int b,int c) {
       // return (a > b ? (a > c ? a : c) : (b > c ? b : c));
        int max = (a > b ? (a > c ? a : c) : (b > c ? b : c));
        return max;

    }
}