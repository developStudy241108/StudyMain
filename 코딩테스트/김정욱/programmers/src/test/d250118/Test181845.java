package test.d250118;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import programmers.d250118.Solution181845;

class Test181845 {
	@ParameterizedTest
	@CsvSource({
		"123, '123'",
		"2573, '2573'"
	})
	void testSolution(int n, String expect) {
		assertEquals(expect, new Solution181845().solution(n));
	}
}
