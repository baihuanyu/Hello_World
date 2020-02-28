package codePractice;
/**
 * 正则表达式驱去重
 * */
public class RegexQuChong {
    public static void main(String[] args) {
        String rgx = "(?s)(.)(?=.*\1) ";
        String str = "qqwwqqwwwwrrrewrewrerrtdgfgf";
        String s = str.replaceAll(rgx, "");
        System.out.println(s);
    }
}
