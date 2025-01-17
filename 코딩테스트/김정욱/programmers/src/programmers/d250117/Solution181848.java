package programmers.d250117;

/*
문자열을 정수로 변환하기

문제 설명
숫자로만 이루어진 문자열 n_str이 주어질 때, n_str을 정수로 변환하여 
return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n_str ≤ 5
n_str은 0부터 9까지의 정수 문자로만 이루어져 있습니다.

입출력 예
n_str	result
"10"	10
"8542"	8542
 */

public class Solution181848 {
	public int solution(String n_str) {
		//parseInt로 풀면 쉽지만 너무 쉬워서 아쉬웠다
		//int answer = Integer.parseInt(n_str);
		int answer = 0;
		for(int i=n_str.length(); i>0; i--) {
			//해당 하는 자릿수의 숫자를 구해서 자릿수 만큼의 10의 배수를 곱해줌
			answer += (n_str.charAt(n_str.length()-i)-'0') * (int)Math.pow(10, i-1);
		}
        return answer;
    }
}
