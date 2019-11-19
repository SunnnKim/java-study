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
	
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0; 
		//우리가 찾고자하는 위치의 정보
		while(temp.data != data) {
			//현재 temp에 저장된 데이터와 우리가 찾는 data값이 다르면
			//while문 실
			temp = temp.next;
			index++;
			if(temp == null) { // temp가 tail 인 경우
				return -1;
			}
		}
		
		return index;
	}
	
	public ListIterator listIterator() {
		
		return new ListIterator();
	}
	
	
	// Iterator
	// 리스트 구조의 컬렉션에서 데이터 순차검색하는 반복자
	// 리스트의 내부 데이터를 가리키는 클래스인 ListIterator
	// 비유하자면 
	// 책을 보관하는 책장 = Collection
	// 책 = 컬렉션 안에 들어갈 객체
	// 책을 정리하는 도서관 사서 = Iterator
	// 단, 사서(이터레이터)는 단순하여 한번에 한 권밖에 가져오지 못한다.
	public class ListIterator{
		private Node next;
		private Node lastReturned;
		private int nextIndex;
		
		//생성자는 next 변수가 head를 향하도록 한다.
		public ListIterator() {
			next = head;
		}
		
		//현재 가리키는 노드를 리턴하고 다음 노드를 next에 넣어둠
		public Object next() {
			lastReturned = next;
			this.next = next.next;
			nextIndex++;	//hasNext 같은 메소드를 실행하기 위해 정의 및 증가 
			
			return lastReturned.data;
		}
		
		public boolean hasNext() {
			return nextIndex < size;
		}
		
		// 위의 링크드리스트는 단방향으로 연결되어있는 단순 연결리스트
		// 이전 노드를 확인하거나 역순으로 데이터를 조회하는 것은 불가능함.
		// previous 를 하기 위해서는 이전 노드를 알 수있는 정보가 필요함
		// doubly linked list는 양방향으로 연결된 링크드리스트 
		// 앞으로 갈 수 있고 뒤로 갈 수 있으나,
		// next 변수는 데이터 메모리를 추가적으로 사용하기 떄문에
		// 공간 효율성, 즉 메모리 효율성이 떨어짐(메모리를 더 사용함)
		
		
		
		
	}

}
