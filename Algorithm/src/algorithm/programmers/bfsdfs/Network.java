package algorithm.programmers.bfsdfs;

public class Network {
	public static void main(String[] args) {
		Solution s = new Solution();
		
		int[][] computers = {
			{1,1,0},
			{1,1,1},
			{0,1,1}
		};
		System.out.println(s.solution(3, computers));
	}
}
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[computers.length];
        
        // Node visit information initialization
        for(int i = 0; i < computers.length; i++){
            visited[i] = false;
        }
        
        for(int i = 0; i < computers.length; i++){
            if(visited[i] == false){
                answer++;
                dfs(i, visited, computers);
            }            
        }
        
        return answer;
    }
    
    public void dfs(int node, boolean[] visited, int[][] computers){
        visited[node] = true;
        
        for(int i = 0; i < computers.length; i++){
            if(visited[i] == false && computers[node][i] == 1){
                dfs(i, visited, computers);
            }
        }
    }
}
