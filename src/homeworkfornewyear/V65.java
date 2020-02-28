package homeworkfornewyear;
/**
 * 字符串A="I love China",B="YOU  Love Me"（忽略大小写）
 * 写一个方法查找出两个字符串的交集，上述例子就是查找出love
 *
 * */
public class V65 {
    public static void main(String[] args) {
        String A = " i love China";
        String B = "You lOVe Me";
        /**创建一个字符串容量去装相同的子串*/
        StringBuilder ss = new StringBuilder();
        String[] sa = A.split(" ");
        String[] sb = B.split(" ");
        for (int i = 0; i <sa.length ; i++) {
            for (int j = 0; j <sb.length ; j++) {
                if(sa[i].toLowerCase().equals(sb[j].toLowerCase())){//判断字符串是否含有相同元素，全小写
                    ss.append(sa[i]);
                }
            }
        }
        System.out.println("两个字符串相同的子串是"+ss.toString());
    }

}
