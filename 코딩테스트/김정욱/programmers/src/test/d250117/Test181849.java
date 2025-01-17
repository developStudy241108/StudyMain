package test.d250117;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import programmers.d250117.Solution181849;

class Test181849 {
	@ParameterizedTest
	@CsvSource({
		"'123456789', 45",
		"'1000000', 1"
	})
	void testSolution(String num_str, int expect) {
		assertEquals(expect, new Solution181849().solution(num_str));
	}
}
