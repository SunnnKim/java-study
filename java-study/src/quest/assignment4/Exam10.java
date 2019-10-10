package quest.assignment4;

public class Exam10 {
	public static void main(String[] args) {
		
		String[] subject = {"파이썬", "자바", "SQL"};
		int[][][] score = {
				{{90, 88, 44},
				{100, 77, 66}},
				
				{{95, 88, 44},
				{91, 77, 66}}
		};
		System.out.println("고슬링 학생의 성적");
		for(int i=0;i<score.length;i++) {		// 페이지
			
			System.out.println(1+i+ " 학년 성적");
			System.out.println("******************");
			
			for(int j=0;j<score[i].length;j++) {		//행
				System.out.println((j+1)+"학기 성적");
				
				for(int k=0;k<score[i][j].length;k++)	//열	
					System.out.print(subject[k]+"("+ score[i][j][k]+") ");
				System.out.println("");
			}
		System.out.println("-------------------");

		}

	};
	
	/*
	출력 형식>
	 고슬링 학생의 성적
	1 학년 성적
	******************
	1학기 성적
	파이썬(90) 자바(88) SQL(44) 
	2학기 성적
	파이썬(100) 자바(77) SQL(66) 
	-------------------
	2 학년 성적
	******************
	1학기 성적
	파이썬(95) 자바(88) SQL(44) 
	2학기 성적
	파이썬(91) 자바(77) SQL(66) 
	-------------------

	 조건: score 배열을 출력 형식에 나와있는 값으로 초기화할 것.
	 
	 
	 */
		
	
	
	}









