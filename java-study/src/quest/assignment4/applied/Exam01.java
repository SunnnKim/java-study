/**
	화면에서 출생년도를 입력 받아 띠를 출력하는 프로그램을 작성하시오
    (단, 띠는 배열을 이용)
        띠 정보 : "원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"
        출력형식 >
            당신의 태어난 년도를 입력하세요 : 1980
            당신의 1980년에 태어난 당신은 원숭이띠 입니다. 

 */

package quest.assignment4.applied;
import	java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		String [] yearName = {
			"원숭이", "닭", "개", "돼지", "쥐", "소",
			"호랑이", "토끼", "용", "뱀", "말", "양"
		};
		// 아래에 코드를 추가해 주세요..
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 태어난 년도를 입력하세요 : ");
		int year = Integer.parseInt(sc.nextLine());
		int cal  = year % 12;
		System.out.print(year +"년에 태어난 당신은 " + yearName[cal]+"띠 "
				+ "입니다.");

		
	
	}
		
		
	}


