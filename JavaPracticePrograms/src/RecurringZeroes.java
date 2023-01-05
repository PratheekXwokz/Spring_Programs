
public class RecurringZeroes {

	static int trailing(int n) {
		if (n < 0) {
			return -1;
		}
		int count = 0;

		for (int i = 5; n / i >= 1; i *= 5) {
			count = count + n / i;

		}
		return count;
	}

	public static void main(String[] agrs) {
		int n = 5;
		System.out.println(trailing(n));
	}

}
