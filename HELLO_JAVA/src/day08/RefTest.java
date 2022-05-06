package day08;

public class RefTest {

	public static void main(String[] args) {
		int a = 0;
		int[] b = {1};
		System.out.println("a:" + a); //0
		System.out.println("b:" + b[0]); //1
		myincrease1(a);
		myincrease2(b);
		System.out.println("a:" + a); //0
		System.out.println("b:" + b[0]); //2
	}
	
	public static void myincrease1(int a) {
		a++;
	}
	
	public static void myincrease2(int[] arr) {
		arr[0]++;
	}

}
