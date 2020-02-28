package day05constructor;

public class FindMax {
    public static void main(String[] args) {
        int [] arr={10,33,25,65,12,69};
        int max = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
