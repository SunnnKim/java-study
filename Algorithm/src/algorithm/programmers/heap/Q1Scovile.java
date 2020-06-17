package algorithm.programmers.heap;

public class Q1Scovile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 
모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.

섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
 */

class Scoville{

	// 4 5 3 1 2 9 8 = 7
	//       4
	//    5      3
	//  1   2  9   8 
	
	public void heapSort(int[] arr ) {
		int number = arr.length;
		int root = 0;
		for(int i = 1; i < number; i++) {
			int c = root / 2;
			do {
				
				
				
			}while( c != 0);
			
			
			
		}
		
		
	}
	
	
	public int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	
	
}