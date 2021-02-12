import java.util.Scanner;

public class MageIndia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();

		System.out.println("Enter 1 for male 2 for female 3 for others");
		int gender = sc.nextInt();

		System.out.println("Enter age");
		int age = sc.nextInt();
		
		if (gender == 1) {
			if (age >= 21) {
				System.out.println(name + " is Eligible");
			} else {
				System.out.println(name + " Wait till 21");
			}
		}
		if (gender == 2) {
			if (age >= 18) {
				System.out.println(name + " is Eligible");
			} else {
				System.out.println(name + " Wait till 18");
			}
		}
		if (gender == 3) {
			System.out.println("Hii...");
		}
	}
}
