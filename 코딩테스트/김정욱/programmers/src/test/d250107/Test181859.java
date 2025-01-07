package test.d250107;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import programmers.d250107.Solution181859;

class Test181859 {

	@ParameterizedTest
	@MethodSource("testCases")
	void testSolution(int[] arr, int[] expect) {
		assertArrayEquals(expect, new Solution181859().solution(arr));
	}

	static Stream<Arguments> testCases(){
		return Stream.of(
			Arguments.of(new int[] {0, 1, 1, 1, 0}, new int[] {0, 1, 0}),
			Arguments.of(new int[] {0, 1, 0, 1, 0}, new int[] {0, 1, 0, 1, 0}),
			Arguments.of(new int[] {0, 1, 1, 0}, new int[] {-1})
		);
	}
}