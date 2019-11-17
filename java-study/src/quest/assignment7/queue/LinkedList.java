package quest.assignment7.queue;

public class LinkedList {

	private Node head;
	private Node tail;
	private int size = 0;

	// 링크드리스트에 들어가 있는 각각의 객체(노드/버택스/엘리멘트)를 생성하기 위해
	// 이너 클래스를 만들기
	private class Node {
		// 노드는 데이터를 저장하고 다음 노드가 누구인지에 대한 정보를 저장해야한다.
		private Object data;
		private Node next;

		// 생성자로 노드 객체를 초기화하기
		// input은 노드가 처음 생성됐을 때의 값이 생성자의 매개변수를 통해 전달됨]
		public Node(Object input) {
			this.data = input;
			// 생성자가 만들어져도 다음 객체는 아직 알 수 없기 때문에 null 값
			this.next = null;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}

	// 앞에서부터 저장하는 LinkedList 클래스의 addFirst 메소드
	public void addFirst(Object input) {
		// 새로운 노드를 만들고 input 값을 넣어 newNode의 생성자 초기화
		// newNode.data = 30
		// newNode.next = null
		Node newNode = new Node(input);
		newNode.next = head;
		size++;
		head = newNode;
		if (newNode.next == null) {
			tail = newNode;
		}

	}

	public void addLast(Object input) {
		Node newNode = new Node(input);

		// 만약 사이즈가 0인 링크드 리스트라면
		// 굳이 처음 데이터를 넣는 코드를 짜지 않아도
		// addfirst를 통해서 데이터를 집어 넣으면 코드 중복가능성이 줄어든다
		if (size == 0) {
			addFirst(input);
		}
		// 사이즈가 0보다 큼 = 첫번째로 넣는 데이터가 아님
		else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	Node node(int index) {
		//리스트에서 어떤 데이터를 탐색하고 싶으면 
		//해당 리스트의 첫번째 데이터를 가지고 와야함. (=head)
		Node x = head;	//첫번째 엘리먼트 = head	
//		x = x.next; 
		//위의 코드를 찾고싶은 인덱스만큼 반복해서 위치를 찾아가면 됨. 
		for(int i = 0; i < index ; i++)
			x = x.next; 
		return x;
	}

}
