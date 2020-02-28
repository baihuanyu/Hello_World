package day06array;

public class HomeworkSearch {
    public static void main(String[] args) {

        //1.	设计一个方法,查询并返回一个字符在字符数组中第一次出现的位置
        String[] str = {"nihao", "zhege", "good"};
        //char[] cha = str.toCharArray();
        search("god",str);
    }
    public static void search (String x, String[]str){
        //char [] cha = str.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (x == str[i]) {
                System.out.println(x + "出现的位置在索引" + i);
                return;
            }

        }
        System.out.println("无法匹配！");
    }

}