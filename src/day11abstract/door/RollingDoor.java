package day11abstract.door;

public class RollingDoor extends AbstractDoor {
    @Override
    public void openDoor() {
        System.out.println("往上拉。。。。。。。");
    }

    @Override
    public void closeDoor() {
        System.out.println("往下拉。。。。。");

    }
}
