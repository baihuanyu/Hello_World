package day14excepion.homework;

import day14excepion.CustomException;

/**
 * 模拟一个用户注册
 *
 * */
public class UserRegister {
    public static void main(String[] args) {
        try {
            boolean register = register("猫");
            if (register)
                System.out.println("注册成功");
        } catch (CustomException e) {
            String s = e.toString();
            System.out.println(s);
        }

    }

    public static boolean register(String name) throws CustomException {
        //模拟一个数据库
        String[] data = {"猫","狗","猪"};
        for (String s:data) {
            if (s.equals(name)){//遍历数组 如果名字与数据库重复
             throw  new CustomException("用户已注册！");
            }
        }
        // 以上未发生
        return true;
    }
}
