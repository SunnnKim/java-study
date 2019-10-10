package quest.assignment4;

public class Exam02 {
	public static void main(String[] args) {
		/*
		 *   출력형식>
		 *   
		 *   배열의 모든 요소가 홀수 입니다.
		 *   
		 *   배열의 모든 요소가 홀수는 아닙니다.
		 */		
		int[] arr = {2, 1, 1, 4, 7, 3};
		
		int count=0;
	for(int i=0;i<6;i++) {
		if(arr[i]%2 ==0) count++;
	}
	if(count>0) System.out.print("배열의 모든 요소가 홀수는 아닙니다.");
	else System.out.print("배열의 모든 요소가 홀수 입니다.");	
	}
}











