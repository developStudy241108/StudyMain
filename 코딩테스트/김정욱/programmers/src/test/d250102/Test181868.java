package test.d250102;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import programmers.d250102.Solution181868;

class Test181868 {
	
	private Solution181868 obj = new Solution181868();

	@Test
	void testSolutionCase1() {
		String[] expect = {"i", "love", "you"};
		String my_string = " i    love  you";
		String[] actual = obj.solution(my_string);
		
		assertEquals(expect.length, actual.length);
		
		for(int i=0; i<actual.length; i++)
			assertEquals(expect[i], actual[i]);
	}
	
	@Test
	void testSolutionCase2() {
		String[] expect = {"programmers"};
		String my_string = "    programmers  ";
		String[] actual = obj.solution(my_string);
		
		assertEquals(expect.length, actual.length);
		
		for(int i=0; i<actual.length; i++)
			assertEquals(expect[i], actual[i]);
	}

}
