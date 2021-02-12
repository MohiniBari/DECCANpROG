import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your city");
		String city = sc.nextLine();
		System.out.println("Name is :" + name);
		System.out.println("Age is :" + age);
		System.out.println("Lives in :" + city);
	}
}
