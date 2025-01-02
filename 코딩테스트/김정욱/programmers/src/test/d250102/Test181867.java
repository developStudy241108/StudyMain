package test.d250102;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import programmers.d250102.Solution181867;

class Test181867 {
	
	private Solution181867 obj = new Solution181867();

	@Test
	void testSolutionCase1() {
		String myString = "oxooxoxxox";
		int[] expect = {1, 2, 1, 0, 1, 0};
		int[] actual = obj.solution(myString);
		
		assertEquals(expect.length, actual.length);
		
		for(int i=0; i<actual.length; i++) {
			assertEquals(expect[i], actual[i]);
		}
	}
	
	@Test
	void testSolutionCase2() {
		String myString = "xabcxdefxghi";
		int[] expect = {0, 3, 3, 3};
		int[] actual = obj.solution(myString);
		
		assertEquals(expect.length, actual.length);
		
		for(int i=0; i<actual.length; i++) {
			assertEquals(expect[i], actual[i]);
		}
	}

}
