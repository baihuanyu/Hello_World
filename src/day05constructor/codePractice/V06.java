package day05constructor.codePractice;

public class V06 {
    public static void main(String[] args) {
        add(10,20,true);
    }

    /*public static int add(int a ,int b,boolean c){
        if (c) {//如果 c 是false 的时候  这个方法就没有返回值语句
            return 0;
        }
    }*/
	/*public static int add(int a ,int b,boolean c){
		if (c) {//不管c 的值时多少  都有一个 return语句被执行到
			return 0;
		}else{
			return 1;
		}
	}*/
    public static int add(int a ,int b,boolean c){
        if (c) {//不管c 的值时多少  都有一个 return语句被执行到
            return 0;
        }else if(c){
            return 1;
        }else{
            return -1;
        }
    }
}
