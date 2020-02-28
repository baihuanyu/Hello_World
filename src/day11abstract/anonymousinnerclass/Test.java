package day11abstract.anonymousinnerclass;

public class Test {
    public static void main(String[] args) {

        ITest test = new ITest() {
            @Override
            public void test() {
                System.out.println("匿名内部类");
            }
        };
        test.test();
    }
}
