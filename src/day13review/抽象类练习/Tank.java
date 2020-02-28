package day13review.抽象类练习;

public class Tank extends Hero {
    @Override
    void skill() {
        System.out.println("近身战斗");
    }
    void selfSkill(){
        System.out.println("防御+100");
    }
}
