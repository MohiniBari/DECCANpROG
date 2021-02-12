package javaprog;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd  number");
		int num2 = sc.nextInt();
		NumberDemo nd = new NumberDemo();
		int res = nd.add(num1, num2);
		System.out.println("Sum is = " + res);
	}

}
