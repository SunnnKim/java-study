package quest.assignment1;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		//문자열 입력 예시
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요: ");
		String str = sc.nextLine();
		
		System.out.print("입력하신 문자는 " + str + "입니다.");
		
		//숫자 입력 예시
		System.out.print("입력하세요: ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("입력하신 숫자는 " + num + "입니다.");
		
		
		
	}
}
