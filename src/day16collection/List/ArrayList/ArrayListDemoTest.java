package day16collection.List.ArrayList;

/**测试类*/

class ArrayListDemoTest {
    public static void main(String[] args) {
        ArrayListDemo list = new ArrayListDemo();
        list.add(1);
        list.add(3);
        list.add("你好");
        list.add("hello");
        list.add("你好");
        list.add("飞机");
        list.add("还可以是对象实例");
        System.out.println(list);
        list.remove("你好");
        System.out.println(list);




    }

}