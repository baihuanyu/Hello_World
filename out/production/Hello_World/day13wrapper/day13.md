## 包装类(wrapper)：
    包装类即是将基本数据类型变成引用数据类型
     基本数据            包装数据        父类
     byte               Byte           Number
     short              Short          Number
     int                Integer        Number
     long               Long           Number
     float              Float          Number
     double             Double         Number
     char               Character      Object
     boolean            Boolean        Object
### Integer：
    (1)常用方法
        该类重写了Object类的equals()、hashCode()以及toString()方法
    
        Integer(int value) - 根据参数指定的整数值来构造对象
        Integer(String s)  - 根据参数指定的字符串来构造对象
    
    
        int intValue() - 用于获取调用对象中含有的int类型数据并返回。
                        用于实现将Integer类型拆包为int类型
    
        static Integer valueOf(int i)  - 根据参数指定的整数来得到对象。
                                        用于实现将int类型包装成Integer类型 
    
        static int parseInt(String s)  - 用于将字符串类型的数据转换为int类型的整数(掌握)
### 享元模式：包括（自动装箱），（自动拆箱）
    由int类型向Integer类型的转换过程，叫做装箱 
    由Intger类型向int类型的转换过程，叫做拆箱
    从jdk1.5开始，支持自动装箱和自动拆箱的机制        
    享元模式：
        享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。
        这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
    自动装箱池：
        借助享元模式
        为了提高性能在Integer类的内部提供了自动装箱池，也就是把-128 ~ 127之间的整数提前装箱完毕，若程序中需要
        该范围内的数据则直接从装箱池中获取无需创建新对象。