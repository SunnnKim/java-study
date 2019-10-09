/**

6. 화면에서 2 - 9사이의 숫자 2개를 입력 받아 두 숫자 사이의 구구단을 출력하는 프로그램을 작성하시오. 
예를 들어 화면에서 4 와 8을 입력 받았다면 4단부터 8단까지 화면에 출력한다. 
구구단 출력시 각 단별로 줄넘김 처리한다. 

 */

package quest.assignment3.loop;
import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요(2 - 9 ) : ");
		int input1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 수를 입력하세요(2 - 9 ) : ");
		int input2 = Integer.parseInt(sc.nextLine());
		
		if(input1<=input2) {
			for(int i=input1;i<=input2;i++) {
				System.out.print(i+"단 ");
			for(int j=1;j<10;j++) {
				if(i*j<10) System.out.print(" "+i*j + " ");
				else System.out.print(+i*j + " ");
			}System.out.println("");
		}}else {
			for(int i=input1;i>=input2;i--) {
			System.out.print(i+"단 ");
		for(int j=1;j<10;j++) 	{
			if(i*j<10) System.out.print(" "+i*j + " ");
			else System.out.print(i*j + " ");
		}System.out.println("");
		}}
		
		
	}
}
