package homeworkfornewyear;
/**
 * 设计一个方法，统计一个字符在字符数组中出现的次数
 * */
public class V58 {
    public static void main(String[] args) {
        String s = "nihaoawoshinidie";
        V58.charCount(s,'i');
    }



    public static void charCount(String s,Character c){
        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            if (c.equals(s.charAt(i))){
                count++;
            }
        }
        System.out.println(c+"出现了"+count+"次");
    }
}
