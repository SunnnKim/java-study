package quest.assignment7.queueLinkedList;

//Linked List로 구현한 큐
public class Queue {

	private Node head;
	private Node tail;
	private int dataSize = 0;

	class Node {
		private Object data; // 실제 데이터가 들어가는 변수
		private Node next; // 다음 노드를 가리키는 노드

		public Node(Object data) {
			this.data = data;
			this.next = null;
		}

	}

	/*
	 * head = newNode; if (newNode.next == null) { tail = newNode; }
	 * 
	 */
	public void addFirstData(Object data) {

		// 첫데이터 일 때
		Node newNode = new Node(data);
		head = newNode;
		tail = head;
		dataSize++;

	}

	public void addData(Object data) {
		Node newNode = new Node(data);
		if (dataSize == 0) {
			addFirstData(data);
		} else {
			// 헤드 다음 노드에 새로운 노드 추가
			Node temp = tail;
			temp.next = newNode;
			tail = newNode;
			dataSize++;
		}

	}

	// 데이터 꺼내기
	public Object getData() {
		
		if(dataSize == 0) {
			return null;
		}
		
		Node temp = head;
		head = head.next;
		Object getData = temp.data;
		temp = null;
		dataSize--;
		
		return getData;
	}

	public Node getQueueNode(int k) {

		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}

		return temp;
	}

	public void printQueue() {
		 
		if (dataSize <= 0) {
			System.out.println(" 데이터가 큐에 없습니다.");
			return;
		}
		for (int i = 0; i < dataSize; i++) {
			System.out.print(printOne(i) + " ");
		}
		System.out.println();

	}

	public Object printOne(int index) {
		 
		if (dataSize <= 0) {
			return null;
		}
		Node search = head;
		Object getData = search.data;
		for (int i = 0; i <= index; i++) {
			getData = search.data;
			search = search.next;
		}
		return getData;
	}

}
