package day05constructor.codePractice;

public class V07 {
    public static void main(String[] args) {
        int max = max(10,100);
        System.out.println(max);
        int max2 = max(10,30,60);
        System.out.println(max2);
    }

    public static int max(int a,int b){
		/*if(a>b){
			return a;
		}else {
			return b;
		}*/
        //优化  三目运算
		/*int max =a>b?a:b;
		return max;
		*/
        return a>b?a:b;
    }
    public static int max(int a,int b,int c){
        //  a如果大于b   比较 a c
	/*	if(a>b){
			if (a>c) {
				return a;
			}else {
				return c;
			}
		}else {// 比较 b  c
			if (b>c) {
				return b;
			}else {
				return c;
			}
		}*/
        //优化 三目运算
		/*if (a>b) {
			return a>c?a:c;
		}else {
			return b>c?b:c;
		}*/
        //优化 +plus
        return a>b?max(a,c):max(b,c);

    }
}
