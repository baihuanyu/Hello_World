#1 关于注释（java）
    注释给人看 并非人机交互
    //     ：表示单行注释
    /* */  ：表示多行注释
    /** */ ：表示文本注释（效果如同jdkapi手册）
    使用javadoc可以生成文档
#2 字节码解析
    - 一个java文件可以出现多个类 但只能有一个public修饰的类
    - 多个类解析时 会生成对应的字节码文件
    - 类的内部也可以写类
    
    
#3 标识符
    - 即对所需要的变量进行命名
        - 需遵守命名规则
            - 不能以数字开头，尽量不使用中文命名
        - 驼峰命名
            -类名大驼峰
            -其他小驼峰
        - 不能是JAVA关键字
          比如：public static class ….
#4 常量
    - 固定不变的量
 
#5 变量
    - 定义语法：
        数据类型 变量名 = 值；（将右边赋值到左边）
         - String name = "爸爸"；
         - int  age = 18；
    - 变量值交换：
     a = 1 b=2
     temp = a
     a = b
     b = temp 这样 a=2 b=1
#6 局部变量和成员变量
    - 局部变量的作用域在局部 局部变量需要初始化
    - 成员变量在整个类 有默认值 null
    - 局部变量在main方法里运行快 成员变量慢
    - 需添加static修饰成员变量才能和main运行
#7 数据类型
    - 整数方面： 
        - int(4字节 32bit）  short(2字节 16bit） byte(1字节 8bit） long(8字节 64bit）
    - 浮点数方面：
        - float(4字节 32bit）（单精度 雨运行快）
        - double(8字节 64bit） （双精度）
        - 小数精确 bigdecimal
    - 布尔类型：
        - boolean(1bit)
        - true or false 
    - 字符串：
        - String
    - 字符：
        - 表示单个字符     
    - 字节占位及取值范围图
    https://iknow-pic.cdn.bcebos.com/9c16fdfaaf51f3de67943dd099eef01f3a297964  
        