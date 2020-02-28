package day11abstract.door;
/**
 * 智能门类
 * */
public class AiDoor extends AbstractDoor implements IFace {

    @Override
    public boolean faceRecogition() {
        return true;
    }

    @Override
    public void openDoor() {
        if (faceRecogition()){
            System.out.println("门已开");
        }else{
            System.out.println("开不了");
        }

    }

    @Override
    public void closeDoor() {
        System.out.println("关门了");
    }

}
