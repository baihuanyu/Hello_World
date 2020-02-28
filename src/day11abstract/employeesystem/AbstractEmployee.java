package day11abstract.employeesystem;
/**
 * 员工类
 *
 * */
public abstract class AbstractEmployee {
    /**
     * 上班打卡
     */
   public void clockIn() {
       System.out.println("上班打卡。。。。");
    }
    public void clockOut(){
        System.out.println("下班打卡。。。");
    }
    /** 工作方式不同 需要重写方法*/
    public abstract void work();
}
