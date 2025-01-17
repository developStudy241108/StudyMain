package test.d250117;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import programmers.d250117.Solution181848;

class Test181848 {
	@ParameterizedTest
	@CsvSource({
		"'10', 10",
		"'8542', 8542"
	})
	void testSolution(String n_str, int expect) {
		assertEquals(expect, new Solution181848().solution(n_str));
	}
}
