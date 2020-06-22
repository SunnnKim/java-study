package coTest;

import java.util.LinkedList;
import java.util.Queue;

public class Test1 {
	
	public static void main(String[] args) {
		
		int[][] game = {
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,1,1,0,0,0},
				{0,0,0,1,0,0,0,0},
				{0,0,1,1,2,0,0,0},
				{0,0,2,2,2,0,0,0},
				{0,0,0,0,2,1,0,0},
				{0,0,0,0,0,0,0,0}
		};
		Othello o = new Othello();
		o.getSolution(game, 4);
		o.getSolution(game, 5);
		System.out.println();
		
	}
}
// 흑 1 백 2 
class Othello{
	Queue<Integer> queue = new LinkedList<Integer>();
	
	int[] root = { -1, 1 };
	
	public int solution(){
		
		return 0;
	}
	// 백돌을 검사하는 함수
	public void getSolution(int [][] arr, int row) {
		
		for(int i = 0; i < arr[row].length; i++ ) {
			if(arr[row][i] == 2 ){
				addQueue(arr, row, i);
				System.out.println("zzz");
			}
		}
	}
	
	public boolean addQueue(int [][] arr, int r, int c) {
		for(int i = 0; i < root.length; i++ ) {
			// 위 검사 
			if(arr[r+i][c] == 0 && arr[r-i][c] != 0) {
				System.out.println((r+1) + ", " + c);
			}
			// 옆 검사 
			if(arr[r][c+i] == 0 && arr[r][c-i] != 0) {
				System.out.println((r+1) + ", " + c);
			}
		}
		
		return true;
	}
}
/*
 
 
 */