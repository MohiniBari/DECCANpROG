import java.util.Scanner;

public class EvenOddRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int range = sc.nextInt();
		int eveSum = 0, oddSum = 0;
		NumberProg n = new NumberProg();
		for (int i = 1; i <= range; i++) {
			boolean res = n.evenOdd(i);
			if (res) {
				System.out.println(i + " is even");
				eveSum = eveSum + i;
			} else {
				System.out.println(i + " is Odd");
				oddSum = oddSum + i;
			}
		}
		System.out.println("Total even sum is =" + eveSum);
		System.out.println("Total odd sum is =" + oddSum);

	}

}
