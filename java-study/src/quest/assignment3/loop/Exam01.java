/**

1. 1부터 100까지의 홀수합계, 짝수합계, 전체 합계를 구하시오. 
홀수 합계 : ? 
짝수 합계 : ? 
전체 합계 : ? 


 */

package quest.assignment3.loop;


public class Exam01 {
	public static void main(String[] args) {
		
		
		int evenTotal=0, oddTotal=0;
		int total;
		
		for(int i=0;i<=100;i+=2) evenTotal += i;
		for(int i=1;i<=100;i+=2) oddTotal += i;
		total= evenTotal+oddTotal;
		
		System.out.println("홀수 합계 : " + oddTotal );
		System.out.println("짝수 합계 : " + evenTotal );		
		System.out.println("전체 합계 : " + total);		
		
	}
}
