/**

8. 10부터 20사이의 랜덤한 숫자를  생성한 다음 생성된 숫자 만큼의 소수를 출력하는 프로그램을 작성하시오.

 */

package quest.assignment3.loop;
import java.util.Random;


public class Exam08 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int ranNum = 10 + r.nextInt(11);
		System.out.print("랜덤한 숫자 "+ ranNum+" 만큼의 소수 : ");
		int count = 0, total=0;
		
		for(int i=1;i<=100;i++) {
			
			for(int j=1;j<=i;j++) {
				if(i%j == 0) count++;
			}
			
			if(count == 2) {
				System.out.print(i + " ");
				total++;
			}
			count =0;
			if(total==ranNum) break;
 		}
	}
		
		
		
	
}
