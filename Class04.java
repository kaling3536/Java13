public class hw13_4 {
	public static void main(String args[]) {
		int num = 12;
		int den[] = { 12, 0, 3, 0, 0, 4 };

		for (int i = 0; i < 10; i++) {
			if (den.length < i || den[i] == 0) {
				System.out.println("程式執行有誤");
				break;
			} else
				System.out.println("ans=" + num / den[i]);
		}
	}
}
