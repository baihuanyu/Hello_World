package day24Annotation.AnnotationTest;
/**
 *
 *
 * @author shirokansakai*/
public class Color {
    @MyAnnotation("white")
    public void white() {
        System.out.println("现在的我是白色的");

    }
    @MyAnnotation("black")
    public void black() {
        System.out.println("现在的我是黑色的");
    }
}