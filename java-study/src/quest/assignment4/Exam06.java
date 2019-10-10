package quest.assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		
		
		/*
		 요소 위치 바꾸기 
		
		출력형식>
		첫 번째 인덱스 선택: 1
		두 번째 인덱스 선택: 3
		
		결과: [6, 9, 3, 8, 7, 4]
		
		배열의 크기보다 크거나 작은 인덱스를 입력하면 다시 입력할 것을 요구.
		 
		 */
		int[] arr = {6, 8, 3, 9, 7, 4};
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 인덱스 선택 : ");
		int input1 = Integer.parseInt(sc.nextLine());
		while( input1> arr.length || input1 < 0) {
			System.out.print("다시 입력하세요 : ");
			input1 = Integer.parseInt(sc.nextLine());
		}
		
		System.out.print("두 번째 인덱스 선택 : ");
		int input2 = Integer.parseInt(sc.nextLine());
		while( input2> arr.length || input2 < 0 ) {
			System.out.print("다시 입력하세요 : ");
			input2 = Integer.parseInt(sc.nextLine());
		}
		int temp;
		temp = arr[input1];
		arr[input1] = arr[input2];
		arr[input2] = temp;
		
		System.out.print("결과 : " +Arrays.toString(arr));
		
		
		
		
		
		
	}
}









