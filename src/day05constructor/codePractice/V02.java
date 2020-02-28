package day05constructor.codePractice;

public class V02 {
    /*
	 *****
	 *****
	 *****
	 *****
	 *****
	 嵌套for循环
	 	for(){//外层循环 决定行数
	 		for(){//内层循环 决定列数   （决定每一行 行内内容）

	 		}
	 	}

	 */
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            System.out.println("i============="+i);
            for (int j = 1; j <=5; j++) {
                System.out.println("j="+j);
            }
        }

    }

    private static void t1() {
		/*System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		*/
        //1.先解决 行的问题
        for(int i=1;i<=5;i++){
            //	System.out.println("*****");
        }
        //System.out.println("*****");
		/*System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");*/
        // 2.解决每一行的内容问题
        for(int j=1;j<=5;j++){
            //System.out.print("*");
        }
        // 合二为一
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }
}
