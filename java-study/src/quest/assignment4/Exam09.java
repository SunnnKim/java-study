// 2차원 배열 사용하기 - 1번 과정
package quest.assignment4;

public class Exam09 {
	public static void main(String[] args) {
		// 고슬링
		// 파이썬, 자바, SQL 의 점수 관리..
		// 1학기 성적
		// 2학기 성적
		String[] subject = {"파이썬", "자바", "SQL"};
		// {{}, {}}
		int[][] score = {
				{95, 88, 44}, 
				{91, 77, 66}
		};
		
		System.out.println("고슬링 학생의 성적");
		System.out.println("***************");
		for(int i=0;i<score.length;i++) {
			System.out.println(1+i+ "학기 성적");
			for(int j=0; j<score[i].length;j++) {
				System.out.print(subject[j]+"("+score[i][j]+") ");
			}
			System.out.println("\n------------------------");
		}
		
		
	}
}








