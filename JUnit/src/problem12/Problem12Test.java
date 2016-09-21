package problem12;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Problem12Test {

	@Test
	public void testPath1() {
		Problem12 obj = new Problem12();
		obj.factorization(5);
		ArrayList<Integer> out = obj.output;
		int len = out.size();
		int actual[] = new int[len];
		for(int i = 0; i < len; i++) actual[i] = out.get(i);
		int expected[] = {};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testPath2() {
		Problem12 obj = new Problem12();
		obj.factorization(4);
		ArrayList<Integer> out = obj.output;
		int len = out.size();
		int actual[] = new int[len];
		for(int i = 0; i < len; i++) actual[i] = out.get(i);
		int expected[] = {};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testPath3() {
		Problem12 obj = new Problem12();
		obj.factorization(6);
		ArrayList<Integer> out = obj.output;
		int len = out.size();
		int actual[] = new int[len];
		for(int i = 0; i < len; i++) actual[i] = out.get(i);
		int expected[] = {3};
		assertArrayEquals(expected, actual);
	}

}
