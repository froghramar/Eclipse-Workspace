package problem2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem2Test {

	@Test
	public void isPrimeOutputTesterPath1() {
		Problem2 obj = new Problem2();
		boolean result = obj.isPrime(4);
		assertEquals(false, result);
	}
	
	@Test
	public void isPrimeOutputTesterPath2() {
		Problem2 obj = new Problem2();
		boolean result = obj.isPrime(5);
		assertEquals(true, result);
	}

}
