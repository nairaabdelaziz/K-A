package kellyAndAs;

public class FirstTest {

	public static void main(String[] args) {

		int maxLines = 4; // here you can adjust the num. of lines when needed

		for (int i = 1; i <= maxLines; i++) {
			printLine(i);
		}

		for (int i = maxLines - 1; i >= 1; i--) {
			printLine(i);
		}
	}

	private static void printLine(int lineNumber) {
		for (int i = 1; i <= lineNumber; i++) {
			System.out.print("#");
		}
		System.out.println();
	}

}
