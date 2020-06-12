package algorithm.boj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 문제
어떤 큰 도화지에 그림이 그려져 있을 때, 그 그림의 개수와, 
그 그림 중 넓이가 가장 넓은 것의 넓이를 출력하여라. 
단, 그림이라는 것은 1로 연결된 것을 한 그림이라고 정의하자. 
가로나 세로로 연결된 것은 연결이 된 것이고 대각선으로 연결이 된 것은 떨어진 그림이다. 
그림의 넓이란 그림에 포함된 1의 개수이다.

입력
첫째 줄에 도화지의 세로 크기 n(1 ≤ n ≤ 500)과 가로 크기 m(1 ≤ m ≤ 500)이 차례로 주어진다. 
두 번째 줄부터 n+1 줄 까지 그림의 정보가 주어진다. 
(단 그림의 정보는 0과 1이 공백을 두고 주어지며, 0은 색칠이 안된 부분, 1은 색칠이 된 부분을 의미한다)

출력
첫째 줄에는 그림의 개수, 둘째 줄에는 그 중 가장 넓은 그림의 넓이를 출력하여라. 
단, 그림이 하나도 없는 경우에는 가장 넓은 그림의 넓이는 0이다.

예제 입력 1 
6 5
1 1 0 1 1
0 1 1 0 0
0 0 0 0 0
1 0 1 1 1
0 0 1 1 1
0 0 1 1 1
예제 출력 1 
4
9
 */
public class Q1926 {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int[][] map = new int[a][b];
		for(int i=0; i<a; i++) {
			String num = sc.nextLine();
			for(int j = 0; j < b; j++) {
				map[i][j] = Integer.parseInt(num.split(" ")[j]);
			}
		}
		sc.close();
		Solution s = new Solution(map, a, b);
		int countPath = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				int num = s.bfs(i, j);
				if(map[i][j] != 0 && num != 0) {
					countPath++;
					arr.add(num);
				}
				s.count = 0;
			}
		}
		int max = arr.get(0);
		for(int n : arr) {
			if(max < n){
				max = n;
			}
		}
		System.out.println(countPath);
		System.out.println(max);
	}


}
class Solution{
	boolean visited[][];
	int map[][];
	int count = 0;	// 갯수 카운트
	int breadth = 0; // 넓이의 합 
	Queue<Pointer> queue;
	
	public Solution() {
	}
	// 생성자 
	public Solution( int [][] map, int a, int b) {
		this.map = map;
		visited = new boolean[a][b];
		queue = new LinkedList<Pointer>();
	}
	
	// 현재 위치를 반환 
	class Pointer{
		int dx;
		int dy;
		public Pointer(int dx, int dy) {
			this.dx = dx;
			this.dy = dy;
		}
	}
	
	public int bfs(int a, int b) {
		if(!visited[a][b]) { 
			visited[a][b] = true;

			if(map[a][b] == 1) count++;
			else return 0;
			
			
			if( b+1 < map[0].length ) {
				if( !visited[a][b+1] && map[a][b+1] == 1 ) {
//					System.out.println("b+1 : " + (a) + " , " + (b+1));
					queue.add(new Pointer(a, b+1));
				}
			}
			if( a+1 < map.length  ) {
				if( !visited[a+1][b] && map[a+1][b] == 1) {
//					System.out.println("a+1 : " + (a+1) + " , " + (b));
					queue.add(new Pointer(a+1, b));
				}
			}
			while( !queue.isEmpty() ) {
				Pointer p2 = queue.poll();
//				System.out.println("p2 : " + p2.dx + " , " + p2.dy);
				bfs(p2.dx, p2.dy);
			}
		}
		return count;
		
	}
	
	
}
