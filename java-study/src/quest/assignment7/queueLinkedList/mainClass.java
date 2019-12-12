package quest.assignment7.queueLinkedList;

import java.util.Scanner;

import quest.assignment7.queueLinkedList.Queue.Node;

public class mainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Queue list = new Queue();
		while(true) {
			System.out.println("1.입력");
			System.out.println("2.꺼내기");
			System.out.println("3.전체 데이터보기");
			System.out.println("0.종료 ");
			System.out.print(">> ");
			try {
				choice = sc.nextInt();
				sc.nextLine();
				
			} catch (Exception e) {
				choice = -1;
				sc = new Scanner(System.in);
			}
			
			if(choice == 1) {
				System.out.print("넣을 데이터 : ");
				String a = sc.next();
				list.addData(a);
				System.out.println("추가되었습니다.");
			}else if (choice == 2) {
				Object data = list.getData();
				if( data != null) {
				System.out.println("큐에서 꺼낸 값 : ");
				System.out.println(data);
				}
				else System.out.println("꺼낼 데이터가 없습니다.");
			}else if (choice == 3) {
				System.out.println("전체 큐 보기 ");
				list.printQueue();
			}else if(choice == 0) {
				System.out.println("종료합니다.");
				break;
				
			}else {
				System.out.println("wrong access");
			}
			
		}
		
		
		
		
	}

}
