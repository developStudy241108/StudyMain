package programmers.d250116;

/*
뒤에서 5등 위로

문제 설명
정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 제외한 
수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
6 ≤ num_list의 길이 ≤ 30
1 ≤ num_list의 원소 ≤ 100

입출력 예
num_list	result
[12, 4, 15, 46, 38, 1, 14, 56, 32, 10]	[15, 32, 38, 46, 56]
 */

public class Solution181852 {

	public int[] solution(int[] num_list) {
		int[] inputList = num_list.clone();
        int[] answer = new int[num_list.length-5];
        int min = -1, minIndex = -1;
        
        for(int i=0; i<inputList.length; i++) {
        	for(int j=0; j<inputList.length; j++) {
        		if(inputList[j] != -1 && (min == -1 || min > inputList[j])) {
        			min = inputList[j];
        			minIndex = j;
        		}
        	}
        	if(i>=5)
        		answer[i-5] = inputList[minIndex];
        	
        	inputList[minIndex] = -1;
    		min = -1;
        }
        return answer;
    }
}
