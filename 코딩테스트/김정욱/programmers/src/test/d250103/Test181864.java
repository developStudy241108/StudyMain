package test.d250103;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import programmers.d250103.Solution181864;

class Test181864 {

	@ParameterizedTest
	@CsvSource({
		"'ABBAA', 'AABB', 1",
		"'ABAB', 'ABAB', 0"
	})
	void testSolution(String myString, String pat, int expect) {
		Solution181864 obj = new Solution181864();
		assertEquals(expect, obj.solution(myString, pat));
	}

}
