package test.d250101;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import programmers.d250101.Solution181871;

class Test181871 {

	private Solution181871 obj = new Solution181871();
	
	@Test
	void testSolutionCase1() {
		assertEquals(2, obj.solution("banana", "ana"));
	}
	
	@Test
	void testSolutionCase2() {
		assertEquals(3, obj.solution("aaaa", "aa"));
	}

}
