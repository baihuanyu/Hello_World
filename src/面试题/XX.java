package 面试题;

public class XX {
    public static void main(String[] args) {
        System.out.println(4&7);

    }
    public static int addAll(int ...a){
        int sum = 0;
        for (int i = 0; i <a.length ; i++) {
            sum += a[i];
        }
        return sum ;
    }
}
