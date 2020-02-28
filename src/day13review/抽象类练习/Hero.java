package day13review.抽象类练习;
/**
 * 请设计一个英雄类，该类有属性：姓名、性别
 * 				        行为：技能
 *
 * 		英雄子类：
 * 			1. 狂战士：技能：打野战
 * 			2. 魔法师：技能：远程攻击
 * 			3. 坦克：技能：近身战斗
 *
 * 		请在测试中，创建所有的子类对象，调用方法测试即可
 *
 * */

public abstract class Hero {
    private String name;
    private String Gander;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGander() {
        return Gander;
    }

    public void setGander(String gander) {
        Gander = gander;
    }
    abstract void skill();
}
