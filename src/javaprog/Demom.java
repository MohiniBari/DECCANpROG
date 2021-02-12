package javaprog;

import java.util.Scanner;

public class Demom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter gender is 'M = 1' 'F=2' 'O=3'");
		int gender = sc.nextInt();
		if (gender == 1) {
			if (age >= 21) {
				System.out.println(name + " Eligible");
			} else {
				System.out.println(name + " Not Eligible");

			}
		}
		if (gender == 2) {
			if (age >= 18) {
				System.out.println(name + " Eligible");
			} else {
				System.out.println(name + " Not Eligible");

			}
		}
		if (gender == 3) {
			System.out.println("Hii..");
		}
	}

}
