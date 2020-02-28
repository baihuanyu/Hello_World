package day13review;
/**
 * 1.设计一个方法,查询并返回一个字符在字符数组中第一次出现的位置
 * */
public class Test01 {
    public static int findPlace(String[] s,String str){
        if (s == null) {
            return -1;
        }
        for (int i = 0; i <s.length ; i++) {
            if (s[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }
}
