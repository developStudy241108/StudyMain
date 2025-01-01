package test.d250101;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import programmers.d250101.Solution181870;

class Test181870 {
	
	private Solution181870 obj = new Solution181870();

	@Test
	void testSolutionCase1() {
//		assertEquals(new String[]{"and","abcd"}, obj.solution(new String[]{"and","notad","abcd"}));
		String[] expectCase1 = {"and","abcd"};
		String[] actualCase1 = obj.solution(new String[]{"and","notad","abcd"});
		for(int i=0; i<actualCase1.length; i++) {
			assertEquals(expectCase1[i], actualCase1[i]);
		}
	}
	
	@Test
	void testSolutionCase2() {
//		assertEquals(new String[]{"there","are","no","a","ds"}, obj.solution(new String[]{"there","are","no","a","ds"}));
		String[] expectCase2 = {"there","are","no","a","ds"};
		String[] actualCase2 = obj.solution(new String[]{"there","are","no","a","ds"});
		for(int i=0; i<actualCase2.length; i++) {
			assertEquals(expectCase2[i], actualCase2[i]);
		}
	}

}
