public class hw13_3 {
	public static void main(String args[]) {
		try {
			int num = 12, den = 0;
			int ans = num / den;
			System.out.println("ans=" + ans);
		} catch (ArithmeticException e) {
			System.out.println("除數為 0");
		} finally {
			System.out.println("end of main() method!!");
		}
	}
}
