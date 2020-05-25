package 面试题;

public class Do {
    public static void main(String[] args) {
        System.out.println(doWork());

    }
    public static int doWork() {
            try {
                return 1;
            }finally{
                return 2;
            }
        }

}
