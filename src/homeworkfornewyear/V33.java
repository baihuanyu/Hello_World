package homeworkfornewyear;
/*有如下的一个字符串  String str = “QWERTYUIQQQWJHDAADADBBBBCAD”;  必做
        ① 请统计出其中每一个字母出现的次数，在控制台打印如下的格式：
        A----3
        B----4
        C----1
        D----2
        ② 请打印出字母次数最多的那一对*/


public class V33 {
    public static void main(String[] args) {
        String str = "QWERTYUIQQQWJHDAADADBBBBCAD";
        String s = V33.quchong(str);
        char[] chars1 = s.toCharArray();
        int time = 0;
        int i = 0;
        char[] chars = str.toCharArray();
        for (i=0 ;i <chars1.length ; i++) {

            for (int j = 0; j <chars.length ; j++) {
                if (chars1[i]==chars[j]){
                    time++;
                }
            }
            System.out.println(chars1[i]+"出现了："+time+"次");
            time = 0;
        }
    }
    public static String quchong(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(str.charAt(i))==i){
                sb.append(str.charAt(i));
            }
        }
        String s = sb.toString();
        return s;
    }
}
