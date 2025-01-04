package test.d250104;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import programmers.d250104.Solution181860;

class Test181860 {

	@Test
	void testSolution() {
		int[] arr = {3, 2, 4, 1, 3};
		boolean[] flag = {true, false, true, false, false};
		int[] expect = {3, 3, 3, 3, 4, 4, 4, 4};
		
		assertArrayEquals(expect, new Solution181860().solution(arr, flag));
	}

}
