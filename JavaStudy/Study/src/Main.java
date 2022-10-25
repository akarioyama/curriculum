public class Main {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		int result = plus (x, y);
		print(result);
	}
	public static int plus(int x, int y) {
		return x + y;
	}
	public static void print(int result) {
		System.out.println(result);
	}
}