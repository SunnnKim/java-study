/**

11. 아래와 같이 출력되는 로또 프로그램을 작성하시오. 
작성시 주의사항 
- 로또번호는 1 - 45 사이의 숫자만 나와야 합니다. (6개)	

 */
package quest.assignment3.loop;
import java.util.Random;


	public class Exam11 {
		public static void main(String[] args) {
		
			Random r = new Random();
			System.out.println("이번 주 행운의 숫자 입니다.");
			int[] num = new int[6];
			
			for(int i=0;i<6;i++) {
				num[i] = r.nextInt(45)+1;
			for(int j=i;j>0;j--) {
				if(num[i]==num[j-1]) { //중복확인
					num[i] = r.nextInt(45)+1;
					j=i+1; //처음부터 다시 확인
				}		
			}
				System.out.print(num[i]+" ");
			}
			
		}
}
