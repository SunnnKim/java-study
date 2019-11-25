package quest.assignment7.queueLinkedList;

import java.util.ArrayList;

//Linked List로 구현한 큐
public class Queue {
	
	private Node head;
	private Node tail;
	private int dataSize =0;
	
	
	class Node{
		private Object data;	// 실제 데이터가 들어가는 변수 
		private Node next;	// 다음 노드를 가리키는 노드 
		
		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
		
		
	}
	
	
	public void addData(Object data) {
		
		//헤드 찾기
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
		}

		tail.next = newNode;
		tail = newNode;
		dataSize++;	
	}
	
	
	
	public Object getData() {
		if(dataSize == 0) {
			return null;
		}
		Node search = head;
		Object getData = search.data;
		head = head.next;
		search = null;
		dataSize --;
	
		return getData;
	}
	
	public void printQueue() {
		if(dataSize < 1) {
		System.out.println(" 데이터가 큐에 없습니다.");
		return;
		}
		for (int i = 0; i < dataSize; i++) {
			System.out.print(printOne(i)+ " ");
		}System.out.println();
			
		}
	
	
	public Object printOne(int index) {
		
		
		Node search = head;
		Object getData = search.data;
		for (int i = 0; i <= index; i++) {
			getData = search.data;
			search = search.next;
		}
		return getData;
	}
	
	
	
	
	
	
	
	
}
