package test.d250104;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import programmers.d250104.Solution181861;

class Test181861 {

	@ParameterizedTest
	@MethodSource("testCases")
	void testSolution(int[] arr, int[] expect) {
		Solution181861 obj = new Solution181861();
		assertArrayEquals(expect, obj.solution(arr));
	}

	static Stream<Arguments> testCases(){
		return Stream.of(
			Arguments.of(new int[] {5, 1, 4},new int[] {5, 5, 5, 5, 5, 1, 4, 4, 4, 4}),
			Arguments.of(new int[] {6, 6},new int[] {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6}),
			Arguments.of(new int[] {1},new int[] {1})
		);
	}
}
