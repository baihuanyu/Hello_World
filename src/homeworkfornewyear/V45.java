package homeworkfornewyear;
/*给出一句英文句子： "let there be light"得到一个新的字符串，每个单词的首字母都转换为大写*/
public class V45 {
    public static void main(String[] args) {
        String s = "let there be light";
        String s2 = null;
        String res = " ";//用于接收新的字符串（ 也可以StringBuilder去append）
        String[] s1 = s.split(" ");
        for (int i = 0; i <s1.length ; i++) {
            //遍历截取首字母大写
            s2 = s1[i].substring(0, 1).toUpperCase() + s1[i].substring(1) + " ";
            res+=s2;
        }
        System.out.println(res.trim());//去除首位空格
    }
}
