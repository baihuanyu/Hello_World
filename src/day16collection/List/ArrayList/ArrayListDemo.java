package day16collection.List.ArrayList;

import java.util.Arrays;

/**
 * 模拟一个ArrayList底层
 * */
public class ArrayListDemo {
    /**创建一个Array数组,初始值为10*/
    private Object[] value = new Object[10];
    /**一个表示数组元素 的数*/
    private int size;
    /**1。数组添加元素add方法*/
    public void add(Object obj){
        // 对数组进行扩容
        if (size == value.length) {
            value = Arrays.copyOf(value, value.length * 2);
        }
        //将元素添加到最后一个位置
        value[size] = obj;
        //添加后元素个数增加
        size++;

    }
    /**2。 获取元素个数的方法*/
    public int size(){
        return size;
    }
    /**3。重写toString方法*/
    @Override
    public String toString() {
        //将原数组缩容
        Object[] newArr = Arrays.copyOf(value, size);
        //调用数组的toString方法
        String s = Arrays.toString(newArr);
        return s;
    }
    /**5。查询指定下标的元素*/
    public Object get(int index){
        checkIndex(index);
        return value[index];
    }

    /**6.查询指定的元素第一次出现的位置*/
    public int indexOf(Object obj){
        //因为此数组可以装null 所以判断时候有这个
        //判断传入的值是否为null 避免空指针异常
        if (obj==null) {
            for (int i = 0; i <size ; i++) {
                if (obj == null) {
                    return i ;
                }
            }
        }else {
            for (int i = 0; i <size ; i++) {
                if (obj.equals(value[i])){
                    return i ;
                }
            }
        }
        //如果没有找到 返回-1
        return -1;
    }
    /**7.修改指定下标处的元素 */
    public void set(int index,Object obj){
        //判断下标是否越界
        checkIndex(index);
        value[index] = obj ;
    }
    /**8.删除指定下标处的元素，返回删除的元素*/
    public Object remove(int index) {
        //判断下标是否越界
        checkIndex(index);
        //假如index = 0 即是删除第一个
        if (index==0){
            value=Arrays.copyOfRange(value,1,size);
            size--;
            return value[0];
        }//假如删除的是最后一个
        else if (index == size-1) {
            value=Arrays.copyOfRange(value,0,size-1);
            size--;
            return value[size-1];
        }//也可以全用如下方法 当index为最后一个的时候 此时java底层调用其他方式来实现
        else{
            System.arraycopy(value,index+1,value,index,size-1-index);
            size--;
            return value[index];
        }
    }
    public int remove(Object obj){
        for (int i = 0; i <size ; i++) {
            if (obj.equals(value[i])){
                remove(i);
                return i ;
            }
        }
        // 未找到返回-1
        return -1;
    }

    /** 检测下标是否越界的方法 可用Alt+Command+M提取*/
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("数组下标越界了" + "下标为 [" + 0 + "," + size + ")");
        }
    }
}
