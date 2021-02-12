import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check it is palindrom or not");
		int num = sc.nextInt();
		NumberProg np = new NumberProg();
		int res = np.reverseNum(num);
		if (num == res)
			System.out.println("palindrom");

		else {
			System.out.println("not palindrom");
		}
		sc.close();
	}

}
