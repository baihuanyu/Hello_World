## lambda:
1.Lambda表达式概述

	lambda表达式允许你通过表达式来代替功能接口。 lambda表达式就和方法一样,它提供了一个正常的参数列表和一个使用
	这些参数的主体(body,可以是一个表达式或一个代码块)。

	Lambda表达式还增强了集合库。 Java SE 8添加了2个对集合数据进行批量操作的包: java.util.function 包以及
	java.util.stream 包。 流(stream)就如同迭代器(iterator),但附加了许多额外的功能。 总的来说,lambda表达
	式和 stream 是自Java语言添加泛型(Generics)和注解(annotation)以来最大的变化。 

2.Lambda表达式语法格式：

	基本语法：
		(parameters) -> expression
		或
		(parameters) -> {statements;}

	三部分构成
	        参数列表
	        符号 ->
	        函数体 : 有多个语句,可以用{} 包括, 如果需要返回值且只有一个语句,可以省略 return

	        
	        
3.Lambda表达式缩写规则：
    
    分类：
        无参数，无返回值
        无参数，有返回值
        有参数，无返回值
        有参数，有返回值
    规则：
        1、=右边的类型会根据左边的函数式接口类型自动推断； 
        2、如果形参列表为空，只需保留()； 
        3、如果形参只有1个，()可以省略，只需要参数的名称即可； 
        4、如果执行语句只有1句，且无返回值，{}可以省略，若有返回值，则若想省去{}，则必须同时省略return，且执行语句也保证只有1句； 
        5、形参列表的数据类型会自动推断； 
        6、lambda不会生成一个单独的内部类文件； 
        7、lambda表达式若访问了局部变量，则局部变量必须是final的，若是局部变量没有加final关键字，系统会自动添加，此后在修改该局部变量，会报错；   
        
	
4.Lambdas和Streams

	Stream是对集合的包装，通常和lambda一起使用。使用lambdas可以支持许多操作，如map,filter,limit,count,min,max,sum,collect等等
		
    重点：
	    forEach（需要consumer类型的）、forEachRemaining