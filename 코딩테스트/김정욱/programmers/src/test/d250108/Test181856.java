package test.d250108;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import programmers.d250108.Solution181856;

class Test181856 {

	@ParameterizedTest
	@MethodSource("testCases")
	void testSolution(int[] arr1, int[] arr2, int expect) {
		assertEquals(expect, new Solution181856().solution(arr1, arr2));
	}

	static Stream<Arguments> testCases(){
		return Stream.of(
			Arguments.of(new int[] {49, 13}, new int[] {70, 11, 2}, -1),
			Arguments.of(new int[] {100, 17, 84, 1}, new int[] {55, 12, 65, 36}, 1),
			Arguments.of(new int[] {1, 2, 3, 4, 5}, new int[] {3, 3, 3, 3, 3}, 0)
		);
	}
}
