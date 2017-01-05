package encapsulation;

public class Runner {
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		System.out.println(tc);
		tc.x = 5;
		System.out.println(tc);
	}
}
