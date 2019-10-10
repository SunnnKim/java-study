/*
 * 아래와 같이 동작하는 프로그램을 작성하시오
 * 
 * - 정수 데이터를 5개 담을 수 있는 배열을 생성합니다.
 * - 배열의 초기값으로 랜덤하게 1 - 10 사이의 수를 입력합니다.
 * 
 * - 배열의 입력된 값을 화면에 출력합니다.
 * - 배열에 입력된 값들의 합을 화면에 출력합니다.
 * - 배열에 입력된 값들의 평균을 화면에 출력합니다.
 * - 배열에 입력된 값 중에서 최댓값을 화면에 출력합니다.
 * - 배열에 입력된 값 중에서 최솟값을 화면에 출력합니다.
  
        출력형식 >
  
    [8, 5, 7, 3, 6]
	합계 : 29
	평균 : 5.80
	최댓값 : 8
	최솟값 : 3
 */
package quest.assignment4;

import java.util.Arrays;
import java.util.Random;

public class Exam05 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] arr = new int[5];
		int sum = 0;
		int temp1, temp2;
		int max, min;
		double aver;
		
	for(int i=0;i<arr.length;i++) {
		arr[i] = r.nextInt(20)+1;
		sum = sum + arr[i];
	}
	
	//최소, 	최대값 찾기
	temp1 = arr[0];
	temp2 = arr[0];
	
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]>temp1) temp1 = arr[i];
		if(arr[i]<temp2) temp2 = arr[i];
	}
		max = temp1;
		min = temp2;
		aver = sum / 5.d;
		
		
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println("합계 : " + sum );
		System.out.println("평균 : "+ String.format("%.2f", aver));
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	
		
		
		
		
		
		
		
		
		
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println("합계 : " + sum);
//		System.out.printf("평균 : %.2f\n", (double)sum / arr.length);
//		System.out.println("최댓값 : " + max);
//		System.out.println("최솟값 : " + min);		
		
	}
}









