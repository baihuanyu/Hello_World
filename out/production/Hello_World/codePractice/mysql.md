一、初识MySQL数据库

1.数据库的概述

    <1>数据库：Database
        长期存储在计算机内的，有组织的，可共享的数据集合。
        存储数据的仓库。（文件）

<2>数据库管理系统：
        
        Database Management System
        操纵和管理数据库的软件。（软件）

<3>数据库的类型

    关系型数据库：二维表的形式存储数据。
    非关系型数据库：NoSQL---------Not only SQL
        Redis：键值对存储，K-V形式存储
        MongoDB：文档存储，将数据以文档的形式存储，Json/XML
        HBase：列存储，Hadoop Database



<4>主流的关系型数据库

    Oracle：甲骨文公司
    SQLServer：微软
        简单、界面友好，交互和操作型更强
        开放性差，性能低

    DB2:IBM
        伸缩性比较强，使用所有的主流的平台
        收费

    MySQL：MySQL AB
2.MySQL数据库概述

    <1>MySQL数据库
        MySQL是一个关系型数据库管理系统，有瑞典MySQL AB公司开发的，目前属于Oracle旗下产品。
    
    <2>版本
        社区版：免费(个人、组织、企业)
        企业版:非盈利的版权，会收取一定的服务费。


<3>特点

    1.开源、自由的关系型数据库管理系统
    2.短小精悍，速度快，拥有成本低
    3.是LAMP流行的网站架构的一部分(Linux+Apache+MySQL+php)
    4.被广泛的运用在互联网公司中(中小型网站中)
二、安装MySQL数据库

    <1>安装方式
        ZIP安装，压缩包的方式安装。
        MSI安装：windows installer 微软格式的安装包安装
        <2>注意事项：以前安装过，需要卸载干净再安装
        1.关闭MySQL服务
        2.卸载MySQL软件 （控制面板-----程序----卸载程序----右键卸载MySQLxxx文件）
        3.删除残留文件1：原安装位置
        4.删除残留文件2：C:\ProgramData 下  MYSQL文件夹
        5.删除残留文件配置参数：
                打开注册表(cmd---regedit)---xxxxmachine-----system----001/002/service----eventlog-----application----删除MySQL
    <3>安装
    
        MSI安装方式（操作和配置更加的简单）
        注意：字符集的选择，推荐utf8
三、使用MySQL软件

    <1>启动服务
    net start mysql  启动服务
    net stop  mysql  关闭服务
    <2>登录数据库
    格式： mysql  -参数
    参数： -u 用户名
            -p 密码
            -P 端口号
            -h 数据库的服务器地址(远程连接数据库)
            -- prompt 设置提示符         

    例如：
        mysql -uroot -proot
        mysql -uroot -proot -P3306 -h127.0.0.1
        mysql -uroot -proot -P3306 -h123.231.11.35(阿里云上的服务器：上海|北京)
        mysql -uroot -p回车
            密码 (密码不可见)

    使用MySQL Command Line Clinet 输入密码
<3>退出数据库
    ctrl+c
    exit
    \q
quit
<4>修改密码

4.1 第一种修改密码方式，当你忘记密码的时候使用这种方式修饰

    (1)停止MySQL服务器
    (2)在DOS下输入 mysqld --skip-grant-tables
    (3)在新开一个DOS登录mysql数据库(不需要密码)
    (4)更改密码：
            use mysql       选择名称是mysql的数据库
            update user set password=password('密码') where user='root';
    (5)关闭DOS窗口，结束mysqld进程
    (6)重启MySQL服务，使用新的密码登录


4.2 第二种当你没有忘记密码的时候，想要去修改密码，建议使用这种方式，因为简单。

    4.2.1 mysqladmin -u 用户名 -p password 新密码 (回车输入旧密码)
        或者使用下面这种方式
    4.2.2 mysqladmin -u 用户名 -p 密码 password 新密码。
<5>修改MySQL的提示符
方式一： prompt hehe

方式二: mysql -uroot -p123456 --prompt 提示符

    例如：mysql -uroot -p123456 --prompt nihao
<6>识别版本号

    select version();
四、MySQL数据库数据类型

    MySQL数据库中支持多种数据类型：数值型、字符型、日期型


    常用的数据类型：
        1.整型
            int：整形，存储整数
            int(M):M表示预期值。与存储大小和数值的范围无关。

            id  int                     10000
            id  int(3)  zerofill        10000

            zerofill 零填充        会在左侧补0


        2.浮点型
            float[(M,D)]:浮点型，存储小数
                salary float(6,2):表示最多6位，小数占2位，最大存储数值为：9999.99

            double：浮点型，小数

        3.字符型
            char(M):固定长度的字符串类型        name char(5)      '1    '
            varchar(M):可变长度的字符串类型(推荐)     name varchar(5)   '1'
            text:大的字符串类型，4G字符串
            blob：字节类型


        4.日期
            date:日期类型，年月日       YYYY-MM-DD 日期格式
            time:时间类型，时分秒       HH:mm:ss    时间格式
            year：年份，年           YYYY格式的年份值
            timestamp：年月日 时分秒  ，时间戳 2037年的某一个时刻  YYYYMMDDhhmmss
            datetime：年月日 时分秒    YY-MM-DD hh:mm:ss



        5:整型

            tinyint         1       -128~127
            smallint        2       32767/65535
            int             4       21亿
            bigint          8       兆
            mediumint       3       八百多万/一千六百多万



    注意：选择合适的数据类型，是数据库优化的一部分。 short it better 原则。
五、MySQL数据库中的数据的使用
如何操作：编程语言
<1>SQL概述
    结构化查询语言，可以用于查询和修改关系数据库的语言。

    SQL语言，是数据库的核心语言，被ISO采纳为数据库语言的国际标准，几乎所有的数据库都支持SQL

<2>组成
        数据定义语言(Data Definition Language,DDL):用于管理和一定数据对象，包括数据库，数据表等。
            create：创建数据库和表
            drop：删除表对象
            alter：修改表结果

        数据操作语言(Data Manipulation Language,DML):用于操作数据库对象中所包含的数据
            insert：添加数据
            delete：删除数据
            update：修改数据 


        数据查询语言(Data Query Language,DQL):用于查询数据库对象中所包含的数据
            select：查询数据

        事务控制语言(Transaction Control Language，TCL):包括提交事务、事务回滚
            commit：提交事务
            rollback：事务回滚
            savepoint：事务节点

        数据控制语言(Data Control Language,DCL):用来管理数据库中，包括管理权限以及数据更改
            grant：授权
            revoke：收回权限
1.数据定义语言(DDL)
数据库的操作
<1>创建数据库
    语法格式： create database [if not exists] 数据库名称 [character set [=] 编码名称];

        例如：
             create database tlxy;
             create database if not exists tlxy;//忽视错误，显示警告
             show warnings;//查看警告
             create database db character set gbk;//指定创建的数据库的字符集


<2>查询数据库
        语法格式：show databases;//查看所有的数据库

                show create database 数据库名称;//查询某一个已经创建的数据库

<3>修改数据库
        语法格式：
            alter database [if not exists] 数据库名称 [character set 新的编码名称]

        例如：
            alter database db character set = utf8;

<4>删除数据库
        语法格式：
            drop database 数据库名称;

        例如：
            drop database db;//删除数据库db
数据表的操作
<1>创建数据表
    使用一个数据库:use 数据库名称;
    查看当前正在使用的数据库：select database();


    创建数据表语法：
        create table 表名(
            字段名 字段类型    约束,
            字段名 字段类型    约束,
            ........

        );


    例如： 创建用户表 

        create table user(
            uid int,
            username varchar(32),
            password varchar(32),
            birthday date,
            sex     enum('男','女')
        );          


<2>查询数据表
        show tables;显示当前数据库中所有的数据表
        show columns from 表名;//查询某张表表结构
        desc 表名; //查询某张表表结构


<3>修改数据表
    3.1 修改表名
        方式一：alter table 表名 rename [as|to] 新表名;
            例如：alter table user rename us;
        方式二：rename table 旧表名 to 新表名 [,旧表名 to 新表名,..........]
            例如：rename table us to user;

    3.2 添加列
        语法格式：
            alter table 表名 add [column] 列名 列定义 [first|after 列名];
        例如：
             alter table user add sal double after password;//在指定的列后面添加新的列
             alter table user add phone varchar(32); //默认在列的最后添加新的列
             alter table user add hobby varchar(32) first;//在列的最前面添加新的列

    3.3 修改列定义
            语法格式：
                alter table 表名 modify 列名 列定义 [first|after 列名];

            例如：
                 alter table user modify sex varchar(32) first;

    3.4 修改列名
            语法格式：
                alter table 表名 change 列的列名 新的列名  新的列定义   [first|after 列名];
            例如：
                alter table user change hobby address varchar(20) after sal;

    3.5 删除列
            语法格式：   
                alter table 表名 drop [column] 列名;
            例如：
                alter table user drop phone;

<4>删除数据表
        语法格式：
            drop table 表名;

        例如：
            drop table user;
2.数据操作语言(DML)：用于操作数据库对象中所包含的数据
基本查询数据的语句： select * from 表名;


<1>插入操作
    语法格式：insert [into] 表名 [(列名1,列名2,.....)]    values|value (数值1|表达式,数值2|表达式,....);

    例如：
        insert into teacher (id,note) values ('1','先挣它一个亿.');
        insert into teacher value (2,'wangjianlin','xian zheng ta yi ge yi');

<2>删除操作
    语法格式：
        delete from 表名 where 条件;

    例如：
        delete from teacher where id=1;//指定条件删除记录
        delete from teacher;//不带条件删除，删除所有的记录


    扩充：
        truncate table 表名; ---------- 清空表，会清空表中所有的数据


    面试题：
        delete删除与truncate 有什么区别？?

            删除方式：
                delete ：一条一条的删除，不清清空 auto_increment 记录数
                truncate 直接将表中的数据进行清空，  auto_increment自增将被重置，从新开始


<3>修改操作
        语法格式：
            update 表名 set 列名1=数值,列名2=数值,..... where 条件；


        例如：
            update teacher set name='xiaosan',note='ming nian zai zhao yi ge' where id=1;//带条件修该，修改指定记录

            update teacher set name='xiaosi';//不带条件  修改表中所有数据