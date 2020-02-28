package day04ifwhileswitchfor.codePractice;

public class V04 {
    public static void main(String[] args) {
        int age  =16;
        // 比较
        if (age>=18) {
            System.out.println("你已经18啦");
        }
        //逻辑判断
        if (age>=18 & age<=60) {
            System.out.println("你可以学Java了。。。");
        }
        // 只看类型不看值
        boolean b = false;
        if (b) {// 当直接使用false是 工具会认为下面的代码不会执行 没有意义，
            System.out.println("--------------");
        }
    }
}
