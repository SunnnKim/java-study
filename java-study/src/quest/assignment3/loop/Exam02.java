/**
2. 1 - 100사이의 랜덤 숫자 5개를 생성하여 생성된 숫자의 합계와 평균을 구하시오.
단, 평균은 소수점 아래 2자리만 출력 
생성된 수 : 3 12 55 9 90 
합계 : ? 
평균 : ? 


 */
package quest.assignment3.loop;
import java.util.Random;

public class Exam02 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int randomNum =0;
		int sum = 0;
		double average = 0;
		
		System.out.print("생성된 수 : ");
		for(int i=0;i<5;i++)	{
			randomNum = r.nextInt(100)+1;
			System.out.print(randomNum+ " ");
			sum += randomNum;
		}average = sum / 5.d;
		System.out.println("\n합계 : " + sum);
		System.out.println("평균 : " + String.format("%.2f", average));
		
	}}
