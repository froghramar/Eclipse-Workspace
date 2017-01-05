package encapsulation;

public class TestClass {
	public int x;
	private int y;
	public TestClass() {
		// TODO Auto-generated constructor stub
		x = 20;
		y = 30;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "x = " + x + ", y = " + y;
	}
}
