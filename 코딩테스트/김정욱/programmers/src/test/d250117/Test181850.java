package test.d250117;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import programmers.d250117.Solution181850;

class Test181850 {

	@ParameterizedTest
	@CsvSource({
		"1.42, 1",
		"69.32, 69"
	})
	void testSolution(double flo, int expect) {
		assertEquals(expect, new Solution181850().solution(flo));
	}

}
