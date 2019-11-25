package quest.assignment7.queueLinkedList;

import quest.assignment7.queueLinkedList.Queue.Node;

public class mainClass {

	public static void main(String[] args) {

		Queue list = new Queue();
		
		list.addData(1);
		list.addData(2);
		list.addData(3);
		list.addData(4);
		list.addData(2);
		list.addData(3);
		list.addData(4);
		list.addData(5);
		list.printQueue();
		System.out.println(list.getData());
		System.out.println(list.getData());
		System.out.println(list.getData());
		System.out.println("남은 큐 :");
		list.printQueue();
		System.out.println(list.getData());
		System.out.println(list.getData());
		System.out.println(list.getData());
		System.out.println("남은 큐 :");
		list.printQueue();
		System.out.println(list.getData());
		System.out.println(list.getData());
		System.out.println(list.getData());
		System.out.println(list.getData());
		
		
		
		
	}

}
