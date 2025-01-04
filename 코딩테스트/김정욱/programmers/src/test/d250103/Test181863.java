package test.d250103;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import programmers.d250103.Solution181863;

class Test181863 {

	@ParameterizedTest
	@CsvSource({
		"'masterpiece', 'rnasterpiece'",
		"'programmers', 'prograrnrners'",
		"'jerry', 'jerry'",
		"'burn', 'burn'"
	})
	void testSolution(String rny_string, String expect) {
		assertEquals(expect, new Solution181863().solution(rny_string));
	}

}
