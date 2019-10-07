/**
2. 화면에서 3개의 숫자를 입력 받아 최대값과 최소값을 구하는 프로그램을 작성하시오. 
출력예시> 
첫번째 숫자를 입력하세요 : 7 
두번째 숫자를 입력하세요 : 3 
세번째 숫자를 입력하세요 : 10 
최대값 : 10, 최소값 : 3 

*/
package quest.assignment2;
import java.util.Scanner;

public class Exam02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		//	입력값
		int num[] = new int[3];
		
		for(int i=1;i<4;i++) {
		System.out.print(i+"번째 숫자를 입력하세요 : ");
		num[i-1] = Integer.parseInt(sc.nextLine());
		}
		
		int max = num[0];
		int min = num[0];
		
		for(int i=1; i<3; i++) 		max = max >= num[i]? max:num[i];
		for(int i=1; i<3; i++) 		min = min <= num[i]? min:num[i];
		
		System.out.print("최대값 : " + max +", 최소값 : "+ min);
		
		
		
	}
	


}
