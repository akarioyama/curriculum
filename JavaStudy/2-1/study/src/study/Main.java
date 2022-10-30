package study;

public class Main {

	public static void main(String[] args) {

		String firstName = "akari";
		String lastName = "oyama";

		System.out.println(getName(firstName, lastName));
		System.out.println();

		int[] arr = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 11; i < 20; i++) {
			if (i % 2 == 1) {
				System.out.println(i + "は奇数です。");
			}
		}
	}

	public static String getName(String firstName, String lastName) {
		return "firstName" + "lastName";
	}

	public static void isOdd(int num) {
		if (num % 2 != 0) {
			System.out.println(num + "は奇数です。");
		}
	}
}