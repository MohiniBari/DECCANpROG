package javaprog;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("Name is : " + name);
		System.out.println("Age  :" + age);
		if (age >= 18) {
			System.out.println(name + " can vote");
		} else {
			System.out.println(name + " can't vote");
		}
		sc.close();
	}
}
