/**

7. 1 부터 100사이의 숫자 중에서 소수를 출력하는 프로그램을 작성하시오. 
소수는 그 수 자신과 1을 제외한 다른 정수로는 나누어 떨어지지 않는 정수 
3이 소수인지 판별 : 
3 % 1 == 0 (참) 
3 % 2 == 0 (거짓) 
3 % 3 == 0 (참) 
참인 경우가 2개인 경우 소수 


 */

package quest.assignment3.loop;


public class Exam07 {

	public static void main(String[] args) {
		
		int count=0;
		System.out.print("소수는 : ");
		for(int i=2;i<=100;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j == 0) count++;
			}if(count==2) System.out.print(i+" ");
			count=0;

		}
		
		
		
	}
	
	
}
