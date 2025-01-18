package test.d250118;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import programmers.d250118.Solution181846;

class Test181846 {
	@ParameterizedTest
	@CsvSource({
		"'582', '734', '1316'",
		"'18446744073709551615', '287346502836570928366', '305793246910280479981'",
		"'0', '0', '0'"
	})
	void testSolution(String a, String b, String expect) {
		assertEquals(expect, new Solution181846().solution(a, b));
	}

}
