package test.d250116;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import programmers.d250116.Solution181851;

class Test181851 {

	@ParameterizedTest
	@MethodSource("testCases")
	void testSolution(int[] rank, boolean[] attendance, int result) {
		assertEquals(result, new Solution181851().solution(rank, attendance));
	}

	static Stream<Arguments> testCases(){
		return Stream.of(
			Arguments.of(new int[] {3, 7, 2, 5, 4, 6, 1}, new boolean[] {false, true, true, true, true, false, false}, 20403),
			Arguments.of(new int[] {1, 2, 3}, new boolean[] {true, true, true}, 102),
			Arguments.of(new int[] {6, 1, 5, 2, 3, 4}, new boolean[] {true, false, true, false, false, true}, 50200)
		);
	}
}
