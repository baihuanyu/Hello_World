package homeworkfornewyear;
/**
53.		雄联盟中有这么一些分类
        TANK (坦克)
        WIZARD (法师 )
        ASSASSIN (刺客)
        ASSIST (辅助)
        WARRIOR (近战)
        RANGED (远程 )
        PUSH (推进)
        FARMING (打野)
        设计一个枚举类型HeroType,使用上述分类作为常量

        再编写一段switch语句，把每种枚举常量输出为中文字符串
*/


public enum V53 {
    TANK ("坦克"),
    WIZARD ("法师" ),
    ASSASSIN ("刺客"),
    ASSIST ("辅助"),
    WARRIOR ("近战"),
    RANGED ("远程" ),
    PUSH ("推进"),
    FARMING ("打野");
    private  String name;
    V53() {
    }
    V53(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        switch (name){
            case "坦克":
                System.out.println("我是坦克，想去哪就去哪");
                break;
            case "法师":
                System.out.println("让你尝尝痛苦的滋味");
                break;
            case "刺客":
                System.out.println("来去如风，常伴吾身");
                break;
            case "辅助":
                System.out.println("你看到我的小熊了吗");
                break;
            case "近战":
                System.out.println("短剑重铸之日，骑士归来之时");
                break;
            case "远程":
                System.out.println("想射哪里，就射哪里");
                break;
            case "推进":
                System.out.println("碾碎他们");
                break;
            case "打野":
                System.out.println("我用双手成就你的梦想");
                break;
            default:
                break;
        }
        return name;
    }
}
