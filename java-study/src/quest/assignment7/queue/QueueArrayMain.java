package quest.assignment7.queue;

import java.util.Scanner;

public class QueueArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		QueueArray arr = new QueueArray(5);
		int choice;
	// 루프 	
	while(true) {
		System.out.println("---------------");
		System.out.println("1. 입력");
		System.out.println("2. 꺼내기");
		System.out.println("3. 전체 데이터 확인");
		System.out.println("0. 종료");
		System.out.print(">> ");
		try {
			choice = sc.nextInt();
		} catch (Exception e) {
			choice = -1;
			sc = new Scanner(System.in);
		}
		
		
		
		if(choice == 1) {
			//입력
			System.out.println("< 데이터 추가 >");
			System.out.println("데이터를 입력하세요 : ");
			System.out.print(">> ");
			String strData = sc.next();
			int strCount = 0;
			boolean check;
			for (int i = 0; i < strData.length(); i++) {
				int temp = strData.charAt(i);
				if(temp < 48 || temp > 57){
					strCount++;
				}
			}
			if(strCount >0) { 	// 데이터에 문자가 포함되면 String으로 저장
				check = arr.add(strData);
			}else {
				check = arr.add(Integer.parseInt(strData));
			}
			if(!check) System.out.println("데이터를 넣을 공간이 없습니다.");
			
		}else if(choice == 2) {
			// 꺼내기
			System.out.println("< 데이터 꺼내기 >");
			Object getData = arr.getData();
			if (getData == null) {
				System.out.println("꺼낼 데이터가 없습니다. 데이터를 추가하세요.");
			}else {
				System.out.println("꺼낸 데이터 : " + getData);
				System.out.println("남은 데이터 : "+arr.getDataSize()+"개");
			}
			
		}else if(choice == 3) {
			// 전체 데이터 확인
			System.out.println("< 현재 데이터 확인 >");
			System.out.println(arr.printArr());
		
		}else if(choice == 0) {
			System.out.println("종료합니다.");
			break;
		}else {
			System.out.println("잘못입력했습니다.");
		}
		}		
	}

}
