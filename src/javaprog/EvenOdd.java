package javaprog;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number to check even or odd");
		int num = sc.nextInt();
		NumberDemo nd = new NumberDemo();
		boolean res = nd.evenOdd(num);
		if (res == true) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}

	}

}
