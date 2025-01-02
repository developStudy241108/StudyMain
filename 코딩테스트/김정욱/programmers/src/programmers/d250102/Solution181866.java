package programmers.d250102;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
	문자열 잘라서 정렬하기
	
	문제 설명
	문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
	
	단, 빈 문자열은 반환할 배열에 넣지 않습니다.
	
	제한사항
	1 ≤ myString ≤ 100,000
	myString은 알파벳 소문자로 이루어진 문자열입니다.
	
	입출력 예
	myString		result
	"axbxcxdx"		["a","b","c","d"]
	"dxccxbbbxaaaa"	["aaaa","bbb","cc","d"]
 */

public class Solution181866 {
	public String[] solution(String myString) {
		List<String> list = new ArrayList<String>();
		for(String str : myString.split("x"))
			//빈 문자열은 배열에 넣지 않는다는 조건이 있으므로 체크 후 list에 add
			if(!str.isEmpty())
				list.add(str);
		//Arrays.sort 를 사용했었으면 배열의 정렬이 가능했으나 몰랐기 때문에 Collections.sor사용
		Collections.sort(list);
        String[] answer = list.toArray(String[]::new);
        return answer;
    }
}
