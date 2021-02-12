import java.util.Scanner;

public class IndiaVoteingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the voter name");
		String name = sc.next();
		System.out.println("Enter the voter age");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println(name + " can vote ");
		} else {
			System.out.println(name + " Get lost");

		}
		sc.close();
	}
}
