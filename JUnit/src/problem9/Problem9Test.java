package problem9;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem9Test {

	@Test
	public void testPath1() {
		Problem9 obj = new Problem9();
		boolean result = obj.isleapYear(800);
		assertEquals(true, result);
	}
	
	@Test
	public void testPath2() {
		Problem9 obj = new Problem9();
		boolean result = obj.isleapYear(500);
		assertEquals(false, result);
	}
	
	@Test
	public void testPath3() {
		Problem9 obj = new Problem9();
		boolean result = obj.isleapYear(80);
		assertEquals(true, result);
	}
	
	@Test
	public void testPath4() {
		Problem9 obj = new Problem9();
		boolean result = obj.isleapYear(71);
		assertEquals(false, result);
	}

}
