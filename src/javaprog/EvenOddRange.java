package javaprog;

import java.util.Scanner;

public class EvenOddRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range to find even or odd");
		int range = sc.nextInt();
		NumberDemo nd = new NumberDemo();
		for (int i = 1; i <= range; i++) {
			boolean res = nd.evenOdd(i);
			if (res == true)
				System.out.println(i + " is even");
			else
				System.out.println(i + " is Odd");
		}

	}

}
