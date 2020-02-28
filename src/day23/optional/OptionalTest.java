package day23.optional;

import java.util.Optional;

/**
 * 用于解决空指针异常的类
 * */
public class OptionalTest {
    public static void main(String[] args) {
        User user = new User("钱多多， 猫咪");
        System.out.println(isUser(user));
    }


    /**
     * 用于判断用户是否为空的方法
     *
     * */
    public static String isUser(User user){
        /**
         * 元素写法
         * if (user==null || user.equals("")){
            return null;
        }
        return user.toString();*/
        /**
         * 使用optional
         * 先把user 加到Optional容器里面
         * 		 * 	map 返回对象的数据
         * 		 * 	Function
         * 		 * 		 R apply(T t);实现   u->u.getName()
         *       *Optional<User> ofNullable = Optional.ofNullable(user);
         * 		Optional<String> map = ofNullable.map(u->u.getName());
         * 		String orElse = map.orElse("");
         * */
        return Optional.ofNullable(user).map(user1 -> user1.getName()).orElse("unknown");
    }
}
/**
 * 创建一个用户类
 * */
class User{
    private String name ;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}