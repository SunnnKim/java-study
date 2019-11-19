package quest.assignment7.queue;


public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedList numbers = new LinkedList();
		
		numbers.addFirst(20);
		numbers.addFirst(10);
		numbers.addLast(25);
		numbers.add(2, 178);
		numbers.add(2, 150);
		System.out.println(numbers);
		System.out.println("삭제된 값 : " +numbers.removeFirst());
		System.out.println(numbers);
		System.out.println("삭제된 값 : " +numbers.remove(1));
		System.out.println(numbers);
		System.out.println("삭제된 값 : " +numbers.removeLast());
		System.out.println(numbers);
		System.out.println("사이즈 : " + numbers.size());
		System.out.println(numbers);
		System.out.println("2번째 데이터 꺼내기 : " + numbers.get(2));

		numbers.addLast(30);
		numbers.addLast(20);
		numbers.addLast(10);
		
		System.out.println(numbers);
		System.out.println("30의 인덱스 : " + numbers.indexOf(30));
		
		
//		Scanner sc = new Scanner(System.in);
//		Queue<Integer> queue = new LinkedList<Integer>();
//		
//		int choice = -1;
//		while (choice != 0) {
//		System.out.println("--------");
//		System.out.println("1. 입력 ");
//		System.out.println("2. 꺼내기 ");
//		System.out.println("3. 전체 데이터 확인 ");
//		System.out.println("0. 종료  ");
//		System.out.println("--------");
//		System.out.print("메뉴: ");
//		choice = sc.nextInt();
//		System.out.println("");
//		String str = sc.nextLine();
//		}
//		SimpleDateFormat sdf= new SimpleDateFormat("hh");
//		sdf.format(Calendar.getInstance().getTime());
//	}
}


}
