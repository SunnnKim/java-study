package quest.assignment4;

import java.util.Arrays;

public class Exam07 {
	public static void main(String[] args) {
		int[] arr = {6, 8, 3, 1, 9, 7, 4};
		// arr 배열의 요소를 꺼꾸로 저장해서 출력하기.
		
		int temp;
		for(int i = 0; i<arr.length/2;i++) {
			
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		System.out.print(Arrays.toString(arr));
		
		
		
	}
}






















