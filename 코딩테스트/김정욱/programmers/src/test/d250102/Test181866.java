package test.d250102;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import programmers.d250102.Solution181866;

class Test181866 {
	
	Solution181866 obj = new Solution181866();

	@Test
	void testSolutionCase1() {
		String myString = "axbxcxdx";
		String[] expect = {"a","b","c","d"};
		String[] actual = obj.solution(myString);
		
		assertEquals(expect.length, actual.length);
		
		for(int i=0; i<actual.length; i++) {
			assertEquals(expect[i], actual[i]);
		}
	}
	
	@Test
	void testSolutionCase2() {
		String myString = "dxccxbbbxaaaa";
		String[] expect = {"aaaa","bbb","cc","d"};
		String[] actual = obj.solution(myString);
		
		assertEquals(expect.length, actual.length);
		
		for(int i=0; i<actual.length; i++) {
			assertEquals(expect[i], actual[i]);
		}
	}

}
