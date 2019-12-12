package quest.assignment7.sorting;

public class SelectedSorting {
	public static void main(String[] args) {
	
		SelectedSort ss = new SelectedSort();
		int[] rNum = ss.getNumberArray();
		System.out.println("정렬 전 :");
		ss.printArray(rNum);
		System.out.println("오름차순 선택 정렬 :");
		ss.selectedSortingUp(rNum);
		ss.printArray(rNum);
		System.out.println("내림차순 선택 정렬 :");
		ss.selectedSortingDown(rNum);
		ss.printArray(rNum);
		
	}
}

// 선택 정렬 클래스
// 메소드로 구현 
class SelectedSort{
	
	private int[] rNum  = new int[10];
	private boolean[] _switch  = new boolean[100];
	
	// 생성자로 랜덤숫자 10개 배열 받기 
	public SelectedSort() {
		int w = 0;
		while(w<10) {
			int n = (int)(Math.random()*100);
			if(!_switch[n]) {
				_switch[n] = true;
				rNum[w] = n + 1;
				w++;
			}
		}
	}
	public int[] getNumberArray() {
		return rNum;
	}
	// 오름차순 선택정렬  
	public void selectedSortingUp(int[] rNum) {
		int hold = rNum[1];
		int temp = 0;
		boolean change = false;
		
		for (int i = 0; i < rNum.length-1; i++) {
			change = false;
			hold =i+1;
			for (int j = i+1; j < rNum.length; j++) {
				if(rNum[i] > rNum[j] && rNum[j] <= rNum[hold]) {
					hold = j;
					change = true;
				}
			}
			if(change) {
				temp = rNum[i];
				rNum[i] = rNum[hold];
				rNum[hold] = temp;
			}
		}
	
	}
	
	// 오름차순 선택정렬  
	public void selectedSortingDown(int[] rNum) {
		int hold = rNum[1];
		int temp = 0;
		boolean change = false;
		
		for (int i = 0; i < rNum.length-1; i++) {
			change = false;
			hold =i+1;
			for (int j = i+1; j < rNum.length; j++) {
				if(rNum[i] < rNum[j] && rNum[j] >= rNum[hold]) {
					hold = j;
					change = true;
				}
			}
			if(change) {
				temp = rNum[i];
				rNum[i] = rNum[hold];
				rNum[hold] = temp;
			}
		}
		
	}
	
	public void printArray(int[] rNum) {
		for (int i = 0; i < rNum.length; i++) {
			System.out.print(" [" + rNum[i] + "]\t");
		}System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
}