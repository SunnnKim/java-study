package quest.assignment5.RockScissorPaper;
import java.util.*;



interface Game{
	Random r = new Random();	
	public abstract int startGame(int you);
}


//가위바위보
public class ScissorsRockPaper implements Game  {


	final static int Scissor = 1;
	final static int Rock = 2;	
	final static int Paper = 3;
	private int me;
	
	public int startGame(int you) {
			
		me = r.nextInt(3)+1;
		if( me == you ) {
			System.out.println("비겼습니다.");
			return 0;	
		}
		else {
			if((you == 1 && me == 3) || (you == 2 && me == 1) || (you == 3 && me == 2)) { //내가 지는 경우
				System.out.println("You lose");
				return 0;
			}
			else {
				System.out.println("You win");
				return 1;
	}}}}

//주사위 게임
class Dice implements Game{
	
	private int me;
	public int startGame(int you) {
	
		me = r.nextInt(6)+1;
		if(me == you) 	{
			System.out.println("You win");
			return 1;
		}else {
			System.out.println("You lose");
			return 0;
	}}}


