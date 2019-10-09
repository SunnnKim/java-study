/**

12. 아래와 같이 출력되는 프로그램을 작성하시오 
문제개요 : 시스템에서 랜덤한 숫자(1 – 1000) 를 생성한 후 사용자에게 최대 10번의 수를 입력 
받아서 입력한 수와 시스템이 생성한 수와 동일한지 맞추는 프로그램 
출력형식 > 
1부터 1000사이의 숫자를 맞추는 게임입니다.(총 10회) 
1회. 숫자를 입력하세요(1 - 1000) : 3 
3보다 큰 값 입니다. 
2회. 숫자를 입력하세요(1 - 1000) : 500 
500보다 작은 값 입니다. 
3회. 숫자를 입력하세요(1 - 1000) : 250 
정답입니다. 
1부터 1000사이의 숫자를 맞추는 게임입니다.(총 10회) 
1회. 숫자를 입력하세요(1 - 1000) : 3 
3보다 큰 값 입니다. 
생략...... 
10회. 숫자를 입력하세요(1 - 1000) : 3 
3보다 큰 값 입니다. 
10회안에 맞추기 게임에 실패하였습니다. 
정답은 85입니다. 


 */
package quest.assignment3.loop;
import java.util.Scanner;
import java.util.Random;

public class Exam12 {
	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int randomNum = r.nextInt(1001)+1;
		int input;
		
	System.out.println("1부터 1000사이의 숫자를 맞추는 게임입니다.(총 10회)");
	for(int i=1;i<=10;i++) {
			System.out.print(i+"회. 숫자를 입력하세요(1 - 1000) : ");
			input = Integer.parseInt(sc.nextLine());
			if(input > randomNum) System.out.println(input+"보다 작은 값 입니다.");
			else if (input < randomNum) System.out.println(input+"보다 큰 값 입니다.");
			else {
				System.out.println("정답입니다.");
				break;
			}
		if(i==10) System.out.println("10회안에 맞추기 실패하였습니다.");	
		
		}
	}
}
