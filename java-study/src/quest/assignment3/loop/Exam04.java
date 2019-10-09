/**

4. 하나의 숫자를 입력 받아 완전수인지 판단하는 프로그램을 작성하시오.
완전수 판단 : 자기 자신을 제외한 약수의 합이 자기 자신과 같은 수 
예를 들어 > 6은 1, 2, 3 이 약수이며, 약수의 합이 6이다. 
출력형식 > 
수를 입력하세요 : 6 
6은 완전수 입니다. 


 */

package quest.assignment3.loop;
import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int input = Integer.parseInt(sc.nextLine());
		int sum=0;
		for(int i=1; i<input;i++) {
			if(input%i == 0) sum+= i;
		}if(sum == input) System.out.println(input+ "은 완전수 입니다.");
		else 	System.out.println(input+ "은 완전수가 아닙니다.");
		
		
	}

}
