package day13review.抽象类练习;

public class Maggic extends Hero {
    @Override
    void skill() {
        System.out.println(getName()+getGander());
        System.out.println("远程攻击");
    }
    void selfSkill(){
        System.out.println("速度-10");
    }
}
