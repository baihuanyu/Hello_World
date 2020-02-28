package day24Annotation.AnnotationTest;

import java.lang.annotation.*;

/**
 * @author shirokansakai
 * 自定义注解
 *  target表示注解能标注的地方
 * Doucumented 表示显示注解
 * inherited 表示可以被继承
 * retention 表示阶段（编译，字节码，运行）
 */
@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
//@Inherited
public @interface MyAnnotation {
    /** 单值注解，使用value */
    String value();
}
