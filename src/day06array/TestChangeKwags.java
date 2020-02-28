package day06array;

public class TestChangeKwags {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,6,8,4,6};
        test(arr);
    }
    public static void test(int... ar){//收集参数比较灵活 数组长度的改变不受影响
        int sum=0;
        for (int i = 0; i <ar.length ; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}
