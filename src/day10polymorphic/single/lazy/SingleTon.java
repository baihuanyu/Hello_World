package day10polymorphic.single.lazy;
/**
 * 懒汉
 *
 * */

public class SingleTon {

    private SingleTon() {
    }
    //懒汉单例 不能使用final 先引入 在使用的时候创建
    private static SingleTon singleTon;

    public static SingleTon getsingleTon(){
       //创建实例： 需进行判断 是否为空
       if (singleTon == null){
           singleTon = new SingleTon();
       }
       return singleTon;
    }
}
