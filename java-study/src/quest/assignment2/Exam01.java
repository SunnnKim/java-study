/**
1. 
하이마트에서 할인 행사를 진행합니다. 물건값에 따라서 각각의 할인율이 적용됩니다.
--------------------------------------------------
물건값  |  10만원 이하 | 30만원 이하 | 100만원 이하 | 100만원 초과 | 
--------------------------------------------------
할인율  |       3% |       5% |       8% |      10% |
--------------------------------------------------
 
화면에서 물건값을 입력 받아 할인된 금액을 계산하여 출력하는 프로그램을 작성하시오 

출력예시> 
물건값을 입력하세요(만원) : 10 
할인된 금액은 97000 원입니다. 
물건값을 입력하세요(만원) : 20 
할인된 금액은 190000 입니다. 
 */
package quest.assignment2;
import java.util.Scanner;

public class Exam01 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("물건값을 입력하세요(만원) : ");
	int money = Integer.parseInt(sc.nextLine());
	
	
	double discount = money <= 10 ? money* 0.97 : money<= 30 ? money*0.95 : money<=100? money*0.92 : money*0.9;
	discount*=10000;
	System.out.print("할인적용 금액은 " + (int)discount + " 원 입니다.");
	}
}
