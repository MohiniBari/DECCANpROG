
public class NumberProg {
	public boolean evenOdd(int n) {
		if (n % 2 == 0)
			return true;
		else
			return false;
	}

	public int reverseNum(int n) {
		int rev = 0;
		while (n > 0) {
			int re = n % 10;
			rev = rev * 10 + re;
			n = n / 10;
		}
		return rev;
	}
}
