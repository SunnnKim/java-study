package algorithm.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 문제
이번 가을학기에 '문제 해결' 강의를 신청한 학생들은 텀 프로젝트를 수행해야 한다. 
프로젝트 팀원 수에는 제한이 없다. 
심지어 모든 학생들이 동일한 팀의 팀원인 경우와 같이 한 팀만 있을 수도 있다.
프로젝트 팀을 구성하기 위해, 모든 학생들은 프로젝트를 함께하고 싶은 학생을 선택해야 한다. 
(단, 단 한 명만 선택할 수 있다.) 
혼자 하고 싶어하는 학생은 자기 자신을 선택하는 것도 가능하다.

학생들이(s1, s2, ..., sr)이라 할 때, r=1이고 s1이 s1을 선택하는 경우나,
s1이 s2를 선택하고, s2가 s3를 선택하고,..., sr-1이 sr을 선택하고, 
sr이 s1을 선택하는 경우에만 한 팀이 될 수 있다.

예를 들어, 한 반에 7명의 학생이 있다고 하자. 학생들을 1번부터 7번으로 표현할 때, 선택의 결과는 다음과 같다.

1	2	3	4	5	6	7
3	1	3	7	3	4	6
위의 결과를 통해 (3)과 (4, 7, 6)이 팀을 이룰 수 있다. 
1, 2, 5는 어느 팀에도 속하지 않는다.

주어진 선택의 결과를 보고 어느 프로젝트 팀에도 속하지 않는 학생들의 수를 계산하는 프로그램을 작성하라.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
각 테스트 케이스의 첫 줄에는 학생의 수가 정수 n (2 ≤ n ≤ 100,000)으로 주어진다. 
각 테스트 케이스의 둘째 줄에는 선택된 학생들의 번호가 주어진다. 
(모든 학생들은 1부터 n까지 번호가 부여된다.)

출력
각 테스트 케이스마다 한 줄에 출력하고, 각 줄에는 프로젝트 팀에 속하지 못한 학생들의 수를 나타내면 된다.

예제 입력 1 
2
7
3 1 3 7 3 4 6
8
1 2 3 4 5 6 7 8
예제 출력 1 
3
0
 */
public class Q9466 {
	static boolean visited[];
	static boolean finished[];
	static int[] arr;
	static int count = 0;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String result = "";
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			arr = new int[N+1];
			visited = new boolean[N+1];
			finished = new boolean[N+1];
			String[] str = br.readLine().split(" ");
			for (int j = 1; j < str.length; j++) {
				arr[j] = Integer.parseInt(str[j]);
				visited[j] = false;
			}
			for (int j = 1; j < str.length; j++) {
				DFS(j);
				result += count;
				System.out.println(result);
				count = 0;
			}
		}
		System.out.println(result);
		
	}
	
	public static void DFS(int now) {
		if(visited[now]) return;	// 방문한 노드인 경우 리턴 
	
		// 방문하지 않은 노드 
		visited[now] = true;
		int next = arr[now];
		
		if( !visited[next] ) {	// 다음 노드가 방문하지 않은 경우 
			DFS(next);
		}else {	// 방문한 경우 = 사이클이 끝났을 때
			if( !finished[now] ) {	// 완료표시가 안된경우  
				count++;
				for (int i = next; i != now; i = arr[next]) {
					count++;
				}
			}
		}
		 // 모든 작업이 끝나서 더이상 사용하지 않음
        finished[now] = true;
	}
}
