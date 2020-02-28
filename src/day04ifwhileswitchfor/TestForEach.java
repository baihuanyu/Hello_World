package day04ifwhileswitchfor;

public class TestForEach {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,8,9};
        //foreach 不能使用需要有索引操作的
        for (int i:arr) {
            System.out.println(i);
        }
    }
}
