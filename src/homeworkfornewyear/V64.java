package homeworkfornewyear;
/**
 *  编写一个方法来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。（所有输入只包含小写字母 a-z 。）
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * */
public class V64 {
    public static void findSame (String[] strs){
        StringBuilder sb = new StringBuilder();
        if (strs.length == 0) {
            System.out.println("最长前缀为"+"\"\" ");
             return;
        }else
            for (int i = 0; i <strs[0].length() ; i++) {//遍历第一个子字符串
                char c = strs[0].charAt(i);
                for (int j = 1; j <strs.length ; j++) {
                    if (i>j){//假如第二个字符串长度没有第一个长，便终止
                        break;
                    }
                    else if (c == strs[j].charAt(j-1)){
                        sb.append(c);
                        break;
                    }
                }
            }
            System.out.println("最长前缀为"+"\""+sb.toString()+"\"");
    }

    public static void main(String[] args) {
        String[] s ={"flower","flow","flight"};
        String[] s1 ={"dog","racecar","car"};
        String[] s2 = new String[0];
        V64.findSame(s2);
    }
}
