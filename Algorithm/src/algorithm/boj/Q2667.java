package algorithm.boj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 <그림 1>과 같이 정사각형 모양의 지도가 있다. 
 1은 집이 있는 곳을, 0은 집이 없는 곳을 나타낸다. 
 철수는 이 지도를 가지고 연결된 집들의 모임인 단지를 정의하고, 단지에 번호를 붙이려 한다. 
 여기서 연결되었다는 것은 어떤 집이 좌우, 혹은 아래위로 다른 집이 있는 경우를 말한다. 
 대각선상에 집이 있는 경우는 연결된 것이 아니다.
 <그림 2>는 <그림 1>을 단지별로 번호를 붙인 것이다. 
 지도를 입력하여 단지수를 출력하고, 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.
 
 입력
첫 번째 줄에는 지도의 크기 N(정사각형이므로 가로와 세로의 크기는 같으며 5≤N≤25)이 입력되고,
그 다음 N줄에는 각각 N개의 자료(0혹은 1)가 입력된다.

출력
첫 번째 줄에는 총 단지수를 출력하시오. 
그리고 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력하시오.

예제 입력 1 
7
0110100
0110101
1110101
0000111
0100000
0111110
0111000

예제 출력 1 
3
7
8
9
 */
public class Q2667 {

	public static void main(String[] args) {
		// 입력사항 - 정사각형 단지의 한변 크기 
		// 출력사항 -	1.전체 단지수, 
		//			2.각 단지별 집의 수 
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[][] arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(str.charAt(j) + "");
			}
		}
		
//		int N = 7;
//		int arr[][] = {
//				{ 0,1,1,0,1,0,0},
//				{ 0,1,1,0,1,0,1},
//				{ 1,1,1,0,1,0,1},
//				{ 0,0,0,0,1,1,1},
//				{ 0,1,0,0,0,0,0},
//				{ 0,1,1,1,1,1,0},
//				{ 0,1,1,1,0,0,0}
//		};
//		
		
		Apartment a = new Apartment(arr);
		a.solution();
		
		
	}
	

}


class Apartment{
	
	Queue<Node> queue;
	int[] dx= { 0, 1,-1, 0 };
	int[] dy= { 1, 0, 0,-1 };
	int[][] arr;
	boolean visited[][];
	ArrayList<Integer> answer;
	
	public Apartment(int[][] arr) {
		queue = new LinkedList<Node>();
		answer = new ArrayList<Integer>();	
		this.arr = arr;
		visited = new boolean[arr.length][arr.length];
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited.length; j++) {
				visited[i][j] = false;
			}
		}
	}
	
	public void solution() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
					// 방문한 노드가 아니라면
					int count = BFS(i,j,0);
					if(count!= 0) {
						count++;
						answer.add(count);
					}
			}
		}
		System.out.println(answer.size());
		for(int n : answer) {
			System.out.println(n);
		}
	}
			
	
	public int BFS(int N, int M, int count) {

		int length = arr.length;
		if(!visited[N][M]) {
			visited[N][M] = true;
			
			if(arr[N][M] == 1) {
				for (int i = 0; i < 4; i++) {
					int nextX = N + dx[i];	// 새로운 X좌표  
					int nextY = M + dy[i];	// 새로운 Y좌표 
					// 범위 벗어난 경우 
					if( nextX >= length || nextX < 0 || nextY >= length || nextY < 0) {
						continue;
					}
					if(arr[nextX][nextY] == 0 ) {
						continue;
					}
					if(!visited[nextX][nextY]) {
						// 통과
						count++;
						count = BFS(nextX, nextY, count);
					}
				}
			}
		}
		return count;
	}
	
	
	class Node{
		int x;
		int y;
		int apart;
		
		public Node() {
			x = -1;
			y = -1;
			apart = -1;
		}
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
			apart = -1;
		}
		public Node(int x, int y, int apart) {
			this.x = x;
			this.y = y;
			this.apart = apart;
		}
	}
}