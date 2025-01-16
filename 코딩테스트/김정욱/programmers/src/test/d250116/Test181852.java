package test.d250116;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import programmers.d250116.Solution181852;

class Test181852 {

	@ParameterizedTest
	@MethodSource("testCases")
	void testSolution(int[] num_list, int[] expect) {
		assertArrayEquals(expect, new Solution181852().solution(num_list));
	}

	static Stream<Arguments> testCases(){
		return Stream.of(
			Arguments.of(new int[] {12, 4, 15, 46, 38, 1, 14, 56, 32, 10}, new int[] {15, 32, 38, 46, 56})
		);
	}
}
