package quest.assignment7.queue;

public class Queue {
	private Node head;
	private Node tail;
	private int size = 0;
	
	// 현재 데이터와 다음 값을 가리킬 노드를 담은 클래스 만들기 
	class Node{
		private Object data;  // int 형의 데이터를 받을 예정
		private Node next = null;	// 다음 노드를 가리키는 next
		
		//initialization 생성자 
		public Node(Object input) {
			this.data = input;
 
		}
	}

	// 큐에 데이터를 집어넣는 큐 클래스의 메소드들
	
	public void add(Object i) {
		Node newNode = new Node(i);
		
		//헤드의 다음 노드에 newNode를 연결
		head.next = newNode;
		size++;
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		
		
		
		
		
	}
	
	

	
	
	
	
	
	
}
