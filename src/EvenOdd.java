import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check even or odd");
		int num = sc.nextInt();
		NumberProg np = new NumberProg();
		boolean res = np.evenOdd(num);
		if (res == true)
			System.out.println("number is even");
		else
			System.out.println("number is odd");
	}

}
