package test.d250101;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import programmers.d250101.Solution181869;

class Test181869 {
	
	private Solution181869 obj = new Solution181869();

	@Test
	void testSolutionCase1() {
		String[] expectCase1 = {"i", "love", "you"};
		String[] actualCase1 = obj.solution("i love you");
		
		//결과값 배열 크기가 0인 경우 for문에서 assert검사 자체를 안하게 되어버려서 길이 비교 따로 추가함
		assertEquals(expectCase1.length, actualCase1.length);
		
		for(int i=0; i<actualCase1.length; i++) {
			assertEquals(expectCase1[i], actualCase1[i]);
		}
	}
	
	@Test
	void testSolutionCase2() {
		String[] expectCase2 = {"programmers"};
		String[] actualCase2 = obj.solution("programmers");
		
		assertEquals(expectCase2.length, actualCase2.length);
		
		for(int i=0; i<actualCase2.length; i++) {
			assertEquals(expectCase2[i], actualCase2[i]);
		}
	}

}
