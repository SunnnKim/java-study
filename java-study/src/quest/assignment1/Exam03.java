/*
	아래와 같이 출력하는 프로그램을 작성하시오   
	
	환율 계산 : 1달러당 1088.11 원
	출력 시 소수점 아래 2자리만 출력 

	출력형식 >
	   	
	달러를 입력하시오 : 30    
	원화 : 32643.30원	
	
	달러를 입력하시오 : 100      
	원화 : 108811.00원  
 */
package quest.assignment1;
import java.util.Scanner;


public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달러를 입력하시오 : ");
		int num = Integer.parseInt(sc.nextLine());
		double currency = num * 1088.11;
		//소수점 아래 2자리까지 출력
		String str = String.format("%.2f", currency);
		System.out.println("원화 : "+ str +"원 ");

	}
}







