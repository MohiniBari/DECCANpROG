package javaprog;

public class NumberDemo {

	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public boolean evenOdd(int num) {
		boolean res;
		if (num % 2 == 0) {
			res = true;
		} else {
			res = false;
		}
		return res;
	}

	public int reverseNumber(int n) {
		int rev = 0;
		while (n > 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		return rev;
	}

	public boolean isPrime(int n) {
		boolean res = false;
		if (n == 0 || n == 1)
			System.out.println(n);
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				res = false;
				break;
			} else {
				res = true;
			}
		}
		return res;
	}

}
