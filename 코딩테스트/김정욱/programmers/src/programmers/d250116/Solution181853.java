package programmers.d250116;

/*
	뒤에서 5등까지
	
	문제 설명
	정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
	
	제한사항
	6 ≤ num_list의 길이 ≤ 30
	1 ≤ num_list의 원소 ≤ 100
	
	입출력 예
	num_list	result
	[12, 4, 15, 46, 38, 1, 14]	[1, 4, 12, 14, 15]
 */

public class Solution181853 {
	public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int min = -1, minIndex = -1;
        
        for(int i=0; i<answer.length; i++) {
        	//num_list 전체를 탐색
        	for(int j=0; j<num_list.length; j++) {
        		if(min==-1 || min > num_list[j]) {
        			min = num_list[j];
        			minIndex = j;
        		}
        	}
        	
        	// 앞의 num_list 탐색으로 얻은 최소값을 answer에 기록 후 num_list에서 해당값 제거, min을 초기화
        	answer[i] = min;
        	min = -1;
        	num_list[minIndex] = 101;
        }
        return answer;
    }
}
