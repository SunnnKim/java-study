package algorithm.programmers.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {

	public static void main(String[] args) {
		int[] a = {7,4,5,6};
		Bridge br  = new Bridge();
		int b = br.process(2,10,a);
		System.out.println(b);
		
	}
	
}
class Bridge{
	
	public int process(int length, int weight, int[] truck_weights) {
		
		int second = 0;
		int currentWeight = 0;
		
		// 대기중인 리스트에 넣기 
		for (int n : truck_weights) {
			waitBridge.offer(new Node(n));
		}
		
		// 진행중이거나 대기중인 버스가 있는 경우 
		while(!onBridge.isEmpty() || !waitBridge.isEmpty()) {
			second++;
			
			// 진행중인 버스가 없는 경우 
			if( onBridge.isEmpty()) {
				Node node = waitBridge.poll();
				currentWeight += node.weight;
				onBridge.offer(node);
				continue;
			}
			
			// 버스 이동하기
			for(Node n : onBridge) {
				n.moving();
			}
			
			// 다리 다 지나간 경우 
			if(onBridge.peek().moves > length) {
				Node node = onBridge.poll();
				currentWeight -= node.weight;
			}
			
			// 다음버스 출발가능한경우 
			if( !waitBridge.isEmpty() && waitBridge.peek().weight + currentWeight <= weight) {
				Node node = waitBridge.poll();
				currentWeight += node.weight;
				onBridge.offer(node);
			}
			
		}
		
		return second;
	}
	
	Queue<Node> onBridge = new LinkedList<Node>();
	Queue<Node> waitBridge = new LinkedList<Node>();
	
	//트럭의 정보를 담은 클래스 
	class Node{
		int moves;
		int weight;
		
		public Node(int weight) {
			this.moves = 1;
			this.weight = weight;
		}
		public void moving() {
			this.moves++;
		}
	}
}
