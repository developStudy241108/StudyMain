package test.d250107;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import programmers.d250107.Solution181857;

class Test181857 {

	@ParameterizedTest
	@MethodSource("testCases")
	void testSolution(int[] arr, int[] expect) {
		assertArrayEquals(expect, new Solution181857().solution(arr));
	}
	
	static Stream<Arguments> testCases(){
		return Stream.of(
			Arguments.of(new int[] {1, 2, 3, 4, 5, 6}, new int[] {1, 2, 3, 4, 5, 6, 0, 0}),
			Arguments.of(new int[] {58, 172, 746, 89}, new int[] {58, 172, 746, 89})
		);
	}

}
