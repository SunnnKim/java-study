/**
4. 하나의 숫자를 입력 받아 입력 받은 수의 절대값을 구하는 프로그램을 작성하시오 

출력예시> 
숫자를 입력하세요 : -3 
-3의 절대값 : 3 
숫자를 입력하세요 : 3 
3의 절대값 : 3 
 */
package quest.assignment2;
import java.util.Scanner;
public class Exam04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		int abNum = num<=0? num*-1:num;
		
		System.out.print(num+"의 절대값 : " + abNum );		

	}

}
