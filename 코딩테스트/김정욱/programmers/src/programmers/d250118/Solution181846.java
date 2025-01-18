package programmers.d250118;

/*
두 수의 합

문제 설명
0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ a의 길이 ≤ 100,000
1 ≤ b의 길이 ≤ 100,000
a와 b는 숫자로만 이루어져 있습니다.
a와 b는 정수 0이 아니라면 0으로 시작하지 않습니다.

입출력 예
a	b	result
"582"	"734"	"1316"
"18446744073709551615"	"287346502836570928366"	"305793246910280479981"
"0"	"0"	"0"
 */
public class Solution181846 {
	public String solution(String a, String b) {
		int length = a.length() >= b.length() ? a.length()+1 : b.length() + 1;
		int aNum, bNum, sum;
		boolean up = false;
		String answer = "";
		for(int i=0; i<length; i++) {
			aNum = (a.length() > i) ? a.charAt(a.length()-i-1) - '0' : 0;
			bNum = (b.length() > i) ? b.charAt(b.length()-i-1) - '0' : 0;
			sum = aNum + bNum;
			sum = up ? sum + 1 : sum;
			if(sum>9) {
				sum -= 10;
				up = true;
			}else
				up = false;
			answer = "" + sum + answer;
		}
		answer = answer.replaceFirst("^[0]+", "");
        return answer.isEmpty() ? "0" : answer;
    }
}
