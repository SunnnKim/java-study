package quest.assignment4;

import java.util.Scanner;


public class Exam03 {
	public static void main(String[] args) {
		/*
		 *   수를 입력 : 3
		 *   배열에 3이 1개가 들어있습니다.
		 *   
		 *   수를 입력 : 1
		 *   배열에 1이 0개가 들어있습니다.
		 *   
		 *   수를 입력 : -1
		 *   종료합니다.
		 */
		int[] arr = {4, 3, 3, 9, 3, 4};	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력 : ");
		int input = Integer.parseInt(sc.nextLine());
		int count=0;
		if(input<0) System.out.print("종료합니다.");
		else {
			for(int i=0;i<arr.length;i++) 
				if(arr[i]==input) count++;
			
		System.out.print("배열에 "+input+"이 "+count+"개가 들어있습니다.");
		}
	}
}







