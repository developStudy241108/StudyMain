package programmers.d250102;

import java.util.ArrayList;
import java.util.List;

/*
	x 사이의 개수
	
	문제 설명
	문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
	
	제한사항
	1 ≤ myString의 길이 ≤ 100,000
	myString은 알파벳 소문자로 이루어진 문자열입니다.
	
	입출력 예
	myString		result
	"oxooxoxxox"	[1, 2, 1, 0, 1, 0]
	"xabcxdefxghi"	[0, 3, 3, 3]
 */

public class Solution181867 {
	public int[] solution(String myString) {
		List<Integer> list;
		int[] answer;
		
		//list의 인스턴스 생성 및 for문으로 split으로 쪼갠 단어의 길이를 list에 add
		list = new ArrayList<Integer>();
		for(String str : (myString).split("x", -1))
			list.add(str.length());
		
		//answer 참조변수에 int[] 인스턴스 할당 -> list.toArray 하려 했으나 형변환이 안되었음
        answer = new int[list.size()];
        
        //list의 값으로 answer 배열을 채움
        for(int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
