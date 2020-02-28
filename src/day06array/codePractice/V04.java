package day06array.codePractice;

public class V04 {public static void main(String[] args) {
    int[] arr = new int[10];
    arr[0]=89;
    arr[1]=99;
    arr[2]=65;
    arr[3]=35;
    arr[4]=69;
    arr[5]=66;
    arr[6]=77;
    arr[7]=98;
    arr[8]=88;
    arr[9]=67;
    int a=0;
    int b=0;
    int c=0;
    //遍历数组 取到每一个数
    for (int i = 0;i<arr.length;i++) {
        //
        int s = arr[i];
        //对每一个数做判断
        if (s>=0 & s<60) {
            a++;
        }else if (s>=60&s<80) {
            b++;
        }else if (s>=80) {
            c++;
        }
    }
    System.out.println("0-60:"+a);
    System.out.println("60-80:"+b);
    System.out.println("80-100:"+c);

}

    //数组的遍历
    private static void t1() {
        int[] arr= new int[100];
        arr[0]=11;
        arr[1]=14;
        arr[2]=19;
        arr[3]=18;
        arr[4]=15;
        arr[5]=10;
		/*System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		System.out.println(arr[6]);
		System.out.println(arr[7]);
		System.out.println(arr[8]);
		System.out.println(arr[9]);
		*/
        //循环的次数 应该是和 数组的长度精密相关
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
