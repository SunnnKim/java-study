package coTest;
import java.util.Stack;

public class Test2 {
	    static int[] dx = { 1, 1, 1, 0, 0, -1, -1, -1 }; // 2 -> 2번 , 1->2번, -1 ->2번, -2 -> 2번
	    static int[] dy = { 0, 1, -1, 1, -1, -1, 0, 1 };
	    public static void main(String args[]) throws Exception {
	        int [][] map = {
	                {0, 0, 0, 0, 0, 0, 0, 0},
	                {0, 0, 0, 0, 0, 0, 0, 0},
	                {0, 0, 0, 1, 1, 0, 0, 0},
	                {0, 0, 0, 1, 0, 0, 0, 0},
	                {0, 0, 1, 1, 2, 0, 0, 0},
	                {0, 0, 2, 2, 2, 0, 0, 0},
	                {0, 0, 0, 0, 2, 1, 0, 0},
	                {0, 0, 0, 0, 0, 0, 0, 0}
	        };
	        BFS(map, 8, 8);
	    }

	    public static void BFS(int[][] arr, int N, int M) {
	        Stack<Node> stack = new Stack<>();

	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < M; j++) {
	                if (arr[i][j] == 1)
	                    stack.push(new Node(i, j));
	            }
	        }
	        int count = 0;
	        int maxCount = 0;
	        while (!stack.isEmpty()) {
	            Node node = stack.pop();
	            int [] dir = new int[2];

	            if (node.dir[0] != -3 && node.dir[1] != -3) {
	                int nextX = node.x + dir[0];
	                int nextY = node.y + dir[1];
	                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
	                    count = 0;
	                    continue;
	                }
	                if (arr[nextX][nextY] == 2) {
	                    stack.push(new Node(nextX, nextY, dir));
	                    count++;
	                    continue;
	                } else if (arr[nextX][nextY] == 1) {
	                    System.out.println("count: " + count);
	                    maxCount = count > maxCount ? count : maxCount;
	                }
	            } else {
	                for (int i = 0; i < 8; i++) {
	                    int nextX = node.x + dx[i];
	                    int nextY = node.y + dy[i];
	                    if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
	                        continue;
	                    }
	                    if (arr[nextX][nextY] == 1) {
	                        continue;
	                    }
	                    arr[nextX][nextY] = arr[node.x][node.y];
	                    stack.push(new Node(nextX, nextY, dir));
	                    dir[0] = dx[i];
	                    dir[1] = dy[i];
	                    count = arr[node.x][node.y] + 1;
	                }
	            }
	        }
//	        int max = 0;
//	        for (int i = 0; i < N; i++) {
//	            for (int j = 0; j < M; j++) {
//	                if (arr[i][j] == 0) {
//	                    System.out.println(-1);
//	                    return;
//	                }
//	                max = Math.max(max, arr[i][j]);
//	            }
//	        }
//	        System.out.println(max - 1);
	        System.out.println("maxCount: " + maxCount);
	    }
	}
	class Node{
	    public Node(int x, int y){
	        this.x = x;
	        this.y = y;
	        this.dir = new int[2];
	        this.dir[0] = -3;
	        this.dir[1] = -3;
	    }
	    public Node(int x, int y, int dir[]){
	        this.x = x;
	        this.y = y;
	        this.dir = dir;
	    }
	    int x, y, dir[];
	}