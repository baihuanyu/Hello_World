package day17map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        /*
		 * 构造方法：
		 * 		1. HashMap()构造一个空的 HashMap ，默认初始容量（16）和默认负载系数（0.75）。
		 * 			容量16：是键值对的数组长度16
		 * 			负载系数0.75：扩容机制是当容量达到75%的时候，开始扩容，就是创建新数组，复制元素
		 * 			一般就使用默认的负载系数，因为经过测试这是最优化的
		 *
				2. HashMap(int initialCapacity) 构造一个空的 HashMap具有指定的初始容量和默认负载因子（0.75）。
					避免哈希碰撞
				3. HashMap(int initialCapacity, float loadFactor) 构造一个空的 HashMap具有指定的初始容量和负载因子。
				4. HashMap(Map m) 构造一个新的 HashMap与指定的相同的映射 Map 。
		 */
        HashMap hashMap = new HashMap();
        HashMap hashMap1 = new HashMap();
        //1.V put(K key, V value)如果当前key，没有，则是添加操作，
        // 如果key是存在的则进行equals判断，如果equals相等，则是覆盖操作，
        // 如果equals不相等，value追加到末尾则会形成链表或者红黑树
        hashMap.put("账号","密码");
        hashMap.put("账号1","密码1");
        hashMap.put("账号2","密码2");
        System.out.println(hashMap);
        System.out.println("=====储存自定义数据类型=====");
        User u1 = new User("张三", "成都");
        User u2 = new User("张三", "成都");
        hashMap1.put(u1.getName(),u1.getAddr());
        hashMap1.put(u2.getName(),u2.getAddr());
        System.out.println(hashMap1);
        //2.void putAll(Map m) 将传入的Map作为参数，创建一个新的HashMap对象
        hashMap.putAll(hashMap1);
        System.out.println("合并后的map："+hashMap);

        //3.V get(Object key)根据key去获取value值,如果key不存在，则返回null
        Object value = hashMap.get("账号");
        System.out.println("账号的值是："+value);

        //遍历map
        Set set = hashMap.entrySet();
        for (Object o:set) {
            //获取键值dui
            System.out.println(o);
        }
        //遍历key 可以通过get获取对应的值
        Set set1 = hashMap.keySet();
        for (Object o: set1) {
            System.out.println(o+"的值是:"+hashMap.get(o));
            System.out.println();
        }
        //遍历map的值
        Collection values = hashMap.values();
        for (Object o: values) {
            System.out.println(o);
        }
        //4.V remove(Object key)根据key删除当前map对象中的这一对键值对

        //5.boolean remove(Object key, Object value)只有key和value都存在的时候，才能删除


        //6.V replace(K key, V value)根据key替换为新的value的值
        //7.boolean replace(K key, V oldValue, V newValue)  只有当key和value都存在的情况下，才能替换为新的  newValue值

        //8.boolean containsKey(Object key)判断当前map集合对象中是否包含这个key

        //9.boolean containsValue(Object value)判断当前map集合对象中是否包含这个value，包含则返回 true 。

        //10.void clear()清除所有的键值对对象

        //11.boolean isEmpty()判段当前map对象是否是空集合 。

        //12.int size()返回此地图中键值映射的数量。

    }
}
class User{
    public String name;
    public String addr;

    public User(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(addr, user.addr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addr);
    }
}