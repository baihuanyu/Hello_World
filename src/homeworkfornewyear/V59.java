package homeworkfornewyear;

import java.util.Arrays;

/**
 * 现有如下的数组
 *   int[] oldArr = {1,3,4,5,6,6,0,5,6,7,0,5};
 *   取出以上数组不为0的值，然后将不为0的值存入一个新的数组，生成新的数组为：
 *   int[] newArr = {1,3,4,5,6,6,5,6,7,5};
 * */
public class V59 {
    public static void main(String[] args) {
        int[] oldArr = {1,3,4,5,6,6,0,5,6,7,0,5};
        System.out.println(Arrays.toString(V59.getNewArray(oldArr)));
        int count = 0;//用于统计新数组的长度
        StringBuilder sb = new StringBuilder();//用于添加不是0的数字；
        for (int i = 0; i <oldArr.length ; i++) {
            if (oldArr[i] != 0) {
                sb.append(oldArr[i]);
                count++;
            }
        }
        System.out.println(sb);
        String s = sb.toString();
        int [] newArr = new int[count];
        for (int i = 0; i <s.length() ; i++) {
            //将字符串转换成数字添加，
            newArr[i]=  Integer.parseInt(s.charAt(i)+"");
        }
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] getNewArray(int[] arr){
        //判断合理性
        if (arr == null) {
            return null;
        }
        //声明一个数来计非0的个数
        int count = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        //新的数组的下标
        int newIndex = 0;
        //创建新数组来接收
        int[] newArr = new int[count];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != 0) {
                newArr[newIndex++]=arr[i];
            }
        }
        return newArr;
    }
}
