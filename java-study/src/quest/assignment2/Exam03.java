/**
3. 
상품의 수량과 단가를 입력받고, 수량이 10개 미만이면 할인을 적용하지 않고, 
10개 이상이면서 금액이 50000원 이상이면 10%의 할인을 적용하여 총 금액을 구하는 프로그램을 작성 
하시오. 

출력예시> 
상품 수량을 입력하시오 : 10 
상품 가격을 입력하시오 : 10000 
상품 총 가격은 100000 원 입니다. 
상품 수량을 입력하시오 : 20 
상품 가격을 입력하시오 : 50000 
상품 총 가격은 900000 원 입니다. 

*/

package quest.assignment2;
import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 수량을 입력하시오 : ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("상품 가격을 입력하시오 : ");
		int price = Integer.parseInt(sc.nextLine());
		double total = num>=10? price>=5000? num*price*0.9:num*price:num*price;
		System.out.print("상품 총 가격은 " +(int)total+"원 입니다.");
		
	}}
	
	
	

