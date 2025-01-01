package programmers.d250101;

/*
	문자열이 몇 번 등장하는지 세기
	
	문제 설명
	문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
	
	제한사항
	1 ≤ myString ≤ 1000
	1 ≤ pat ≤ 10
	
	입출력 예
	myString	pat		result
	"banana"	"ana"	2
	"aaaa"		"aa"	3
 */

public class Solution181871 {
	public int solution(String myString, String pat) {
		int answer = 0;
		int patLen = pat.length();
		for(int i=0; i<(myString.length()-patLen+1); i++) {
			if(myString.substring(i, i+patLen).equals(pat))
				answer++;
		}
		return answer;
	}
}
