package quest.assignment7.queue;

public class LinkedListMain2 {
	
	public static void main(String[] args) {
		
		LinkedList numbers = new LinkedList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		LinkedList.ListIterator i = numbers.listIterator();
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println("has next node? : " +i.hasNext());
		
		//모든 데이터 순차적으로 조회
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
