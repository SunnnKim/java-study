package quest.assignment5.RockScissorPaper;
import java.util.*;

public class GameTest {

	public static void main(String[] args) {
		
		int inputNum;
		int total=0;
		String input = "";
		ScissorsRockPaper srp = new ScissorsRockPaper();
		Dice d = new Dice();

	while(true) {
		
		System.out.println("게임을 선택하세요");
		System.out.println("A. 가위바위보\nB. 주사위 값 맞추기\nC. 종료");
		Scanner sc = new Scanner(System.in);
		while (true) {
			input = sc.nextLine();
			if(input.equals("A") || input.equals("B") || input.equals("C")) {
				break;
			}else System.out.println("다시 입력하세요.");
		}
		
		//가위바위보 게임
		if(input.equals("A")) {
			System.out.println("가위바위보 게임입니다.");
			System.out.println("가위바위보중 하나를 선택하세요.");
			System.out.println("(1.가위, 2.바위, 3.보)");		
		
			while (true) {
				try {
				inputNum = Integer.parseInt(sc.nextLine());
				if( inputNum == 1 || inputNum == 2 || inputNum == 3 ) break;
				else throw new Exception();
				}catch(Exception e ) {
					System.out.println("다시 입력하세요.");}
			}
		total += srp.startGame(inputNum);
	}
		
		
		
		//주사위 게임		
		else if(input.equals("B")) {
			
			System.out.println("주사위 값 맞추기 게임입니다.");
			System.out.println("주사위를 선택하세요(1~6값 중 하나)");
		
			while (true) {
				try {
				inputNum = Integer.parseInt(sc.nextLine());
				if( inputNum == 1 || inputNum == 2 || inputNum == 3 || inputNum == 4 || inputNum == 5 || inputNum == 6) break;
				else throw new Exception();
				}catch(Exception e ) {
					System.out.println("다시 입력하세요.");}
			}
		total += d.startGame(inputNum);
	}
		
		//종료하기
		else{

			System.out.println("게임을 종료합니다.");
			System.out.println("당신의 total score은 " + total + 	"입니다");
			break; // 첫 while문 종료
		}}
	
	}
}

