package dataStructure.boj;

import java.util.Scanner;

/*
 
 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여섯 가지이다.

push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
입력
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 
주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

출력
출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 
 */

public class Queue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] order = new String[n];
		for(int i = 0; i < n; i++ ) {
			order[i] = sc.nextLine();
		}
		// Queue Instance
		QueueTest queue = new QueueTest();
		for(String str : order) {
			switch(str.split(" ")[0]) {
				case "push":
					queue.push(Integer.parseInt(str.split(" ")[1]));
					break;
				case "pop":
					System.out.println(queue.pop());
					break;
				case "size":
					System.out.println(queue.size());
					break;
				case "empty":
					System.out.println(queue.empty());
					break;
				case "front":
					System.out.println(queue.front());
					break;
				case "back":
					System.out.println(queue.back());
					break;
			}
		}
		
		
	}
	
	
}
//
class QueueTest{
	
	Node firstNode;
	Node lastNode;
	
	class Node{
		Node next;
		int data;
		public Node(int data) {
			this.data = data;
		}
	}
	
	
	// Methods
	public void push(int obj) {
		// 노드가 하나도 없는 경우
		if(firstNode == null) {
			Node node = new Node(obj);
			firstNode = node;
			lastNode = node;
		}
		// 노드가 있는 경우
		else {
			Node node = new Node(obj);
			lastNode.next = node;
			lastNode = node;
		}
	}
	public int pop() {
		// 큐에 수가 없는 경우
		if(firstNode == null) return -1;
		// 큐에 수가 있는 경우
		else {
			Node temp = firstNode;
			firstNode = firstNode.next;
			return temp.data;
		}
	}
	
	
	public int size() {
		int count = 0;
		Node temp = firstNode;
		while( temp != null ) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	public int empty() {
		if(size() == 0 ) return 1;
		return 0;
	}
	public int front() {
		if(firstNode == null) return -1;
		return firstNode.data;
	}
	public int back() {
		if(lastNode == null) return -1;
		return lastNode.data;
	}
}