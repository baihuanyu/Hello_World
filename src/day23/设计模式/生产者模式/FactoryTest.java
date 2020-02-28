package day23.设计模式.生产者模式;
/**
 *
 *
 *
 * @author shirokansakai*/
public class FactoryTest {
    /** 手机生成方法*/
    public Phone getPhone(String str){
        if ("Iphone".equals(str)){
            return new Iphone();
        }else if ("HuaWei".equals(str)){
            return new HuaWeiPhone();
        }
        return null;
    }

}
