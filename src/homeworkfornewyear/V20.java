package homeworkfornewyear;

/*编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
        “To be or not to be"，将变成"oT eb ro ton ot eb."。*/

public class V20 {
    public static void main(String[] args) {
        String str = "To be or not to be";
        String[] s = str.split(" ");//将字符串分割
        for (int i =0 ;i<s.length;i++){//for循环遍历每个单词
            StringBuilder sb= new StringBuilder(s[i]);//转换成StringBuilder
            StringBuilder reverse = sb.reverse();//反转
            System.out.print(reverse.toString()+" ");//转换成字符串打印
        }
    }
}
