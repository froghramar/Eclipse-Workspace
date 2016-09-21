package problem3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem3Test {

	@Test
	public void generatedCatalanNumberTest() {
		Problem3 obj = new Problem3();
		obj.catalanNumber(1);
		int []actual = obj.cat;
		int []expected = {1,1};
		assertNotNull(actual);
		assertArrayEquals(expected, actual);
	}

}
