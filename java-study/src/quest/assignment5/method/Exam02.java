package quest.assignment5.method;
/*

int findMedian(int[] values) 메소드를 구현하고 이를 테스트하는 코드 작성. 
findMedian 메소드는 입력 받은 숫자 배열 중 평균값에 제일 가까운 중간 값을 계산 
<<처리 결과>> 
중간값 : 33 
중간값 : 52 

 */
public class Exam02 { 
	public static int findMedian(int[] values) { 
		//- 중간 값이란 평균값에 제일 가까운 값을 말합니다. 
		//- 중간 값이 여러 개 일 경우, 작은 수를 리턴 합니다. 
		// 코드 완성 
		int sum=0;
		int median=0;
		int length = values.length;
		
		for(int i=0;i<length;i++) 
			sum += values[i]; 
		
		int avg = sum / length;
		int temp = values[0];

		for(int i=0;i<length;i++) {
			if( Math.abs(avg - values[i]) < Math.abs(avg - temp) ) {
				temp = values[i];
			}else if(Math.abs(avg - values[i]) == Math.abs(avg - temp)) {
				if(values[i]< temp) temp = values[i];
			}
			median = temp;
		}
		
		
		return median;
	} 
public static void main(String[] args) { 
// getValue 메소드를 호출하고 결과 학인 
		int [] arr1 = {10, 4, 53, 63, 17, 37, 52, 16, 33, 65}; 
		int mid = findMedian(arr1); 
		System.out.println("중간값 : " + mid);
		int [] arr2 = {32, 53, 52, 76, 15, 98, 76, 65, 36, 10}; 
		mid = findMedian(arr2); 
		System.out.println("중간값 : " + mid); 
		
} 
} 
