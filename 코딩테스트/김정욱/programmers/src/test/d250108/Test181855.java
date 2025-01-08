package test.d250108;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import programmers.d250108.Solution181855;

class Test181855 {

	@ParameterizedTest
	@MethodSource("testCases")
	void testSolution(String[] strArr, int expect) {
		assertEquals(expect, new Solution181855().solution(strArr));
	}

	static Stream<Arguments> testCases(){
		return Stream.of(
			Arguments.of(new String[] {"a","bc","d","efg","hi"}, 2)
		);
	}
}
