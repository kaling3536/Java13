public class hw13_7 {
	public static void test(int num, int den) throws ArithmeticException {
		System.out.println(num + "/" + den + "=" + num / den);
	}

	public static void main(String args[]) {
		try {
			test(5, 0);
		} catch (ArithmeticException e) {
			System.out.println("除數為 0");
		} finally {
			System.out.println("end of main() method!!");
		}
	}
}
