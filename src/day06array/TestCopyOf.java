package day06array;


import java.util.Arrays;

public class TestCopyOf {
    public static void main(String[] args) {

    int[] arr = {1, 2, 3};
    int[] newarr = Arrays.copyOf(arr, 4);
        System.out.println(Arrays.toString(newarr));
    }
}
