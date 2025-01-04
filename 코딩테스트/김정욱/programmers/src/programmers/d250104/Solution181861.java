package programmers.d250104;

import java.util.ArrayList;
import java.util.List;

public class Solution181861 {
	public int[] solution(int[] arr) {
		int arrLength = 0;
		int count = 0;
        int[] answer = {};
        for(int num:arr)
        	arrLength += num;
        answer = new int[arrLength];
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<arr[i]; j++) {
        		answer[count++] = arr[i];
        	}
        }
        return answer;
//		List<Integer> list = new ArrayList<Integer>();
//		for(int num:arr)
//			for(int i=0; i<num; i++)
//				list.add(num);
//		return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
