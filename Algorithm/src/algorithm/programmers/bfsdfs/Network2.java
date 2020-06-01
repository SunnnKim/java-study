package algorithm.programmers.bfsdfs;

public class Network2 {
	public static void main(String[] args) {
		Network1 s = new Network1();
		
		int[][] computers = {
			{1,1,0},
			{1,1,1},
			{0,1,1}
		};
		System.out.println(s.solution(3, computers));
	}
}
class Network1 {
    private int connection = 0;
    private boolean[] check;
	
	public int solution(int n, int[][] computers ) {
		
		check = new boolean[n];
		// 체크용 boolean array initialize
		for(int i = 0; i < n ; i ++ ) check[i] = false;
		// dfs : 행별로 검사 시작
		for(int i = 0 ; i < n; i++ ) {
			if(!check[i]) {
				dfs(i, 0, computers );
			}
		}
		
		
		return connection;
	}
	
	public void dfs(int row, int column, int[][] arr ) {
		// 행 검사 시작
		check[row] = true;
		for( int i = column; i < arr.length; i++ ) {
			if( arr[row][column] == 1 && check[column] == false) {
			
			}else {
			
			}
		}
	}
	
	
}
