package algorithm.programmers.stackQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q3Develop {
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55}; 
		int[] speeds = {1, 30, 5};
		Develop d = new Develop(progresses, speeds);
		System.out.println(Arrays.toString(d.process()));
	}
}

// Queue 문제 
class Develop{
	Queue<Integer> progresses = new LinkedList<Integer>();
	Queue<Integer> results = new LinkedList<Integer>();
	int speeds[];
	
	public Develop(int[] progresses, int[] speeds) {
		this.speeds = speeds;
		for(int i = 0; i < progresses.length; i ++) {
			this.progresses.offer(progresses[i]);
		}
	}
	
	public int[] process() {
		int[] result;
		int loop = 1;
		int index = 0;
		int count = 0;
		
		while( !progresses.isEmpty()) {
			if( progresses.peek() + ( loop * speeds[index] ) >= 100) {
				progresses.poll();
				count++;
				index++;
			}else {
				if(count != 0) {
					results.offer(count);
					count = 0;
				}
				loop++;
			}
		}
		
		if(count != 0) results.offer(count);
		
		result = new int[results.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = results.poll();
		}
		
		return result;
	}
}

