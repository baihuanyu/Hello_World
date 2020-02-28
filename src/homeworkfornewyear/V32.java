package homeworkfornewyear;

public class V32 {
    public static void main(String[] args) {
        String s = "你好呀";
        System.out.println(V32.QuChong(s));
    }


    public static String quChong(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {//遍历数组
            if (str.indexOf(str.charAt(i))==i) {//判断字符第一次出现
                sb.append(str.charAt(i));
            }
        }
        String s = sb.toString();
        return s;
    }
    public static String QuChong(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i))==i){
                //第一次出现
                sb.append(str.charAt(i));
            }

        }
        String result=sb.toString();
        return result;
    }


}
