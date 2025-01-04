package test.d250104;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import programmers.d250104.Solution181862;

class Test181862 {

	@ParameterizedTest
	@MethodSource("testCases")
//	@CsvSource({
//		"'baconlettucetomato', ['onlettu', 'etom', 'to']",
//		"'abcd', ['d']",
//		"'cabab', ['EMPTY']"
//	})
	void testSolution(String myStr, String[] expect) {
		String[] actual = new Solution181862().solution(myStr);
//		assertArrayEquals(expect, actual);
		for(int i=0; i<actual.length; i++)
			assertEquals(expect[i], actual[i]);
	}
	
	static Stream<Arguments> testCases(){
		return Stream.of(
			Arguments.of("baconlettucetomato", new String[]{"onlettu", "etom", "to"}),
			Arguments.of("abcd", new String[]{"d"}),
	        Arguments.of("cabab", new String[]{"EMPTY"})
		);
	}

}
