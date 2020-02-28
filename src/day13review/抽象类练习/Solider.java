package day13review.抽象类练习;

public class Solider extends Hero {
    @Override
    void skill() {
        System.out.println("打野");
    }
    void selfSkill(){
        System.out.println("加血100");
    }
}
