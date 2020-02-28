package day13review.抽象类练习;

public class HeroTest {
    public static void main(String[] args) {
        Hero maggic = new Maggic();
        maggic.setName("nihao");
        maggic.setGander("male");
        Hero solider = new Solider();
        Hero tank = new Tank();
        maggic.skill();
        solider.skill();
        tank.skill();
        if (maggic instanceof Maggic){
            ((Maggic) maggic).selfSkill();
        }


    }
}
