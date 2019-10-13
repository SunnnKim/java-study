
/**
    배열에 임의의 수 4개를 생성(1-10)하여 저장 한 후 입력된 수에 따라 화면에 "*"로 출력하는 프로그램을 작성하시오
    출력형식 > 
    요소                        생성된 수                                출력
  0               3                     ***
  1               7                     *******
  2               5                     *****
  3               9                     *********

 */

package quest.assignment4.applied;
import java.util.*;

public class Exam02 {
	public static void main(String [] args) {
		// 아래에 코드를 추가해 주세요..
		
		Random r = new Random();
		int[] arr = new int[4];
		int length = arr.length;
		
		for(int i=0;i<length;i++) arr[i] = r.nextInt(10)+1; //난수 생성
		
		
		System.out.println("요소       생성된 수         출력");
		for(int i=0;i<length;i++) {
			System.out.print(i+"          "+arr[i]+"             ");
			for(int j=0;j<arr[i];j++) 	System.out.print("*");
			System.out.println("");
		}
	
	}
}