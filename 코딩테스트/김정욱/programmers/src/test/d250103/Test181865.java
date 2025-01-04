package test.d250103;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import programmers.d250103.Solution181865;

class Test181865 {
	
	private Solution181865 obj = new Solution181865();
	
	@ParameterizedTest
    @CsvSource({
        "'43 + 12', 55",
        "'0 - 7777', -7777",
        "'40000 * 40000', 1600000000"
    })
    void testSolution(String binomial, int expect) {
        int actual = obj.solution(binomial);
        assertEquals(expect, actual);
    }
	
}
