package programmers.d250118;

/*
문자열로 변환

문제 설명
정수 n이 주어질 때, n을 문자열로 변환하여 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 10000

입출력 예
n	result
123	"123"
2573	"2573"
 */

public class Solution181845 {
	public String solution(int n) {
		//GPT에 질의해보니 ""+ 를 사용하면 StringBuilder를 사용해서 불필요한 문자열을 여러번 만든다고 함
        //return ""+n;
		//Integer.toString()이 성능상으로 최적화가 되어있고 내가 실제 코드를 실행했을때 시간 단축이 엄청 크게됨
		return Integer.toString(n);
    }
}
