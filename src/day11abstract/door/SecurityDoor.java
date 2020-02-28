package day11abstract.door;

public class SecurityDoor extends AbstractDoor {
    @Override
    public void openDoor() {
        System.out.println("猫眼确认 开。。。");

    }

    @Override
    public void closeDoor() {
        System.out.println("猫眼关门。。。。。。");
    }
}
