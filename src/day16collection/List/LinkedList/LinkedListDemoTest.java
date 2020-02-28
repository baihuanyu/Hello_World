package day16collection.List.LinkedList;

/**
 * 测试类
 * */

class LinkedListDemoTest {
    public static void main(String[] args) {
        //创建对象
        LinkedListDemo list = new LinkedListDemo();
        // 测试添加方法
        list.add(1);
        list.add("你好");
        list.add(null);
        list.add(true);
        list.add("good");
        System.out.println("-------------------------");
        //测试获取元素方法
        System.out.println(list.size());
        //测试toString方法：
        System.out.println(list.toString());
        // 测试get方法
        System.out.println(list.get(2));
        //测试indexOf
        System.out.println(list.indexOf("你好啊"));
    }
}