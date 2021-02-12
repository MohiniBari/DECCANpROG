package javaprog;

import java.util.Scanner;

public class CHeckPrinme {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int num = sc.nextInt();
		NumberDemo n = new NumberDemo();
		boolean res = n.isPrime(num);
		if (res == true)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
	}

}
