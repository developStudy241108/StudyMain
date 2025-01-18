package test.d250118;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import programmers.d250118.Solution181847;

class Test181847 {
	@ParameterizedTest
	@CsvSource({
		"'0010', '10'",
		"'854020', '854020'"
	})
	void testSolution(String n_str, String expect) {
		assertEquals(expect, new Solution181847().solution(n_str));
	}
}