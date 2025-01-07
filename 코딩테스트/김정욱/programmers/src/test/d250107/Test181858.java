package test.d250107;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import programmers.d250107.Solution181858;

class Test181858 {

	@ParameterizedTest
	@MethodSource("testCases")
	void testSolution(int[] arr, int k, int[] expect) {
		assertArrayEquals(expect, new Solution181858().solution(arr, k));
	}

	static Stream<Arguments> testCases(){
		return Stream.of(
			Arguments.of(new int[] {0, 1, 1, 2, 2, 3}, 3, new int[] {0, 1, 2}),
			Arguments.of(new int[] {0, 1, 1, 1, 1}, 4, new int[] {0, 1, -1, -1})
		);
	}
}
