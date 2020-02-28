package day13review.课堂作业;

public class UserTset {
    public static void main(String[] args) {
        VipUser vip1 = new VipUser("张三","333222","138","101","yaan");
        VipUser vip2 = new VipUser("张三","333222","138","101","yaan");
        VipUser vip3 = new VipUser("李四","333222","138","101","yaan");
        User vip4 = new VipUser();
        NormalUser normalUser = new NormalUser();
        if (vip4 instanceof User){
            System.out.println("instanceof 测试");
            vip4.hobby();
        }
        normalUser.goodAt();
        vip1.goodAt();
        boolean e1 = vip1.equals(vip2);
        boolean e2 = vip1.equals(vip3);
        boolean e3 = vip2.equals(vip3);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);


    }
}
