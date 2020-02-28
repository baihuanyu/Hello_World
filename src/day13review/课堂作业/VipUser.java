package day13review.课堂作业;

public class VipUser extends User {
    public VipUser() {
    }

    public VipUser(String name, String password, String phoneNumber, String ID, String addr) {
        super(name, password, phoneNumber, ID, addr);
    }

    @Override
    public void goodAt() {
        System.out.println("擅长打枪");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() !=obj.getClass()){
            return false;
        }
        User user = (User) obj ;
        if (this.getName().equals(user.getName()) && this.getID().equals(user.getID())){
            return true;
        }
        return false;
    }
}
