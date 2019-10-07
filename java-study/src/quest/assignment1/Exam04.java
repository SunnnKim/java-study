/*
	작성 조건 : 3항 연산자를 이용한다.
  
  	사용자가 입력한 값의 따라 아래와 같이 적용
    - 1 : +
    - 2 : -
    - 3 : *
    - 4 : /
    
	사칙연산 종류를 입력 : 1
	숫자1 : 10
	숫자2 : 2
    10 + 2 = 12
    
	사칙연산 종류를 입력 : 2
	숫자1 : 10
	숫자2 : 2
    10 - 2 = 8

	사칙연산 종류를 입력 : 3
	숫자1 : 10
	숫자2 : 2
    10 * 2 = 20
    
	사칙연산 종류를 입력 : 4
	숫자1 : 10
	숫자2 : 2
    10 / 2 = 5
 */
package quest.assignment1;
import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("- 1 : +\n- 2 : -\n- 3 : * \n- 4 : /");
		System.out.print("사칙연산 종류를 입력 : ");
		int opNum = Integer.parseInt(sc.nextLine());
		System.out.print("숫자1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("숫자2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		int result;
		
		if(opNum == 1 ) {
			result = num1 + num2;
			System.out.println(num1 + " + " +num2 + " = " + result);
		}
		
		else if(opNum == 2) {
			result = num1 - num2;
			System.out.println(num1 + " - " +num2 + " = " + result);
		}
		else if(opNum == 3)	{
			result = num1 * num2;		
			System.out.println(num1 + " * " +num2 + " = " + result);
		}
		else	{
			result = num1 / num2;
			System.out.println(num1 + " / " +num2 + " = " + result);
		}
		
	}
}








