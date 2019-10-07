/*
	아래와 같이 출력하는 프로그램을 작성하시오   
	출력형식 >
  
	초를 입력하시오 : 3661  
	3661초는 1시간 1분 1초 입니다.
 */
package quest.assignment1;

import java.util.Scanner;


public class Exam01 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("초를 입력하시오 : ");
	int num = Integer.parseInt(sc.nextLine());
	int hour, min, sec=0;
	hour = num / 3600;
	min = (num % 3600) / 60;
	sec = ((num % 3600)% 60);
	
	System.out.println(hour+"시간 "+min +"분 "+sec + "초 입니다.");	
		
	}
}


