package algorithm.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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

	public static boolean visited[][];
    static int count = 0;
	
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int row = Integer.parseInt(str.split(" ")[0]);
		int col = Integer.parseInt(str.split(" ")[1]);
		
		int[][] arr = new int[row][col];
		visited = new boolean[row][col];
		
		for (int i = 0; i < row; i++) {
			str = br.readLine();
			String[] sarr = str.split(" ");
			for (int j = 0; j < col ; j++) {
				arr[i][j] = Integer.parseInt(sarr[j]);
				visited[i][j] = false;
			}
		}
		int max = 0;
		int total = 0;
		// solution
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(!visited[i][j] && arr[i][j] == 1 ) {
					total++;
					count++;
					bfs(i, j, arr);
					max = max > count? max : count;
					count = 0;
				}
			}
		}
		System.out.println(total);
		System.out.println(max);
	}
	public static void bfs(int n, int m, int[][] arr) {
		visited[n][m] = true;
		int[] dx = {1, -1, 0, 0};
	    int[] dy = {0, 0, 1, -1};
		for (int i = 0; i < dx.length; i++) {
			int nextX = n + dx[i];
			int nextY = m + dy[i];
			if(nextX >= arr.length || nextY >= arr[0].length || nextX < 0 || nextY < 0) continue;
			if(!visited[nextX][nextY] && arr[nextX][nextY] == 1) {
				count++;
				bfs(nextX, nextY, arr);
			}
		}
	}



}
