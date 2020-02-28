package homeworkfornewyear;
/*
* 把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy*/
public class V47 {
    public static void main(String[] args) {
        String s = "lengendary";
        //创建一个字符串容器去接收字符串的改变
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if (i%2==0){//遍历字符串 安装条件将单个字符大写
                String s1 = String.valueOf(s.charAt(i)).toUpperCase();
                sb.append(s1);
            }else
                sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
