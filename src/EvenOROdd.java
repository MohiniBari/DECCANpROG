import java.util.Scanner;

public class EvenOROdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int num = sc.nextInt();
		if (num > 0 && num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
	}

}
