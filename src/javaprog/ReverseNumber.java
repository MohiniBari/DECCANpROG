package javaprog;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		int num = sc.nextInt();
		NumberDemo n = new NumberDemo();
		int res = n.reverseNumber(num);
		System.out.println(res);
	}

}
