/**

9. 화면에서 행의 수와 열의 수를 입력 받아 아래와 같은 형식으로 출력되는 프로그램을 작성 
하시오 주의 사항 : 
출력 행이 홀수일 경우 문자( "<" )를 먼저 출력, 짝수일 경우 문자( ">" )를 먼저 출력 
출력형식 > 
출력할 행의 수를 입력하세요(1-10) : 4 
출력할 열의 수를 입력하세요(1-10) : 4 
>>>> 
<<<< 
>>>>  
<<<< 
출력할 행의 수를 입력하세요(1-10) : 3 
출력할 열의 수를 입력하세요(1-10) : 3 
<<< 
>>> 
<<< 


 */

package quest.assignment3.loop;
import java.util.Scanner;


public class Exam09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 행의 수를 입력하세요(1-10) : ");
		int row = Integer.parseInt(sc.nextLine());
		System.out.print("출력할 의 수를 입력하세요(1-10) : ");
		int column = Integer.parseInt(sc.nextLine());
		
		if(row%2 == 1) { //행이 홀수일경우
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					System.out.print("<");
				}System.out.println("");
			}
		}
		else { //행이 짝
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					System.out.print(">");
				}System.out.println("");
			}
		}
	}
	
}
