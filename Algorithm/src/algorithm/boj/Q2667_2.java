package algorithm.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

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
public class Q2667_2 {
	// 확인용 boolean
	static boolean visited[][];
	// 방향
	static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
	// count
	static int count = 0;

	public static void main(String[] args) throws Exception {
		// 입력사항 - 정사각형 단지의 한변 크기 
		// 출력사항 -	1.전체 단지수, 
		//			2.각 단지별 집의 수 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 
	    int n = Integer.parseInt(br.readLine());
	    int arr[][] = new int[n][n];
	    visited = new boolean[n][n];		
	    for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(str.charAt(j)+"");
				visited[i][j] = false;
			}
		}
	    // solution
	    
	    int totalCount = 0;		// 단지수 구하기 
	    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();	// 오름차순으로 데이터 담기  
	    
	    for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(!visited[i][j] && arr[i][j] == 1) {
					count++;
					bfs(i, j, arr);
					pq.add(count);
					count = 0;
					totalCount++;
				}
			}
		}
	    System.out.println(totalCount);
	    while(!pq.isEmpty()) {
	    	int num = pq.poll();
	    	System.out.println(num);
	    }
		
	}
	 
	public static void bfs(int n, int m, int[][] arr) {
		visited[n][m] = true;
		for (int i = 0; i < dx.length; i++) {
			int nextX = n + dx[i];
			int nextY = m + dy[i];
			if(nextX >= arr.length || nextX < 0 || nextY >= arr.length || nextY < 0) continue;
			if(!visited[nextX][nextY] && arr[nextX][nextY] == 1) {
				count++;
				bfs(nextX, nextY, arr);
			}
		}
	}

}


