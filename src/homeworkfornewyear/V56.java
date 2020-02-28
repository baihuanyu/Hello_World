package homeworkfornewyear;
/**
 * 编写一个方法，判断一个字符是否有小写字母，如果是，将它转换成大写字母，否则，不转换。
 *
 * */
public class V56 {
    public static void main(String[] args) {
        String s = "LbLLLCCCaaaD";
        System.out.println(isLower(s));
        String s1 = s.toLowerCase();
        System.out.println(s);
    }


    public static String isLower(String s){
        /**用于添加字符串修改后的容器*/
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            //判断字符是否与小写后的字符相等
            if (String.valueOf(s.charAt(i)).equals(String.valueOf(s.charAt(i)).toLowerCase()) ){
                String s1 = String.valueOf(s.charAt(i)).toUpperCase();
                sb.append(s1);
            }else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
