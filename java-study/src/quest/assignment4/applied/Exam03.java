package quest.assignment4.applied;
/**
제공되는 data 배열에 입력된 수들이 몇개씩 들어있는지 체크해서 다음과 같이 출력하는 프로그램을 작성하시오

Number frequency
     1         3
     2         4
     3         9
     4         2
     5         2	
	
 */

public class Exam03 {
	public static void main(String[] args) {
		// data의 값은 변경하지 않습니다.
		int[] data = { 
				1, 2, 5, 4, 3, 
				5, 2, 1, 3, 3, 
				1, 4, 3, 3, 3, 
				2, 3, 3, 2, 3 
		};
		
		// 빈도수 체크 배열 : 아래의 배열에 data 있는 각 숫자가 몇개씩 있는지 입력합니다.
		int[] frequency = new int[5]; 

		// 아래에 코드를 추가해 주세요..
		
		int count=0;
		System.out.println("Number	Frequency");

		for(int i=1;i<=frequency.length;i++) {
			for(int j=0;j<data.length;j++) 
				if(data[j]== i) count++;
			frequency[i-1] = count;
			count=0;
		}
		
		for(int i=1;i<=frequency.length;i++) System.out.println("  "+i+"       "+frequency[i-1]);
		
		
		
	}
}