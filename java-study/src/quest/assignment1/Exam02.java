/*
	아래와 같이 출력하는 프로그램을 작성하시오   
	출력형식 >
	
	수를 입력하시오 : 10 
	수를 입력하시오 : 7   
	몫 : 1
	나머지 : 3
	
	수를 입력하시오 : 20 
	수를 입력하시오 : 3   
	몫 : 6
	나머지 : 2
 */
package quest.assignment1;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {

		for(int i=0; i<2 ; i++) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("수를 입력하시오 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		int quotient = num1 / num2;
		System.out.println("몫 : "+ quotient);
		int reminder = num1 % num2;
		System.out.println("나머지 : "+reminder+"\n");

		}
		
		
	}
}





