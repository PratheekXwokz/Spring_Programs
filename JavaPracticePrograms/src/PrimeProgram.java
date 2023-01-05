

public class PrimeProgram {

	public static void main(String[] args) {
		int i, m = 0, prime = 0;
		int n = 11;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println("Its not a prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not a prime number");
					prime = 1;
					break;
				}
			}
			if (prime == 0) {
				System.out.println(n + " is a prime number");
			}
		}

	}

}
