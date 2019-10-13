package quest.assignment5.method;
/*
getValue 메서드를 구현하고 이를 테스트하는 코드를 작성. getValue 메쏘드는 int 타 
입의 배열을 입력 받아 최대값 또는 최소값을 리턴합니다. isMax 값이 true 이면 최대 
값을 리턴하고, false 이면 최소값을 리턴합니다. 
<<출력 결과>> 
최대값 : 87 
최소값 : 2 

 */
public class Exam01 { 
	public int getValue(int[] values, boolean isMax) {
		//- isMax 값이 true 이면 int 타입의 배열값(values)에서 최대값을 리턴한다. 
		//- isMax 값이 false 이면 int 타입의 배열값(values)에서 최소값을 리턴한다.
		// 코드 완성 
		return 0; 
	}
	public static void main(String[] args) { 
		Exam01 ex01 = new Exam01(); 
		// getValue 메소드를 호출하고 결과 학인 
		int [] arr = {9, 2, 87, 12, 30}; int max = ex01.getValue(arr, true); 
		System.out.println("최대값 : " + max); 
		int min = ex01.getValue(arr, false); 
		System.out.println("최소값 : " + min); 
	} 
} 


