import java.util.Scanner;

public class Cal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();
		int res1 = add(num1, num2);
		System.out.println(res1);
		int res2 = sub(num1, num2);
		System.out.println(res2);
		int res3 = multi(num1, num2);
		System.out.println(res3);
		int res4 = div(num1, num2);
		System.out.println(res4);
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int multi(int a, int b) {
		return a * b;
	}

	public static int div(int a, int b) {
		return a / b;
	}

}
