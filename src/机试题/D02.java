package 机试题;
/**
 * 2.	定义一个方法：判断3个int值的大小，返回最小的那个数；
 * */
public class D02 {
    public static void main(String[] args) {
        System.out.println(getSmaller(1,2,3));
    }

    public static int getSmaller(int i1,int i2,int i3){

       return i1<i2 ? (i1<i3 ? i1 : i3):(i2<i3 ? i2 : i3);
    }
}
