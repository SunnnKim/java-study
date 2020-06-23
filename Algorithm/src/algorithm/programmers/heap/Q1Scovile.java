package algorithm.programmers.heap;

import java.util.Arrays;

public class Q1Scovile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scoville s = new Scoville();
		int[] arr = { 4, 5, 3, 1, 2, 9, 6};
		s.solution(arr);
	}

}
/*
Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 
모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.

섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
 */

class Scoville{
	
	public int getScovile(int[] arr, int k) {
		int count = -1;
		int result = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			count++;
			result = arr[i] + (2 * arr[i+1]);
			System.out.println(result);
		}
		if(result >= k) return count;
		else return -1;
	}

	public int[] getHeapArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int left = i * 2 + 1;
			int right = left + 1 < arr.length ? left + 1: 0;
			if(left >= arr.length ) continue;
			arr = sort(arr, left, right );
		}
		for (int i = arr.length - 1; i > 1; i--) {
			arr = sort(arr, 1, 2);
			arr = swap(arr, 0, i);
		}
		return arr;
		
	}
	
	public int[] sort(int[] arr, int left, int right ) {
		
		int parent = (left - 1) / 2;
		int child = arr[left] > arr[right] ? left:right;
		if(arr[parent] < arr[child]) arr = swap(arr, parent, child);
		
		return arr;
	}	
	
	public int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	
 }