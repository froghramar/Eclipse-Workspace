package problem7;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem7Test {

	@Test
	public void initOutputTesterPath1() {
		Problem7 obj = new Problem7();
		obj.a = 2; obj.b = 2; obj.c = 0;
		obj.init();
		String actual = obj.res;
		assertNotNull(actual);
		assertEquals("Yes", actual);
	}
	
	@Test
	public void initOutputTesterPath2() {
		Problem7 obj = new Problem7();
		obj.a = 2; obj.b = 3; obj.c = 0;
		obj.init();
		String actual = obj.res;
		assertNotNull(actual);
		assertEquals("No", actual);
	}
	
	@Test
	public void initOutputTesterPath3() {
		Problem7 obj = new Problem7();
		obj.a = 2; obj.b = 5; obj.c = 3;
		obj.init();
		String actual = obj.res;
		assertNotNull(actual);
		assertEquals("Yes", actual);
	}
	
	@Test
	public void initOutputTesterPath4() {
		Problem7 obj = new Problem7();
		obj.a = 2; obj.b = 5; obj.c = 9;
		obj.init();
		String actual = obj.res;
		assertNotNull(actual);
		assertEquals("No", actual);
	}

}
