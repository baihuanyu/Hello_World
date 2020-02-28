package day10polymorphic.homework;

/**
 * 模仿QQ状态的一个枚举类
 *
 * */
public enum Qq {
    ONLINE("在线"),
    OFFLINE("离线"),
    BUSY("忙碌"),
    INVISIBLE("隐身"),
    CALLME("Q我吧");
    private String name;

    Qq() {
    }
    Qq(String name) {
        this.name = name;
    }
    public void show(){
        switch (name){
            case "在线":
                System.out.println("我在线。。。");
                break;
            default:
                System.out.println("不匹配");
                break;
        }
    }


















    /* public void setState(String state) {
        this.state = state;
    }
    public String toString(Qq qq) {
        switch (qq) {
            case OFFLINE:
                this.getState();
                break;
            case ONLINE:
                this.getState();
                break;
            case BUSY:
                this.getState();
                break;
            case INVISIBLE:
                this.getState();
                break;
            case CALLME:
                this.getState();
                break;
        }
        return state;


    }*/
}

