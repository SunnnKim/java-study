/**

5. 보통 시험에는 과락이 있습니다. 
만약, 과락의 기준이 되는 점수가 60점이라면 1 - 100사이의 랜덤 숫자를 생성하여 
생성된 점수가 합격인지 불합격인지 판단하는 프로그램을 작성하시오 	

출력예시> 
96 점은 합격입니다. 
8점은 불합격입니다. 

 */
package quest.assignment2;
import java.util.Random;

public class Exam05 {
	public static void main(String[] args){
		Random r = new Random();
		int randomNum=r.nextInt(101);
		String str = randomNum>=60? "점은 합격입니다." : "점은 불합격입니다.";
		System.out.print(randomNum+str);
		
		
		
	}
}
