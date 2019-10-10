package quest.assignment4;

import java.util.Arrays;
import java.util.Random;

public class Exam04 {
	public static void main(String[] args) {
		/*
		 *  랜덤한 수(1 - 20) 숫자를 10개 생성해서 배열에 입력한다.
		 *  랜덤한 수(1 - 20) 사이의 수 한개를 생성해서 변수 rNum에 입력
		 *  배열에 rNum보다 큰 숫자들의 합을 구한 후 화면에 출력한다.
			출력형식> 
			 생성된 배열의 요소 출력 : [Arrays.toString(배열) 써보기!!]
			 수의 합 : ?? 
		 */
		
		/*
		 * Arrays클래스 : import로불러온 뒤에는 따로 객체를 생성하지 않고 사용가능한 클래스 메소드
		 * - toString(array) :배열을 출력하는 메소드
		 * 사용법 : Arrays.toString(배열이름);
		 * */
		
		
		Random r = new Random();

		int rNum  = r.nextInt(20)+1;
		int sum=0;
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = r.nextInt(20)+1;
			if(rNum < arr[i]) sum += arr[i];
		}
		
		System.out.println("생성된 배열의 요소 출력 : " +Arrays.toString(arr));
		System.out.println("생성된 난수 : "+ rNum);
		System.out.println("수의 합 : " + sum);
	}
}
