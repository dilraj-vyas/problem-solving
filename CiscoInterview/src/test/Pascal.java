package test;

public class Pascal {
	/*
	 * public static void main(String[] args) {
	 * 
	 * for (int i = 1; i <= 10; i++) { int c = 1; for (int j = 1; j <= i; j++) {
	 * System.out.print(c); c = c * (i - j) / j; } System.out.println(); }
	 * 
	 * Scanner sc = new Scanner(System.in); String name = sc.next(); String
	 * surname = sc.next();
	 * 
	 * System.out.println(name); System.out.println(surname); }
	 */

	public static void main(String[] args) {
		// System.out.println(convert(1101));
		System.out.println(convertUsingRecursion(1101, 0, 0));
	}

	private static int convertUsingRecursion(int n, int pow, int result) {
		if (n == 0) {
			return 0;
		}
		result += ((int) n % 10 * Math.pow(2, pow))
				+ convertUsingRecursion(n / 10, ++pow, result);
		return result;
	}
}
