package test.d250108;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import programmers.d250108.Solution181854;


class Test181854 {

	@ParameterizedTest
	@MethodSource("testCases")
	void testSolution(int[] arr, int n, int[] expect) {
		assertArrayEquals(expect, new Solution181854().solution(arr, n));
	}

	static Stream<Arguments> testCases(){
		return Stream.of(
			Arguments.of(new int[] {49, 12, 100, 276, 33}, 27, new int[] {76, 12, 127, 276, 60}),
			Arguments.of(new int[] {444, 555, 666, 777}, 100, new int[] {444, 655, 666, 877})
		);
	}
}
