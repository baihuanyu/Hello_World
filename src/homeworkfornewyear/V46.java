package homeworkfornewyear;
/*peter piper picked a peck of pickled peppers统计这段绕口令有多少个以p开头的单词*/
public class V46 {
    public static void main(String[] args) {
        String s = "peter piper picked a peck of pickled peppers";
        //分割字符串遍历
        int count = 0;
        String[] split = s.split(" ");
        for (int i = 0; i <split.length ; i++) {
            //判断是否是p开头
            if (split[i].startsWith("p")) {
                count++;
            }
        }
        System.out.println("以p开头的单词共有："+count+"个");
    }
}
