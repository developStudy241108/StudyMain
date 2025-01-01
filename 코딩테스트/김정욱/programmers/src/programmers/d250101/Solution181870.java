package programmers.d250101;

import java.util.ArrayList;
import java.util.List;

/*
	문제 설명
	문자열 배열 strArr가 주어집니다. 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 
	남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.
	
	제한사항
	1 ≤ strArr의 길이 ≤ 1,000
	1 ≤ strArr의 원소의 길이 ≤ 20
	strArr의 원소는 알파벳 소문자로 이루어진 문자열입니다.
	
	입출력 예
	strArr							result
	["and","notad","abcd"]			["and","abcd"]
	["there","are","no","a","ds"]	["there","are","no","a","ds"]
 */

public class Solution181870 {
	public String[] solution(String[] strArr) {
		List<String> list = new ArrayList<String>();
		for(int i=0; i<strArr.length; i++) {
			if(!strArr[i].contains("ad"))
				list.add(strArr[i]);
		}
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}
