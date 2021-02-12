package javaprog;

import java.util.Scanner;

public class PrintNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = sc.nextInt();

		for (int i = 0; i <= range; i++) {
			System.out.println(i);
		}
	}

}
