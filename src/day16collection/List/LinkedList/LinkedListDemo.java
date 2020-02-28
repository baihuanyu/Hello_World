package day16collection.List.LinkedList;
/**
 * 链表 ，用类来储存数据
 *  即使通过保存地址 来寻找值
 *   做到第一个保存第二个的地址，第二个保存第三个的地址 行成一条单链 通过地址值来获取数据
 * */
public class LinkedListDemo {
    /**保存第一个对象的地址值*/
    private Node first ;
    /**记录容器里面的元素的个数*/
    private int size;

    public LinkedListDemo() {
    }
    /**添加一个构造方法用来记录数据 将数据放进来*/
    public LinkedListDemo(Object obj) {
        add(obj);
    }
    /**1.添加一个add方法用于添加数据*/
    public void add(Object obj){
        //将数据录入，
        Node node = new Node(obj);
        //如果添加的对象刚好是第一个
        //那么就把地址给first
        if (first == null) {
            first = node;
        }else{
            // 声明一个临时对象 把first的值给他
            Node temp = first;
            //遍历这个容器 temp.next 表示next这个成员变量，如果下一个是空的 那么next 就是null
            while(temp.next != null){
                // 如果不是空的 ，就把地址值赋给上一个 这样就产生了链接
                temp = temp.next;
            }
            //当循环完了之后，最后一个一定没有值，所以此时把新添加的值赋给最后一个
            temp.next = node;
        }
        //增加一个值，那么元素个数也要加一
        size++;
    }
    /**2.获取元素的个数方法*/
    public int size(){
        return size;
    }
    /**
     *3重写toString
     * */
    @Override
    public String toString() {
        //准备一个字符串来拼接数据
        StringBuilder sb = new StringBuilder("[");
        //假如容器是空的 就返回"【】"
        if (size == 0) {
            return sb.append("]").toString();
        }//如果不是空的 ，就返回值，效果和数组的toString相同
        //创建一个临时对象用来储存值
        Node temp = first;

        for (int i = 0; i <size-1 ; i++) {
            //考虑到最后一个元素也会添加， 所以少遍历一次
            sb.append(temp.value).append(",").toString();
            //将下一个的地址值给到当前对象
            temp = temp.next;
        }
        // 补上最后一个值
        return sb.append(temp.value).append("]").toString();

    }
    /**
     * 4根据下标查询节点的值
     * */
    public Object get(int index){
        //判断下标是否合法
        checkIndex(index);
        Node temp =first ;
        for (int i = 0; i <index ; i++) {
            temp =temp.next;
        }
        return temp.value;
    }
    /**5.查询指定的元素第一次出现的位置*/
    public int indexOf(Object obj){
        Node temp = first;
        for (int i = 0; i <size ; i++) {
            if (obj.equals(temp.value)) {
                return i ;
            }
            temp = temp.next;
        }

        //找不到该元素
        return -1;
    }
    /**一个检验下标是否合法的方法*/
    private void checkIndex(int index) {
        if (index > size-1 ||index<0) {
            throw new  IllegalArgumentException("下标不合法，"+"["+0+"，"+size+")");
        }
    }

    /**一个内部类
     * 用来存数据
     * 相当于一个容器
     * */
    private class Node{
        /**储存数据的变量*/
        Object value ;
        /**用来记录下一个值的节点*/
        Node next;
        /**有参构造*/
        public Node(Object value) {
            super();
            this.value = value;
        }
    }
}
