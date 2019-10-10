package quest.assignment4;

public class Exam01 {
	public static void main(String[] args) {
		int[] arr = {6, 8, 3, 9, 7, 4};
		/*
		 *   출력형식>
		 *   최댓값 : 9
		 *   최솟값 : 3
		 */
		int max=0, min=0;
		int temp=arr[0];
		for(int i=0;i<6;i++){
			
			if(temp<arr[i]) temp = arr[i];

			max=temp;
		
			}
		for(int i=0;i<6;i++){
			
			if(temp>arr[i]) temp = arr[i];

			min=temp;
		
			}
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		}
}









