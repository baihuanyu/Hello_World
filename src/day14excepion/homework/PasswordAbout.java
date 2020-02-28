package day14excepion.homework;
/**
 * 密码相关的类
 * 密码在6-18位，必须有数字字母下划线
 * */
public class PasswordAbout {
    public static void main(String[] args) {
        try{
            boolean psw = Psw("aaA");
            if (psw)
                System.out.println("密码合法");
        }catch (IllgerException e){
            String s = e.toString();
            //用于接收前台打印信息
            StringBuilder sb = new StringBuilder();
            //提取反馈信息
            char[] chars = s.toCharArray();
            for (int i = 0; i <chars.length ; i++) {
                if (String.valueOf(chars[i]).getBytes().length >=2 ) {
                    sb.append(chars[i]);
                }
            }
            String msg = sb.toString();
            System.out.println(msg);
        }
    }

    public static boolean Psw(String psw) throws IllgerException {
        //密码正则
        String regex = "[\\w]{6,18}";
        //判断密码是否合规
        if (psw.equals("")||psw == null || !psw.matches(regex))
            throw new IllgerException("非法字符");
        //密码满足要求 返回密码
        return true;
    }
}
