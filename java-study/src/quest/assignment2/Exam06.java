/**

6. 1 - 100사이의 랜덤숫자를 생성하여 숫자가 짝수인지 홀수인지 출력하는 프로그램을 작성하시오 

 */

package quest.assignment2;

import java.util.Random;

public class Exam06 {
	public static void main(String[] args) {
		Random r = new Random();
		int number = r.nextInt(10);
		//number는 0 ~ 9
		
		System.out.println("발생한 난수 : " + number);
	}
}
