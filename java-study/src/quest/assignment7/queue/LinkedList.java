package quest.assignment7.queue;

public class LinkedList {

	private Node head;
	private Node tail;
	private int size = 0;
	
	// 링크드리스트 : 데이터 + 다음 노드를 가리키는 노드 
	// head : Linked List의 첫번째 노드 
	// tail : Linked List의 마지막 노드 
	// visualgo.net : 자료구조를 시각화하여 보여줌 
	// 링크드리스트에 들어가 있는 각각의 객체(노드/버택스/엘리멘트)를 생성하기 위해
	// 이너 클래스를 만들기
	private class Node {
		// 노드는 데이터를 저장하고 다음 노드가 누구인지에 대한 정보를 저장해야한다.
		private Object data;
		private Node next;

		// 생성자로 노드 객체를 초기화하기
		// input은 노드가 처음 생성됐을 때의 값이 생성자의 매개변수를 통해 전달됨
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
		// 리스트에서 어떤 데이터를 탐색하고 싶으면
		// 해당 리스트의 첫번째 데이터를 가지고 와야함. (=head)
		Node x = head; // 첫번째 엘리먼트 = head
//		x = x.next; 
		// 위의 코드를 찾고싶은 인덱스만큼 반복해서 위치를 찾아가면 됨.
		for (int i = 0; i < index; i++)
			x = x.next;
		return x;
	}

	
	// add 메소드 : 원하는 특정위치에 값을 끼워넣는 메소드 (해당 인덱스의 값은 뒤로 밀림)
	// 데이터를 중간에 끼워넣기 위해서는 넣고자하는 위치의 노드와 그 노드의 바로 전 위치에 있는 노드를 
	// temp 변수에 저장하여 새로운 노드를 끼워넣고 vertex를 재설정한다.
	public void add(int k, Object input) {

		// 0일 떄의 값
		if (k == 0) {
			addFirst(input);
		} else {
			Node temp1 = node(k - 1);
			Node temp2 = temp1.next;
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
			//
			if(newNode.next == null) tail = newNode;
		}
		
	
	}
	// 가장 첫 노드(head)를 삭제하는 removeFirst 메소드 
	// 자바의 Collections Framework 는 
	// remove(삭제)된 노드가 가지고 있던 값을 리턴 하도록 되어있다.
	
	public Object removeFirst() {
		
		//삭제할 head의 값을 temp 에 넣어주고 
		//head의 다음 노드를 head 로 다시 지정해준다.
		Node temp = head;
		head = head.next;
		
		//자바 컬렉션프레임워크의 규칙에 따라
		//삭제할 노드의 데이터는 다른 변수를 만들어 그곳에 담아준다.
		//전체 노드의 사이즈는 -1
		//temp에 담긴 이전의 head 값은 null로 지정해주면 자동으로 객체가 사라진다.
		
		Object returnData = temp.data;
		temp = null;
		size --;
		return returnData;
	}
	
	//toString Overriding
	public String toString() {
		
		if(head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		//리스트가 2개 이상의 엘리먼트가 있을때 동작함 
		while (temp.next != null) {
			str += temp.data + ",";
			temp = temp.next;
		}
		//마지막 노드는 따로 추가해준다.
		str += temp.data;

		return str + "]";
	}

	public Object remove(int k) {

		//첫 번째 데이터를 삭제하는 경우 removeFirst 사용 
		if(k == 0) {
			return removeFirst();
		}
		
		Node temp = node(k-1);
		Node toDoDeleted = temp.next;
		temp.next = temp.next.next;
		Object returnData = toDoDeleted.data;
		if(toDoDeleted == tail)
			tail = temp;
		toDoDeleted = null;
		size --;
		
		return returnData;
	}
	
	// 제일 끝 값을 삭제하는 메소드 	
	public Object removeLast() {
		// tail의 index = size - 1
		// 링크드리스트에서는 지우려는 노드만 알아서는 안되고
		// 반드시 이전 노드의 next 값을 지워야만 삭제된 효과가 있기 때문에
		// 노드들의 링크를 타고 가야한다.
		// 노드가 많을수록 타고 가야하는 수가 늘기 때문에 작업 속도가 느려진다.
		// ArrayList는 내부에 배열과 인덱스 값을 가지고 있기 때문에 빠른 접근이 가능하다.
		
		return remove(size-1);
	}
	
	// Linked List의 사이즈를 알아내는 메소드
	public int size() {
		return size;
	}
	
	//get 메소드 :  특정 위치의 노드의 값을 가져오는 메소드 
	public Object get(int k) {
		
		Node temp = node(k);
		return 	temp.data ;
	}
	
	
	
	

}
