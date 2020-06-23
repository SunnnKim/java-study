package coTest;

import java.util.Stack;

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
		o.getSolution(game, 8, 8);
		
	}
}
// 흑 1 백 2 
class Othello{
	
	int[] dx = { 1,1,1,0,0,-1,-1,-1 };
	int[] dy = { 0,1,-1,1,-1,-1,0,1};
	
	Stack<Node> stack = new Stack<Node>();
	
	// 기준 노드의 방향성을 담고 있는 클래스 Node
	class Node{
		// 초기화 - 맨 처음 노드,. 방향성 없는 단계 
		public Node(int dx, int dy) {
			this.dx = dx;
			this.dy = dy;
			this.dir = new int[2];
			dir[0] = -3;
			dir[1] = -3;
		}
		// 초기화 2 - 방향성 있는 노드 
		public Node(int dx, int dy, int[] dir) {
			this.dir = dir;
			this.dx = dx;
			this.dy = dy;
		}
		
		int dx, dy;	// 기준점  
		int dir[]; 	// 방향성 
	}
	
	public int solution(){
		
		return 0;
	}
	// 돌을 검사하는 함수
	public void getSolution(int [][] arr, int N, int M) {
		
		// stack에 모두 담기
		for(int i = 0; i < arr.length; i++ ) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] == 1) {
					stack.push(new Node(i, j));
				}
			}
		}
		
		int count = 0 ;
		int maxCount = 0;
		// stack 꺼내는 작업
		while(!stack.isEmpty()) {
			Node node = stack.pop();
			// 방향성이 있는 경우 
			if(node.dir[0] != -3 || node.dir[1] != -3 ) {
				count++;	// 카운트 업 
				// 방향성 확인
				int nextX = node.dx + node.dir[0];
				int nextY = node.dy + node.dir[1];
				
				if( arr[nextX][nextY] == 2) {
					stack.push(new Node(nextX, nextY, node.dir));
				}
				else if( arr[nextX][nextY] == 1) {
					count = 0;
					continue;
				}
				else {
					maxCount = count > maxCount ? count : maxCount;
					count = 0;
				}
			}
			// 아직 방향성이 없는 경우 
			else {	
				for(int i = 0; i < 8; i++ ) {
					// 탐색할 다음 노드의 좌표  
					int nextX = node.dx + dx[i];
					int nextY = node.dy + dy[i];
					int dir[] = new int[2];
					
					// 범위를 넘어갈 경우 스킵 
					if(nextX < 0 || nextY < 0 || nextX > N || nextY > M  ) {
						continue;
					}
					// 2가 아닌 경우 스킵 
					if(arr[nextX][nextY] != 2 ) {
						continue;
					}
					// 2인 경우 
					dir[0] = dx[i];
                    dir[1] = dy[i];
					stack.push(new Node(nextX, nextY, dir));
				}
			}
		}
		System.out.println(maxCount);
	}
}
/*
 
 
 */