package problem11;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem11Test {

	@Test
	public void testPath1() {
		Problem11 obj = new Problem11();
		obj.seive(2);
		boolean actual[] = obj.isPrime;
		boolean expected[] = {false, false};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testPath2() {
		Problem11 obj = new Problem11();
		obj.seive(5);
		boolean actual[] = obj.isPrime;
		boolean expected[] = {false, false, true, true, false};
		assertArrayEquals(expected, actual);
	}

}
