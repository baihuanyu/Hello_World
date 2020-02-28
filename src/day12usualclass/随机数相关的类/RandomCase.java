package day12usualclass.随机数相关的类;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * 随机生成验证码案例
 *
 * */
public class RandomCase {
    public static void main(String[] args) {
        System.out.println(getCode(5));

    }
    public static String getCode (int n ){
        String str = "23456789qwertyuopasdfghjkzxcvbnmQWERTYUPASDFGHJKLZXCVBNM";
        //用于拼接生成的代码，如果量多用StringBuilder
        String code = "";
        //将字符串转换为数组
        char[] chars = str.toCharArray();
        //遍历 需要取几个就遍历几次
        for (int i = 0; i <n ; i++) {
            //每次遍历生成一个随机数，随机数在需要取的源码中的长度
            int random = RandomCase.getRandom(0, chars.length);
            // 进行拼接
            code +=chars[random];

        }
        return  code;
    }
    protected static int getRandom(int start, int end){
        //获取实例对象
        ThreadLocalRandom current = ThreadLocalRandom.current();
        //调用生成方法并返回
        return current.nextInt(start,end);

    }
}
