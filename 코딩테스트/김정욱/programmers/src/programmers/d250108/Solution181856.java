package programmers.d250108;

/*
	배열 비교하기
	
	문제 설명
	이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.
	
	두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
	배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 
	같다면 같습니다.
	두 정수 배열 arr1과 arr2가 주어질 때, 위에서 정의한 배열의 대소관계에 대하여 arr2가 
	크다면 -1, arr1이 크다면 1, 두 배열이 같다면 0을 return 하는 solution 함수를 
	작성해 주세요.
	
	제한사항
	1 ≤ arr1의 길이 ≤ 100
	1 ≤ arr2의 길이 ≤ 100
	1 ≤ arr1의 원소 ≤ 100
	1 ≤ arr2의 원소 ≤ 100
	문제에서 정의한 배열의 대소관계가 일반적인 프로그래밍 언어에서 정의된 배열의 대소관계와 
	다를 수 있는 점에 유의해주세요.
	
	입출력 예
	arr1	arr2	result
	[49, 13]	[70, 11, 2]	-1
	[100, 17, 84, 1]	[55, 12, 65, 36]	1
	[1, 2, 3, 4, 5]	[3, 3, 3, 3, 3]	0
 */

public class Solution181856 {
	public int solution(int[] arr1, int[] arr2) {
        int sum1 = 0, sum2 = 0;
        if(arr1.length > arr2.length)
        	return 1;
        else if(arr1.length < arr2.length)
        	return -1;
        for(int i=0; i<arr1.length; i++) {
        	sum1 += arr1[i];
        	sum2 += arr2[i];
        }
        return sum1 > sum2 ? 1 : sum1 < sum2 ? -1 : 0;
    }
}
