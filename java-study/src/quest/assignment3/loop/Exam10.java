/**

10. 아래와 같이 출력되는 프로그램을 작성하시오. 

1 
12 
123 
1234 
12345 

 */
package quest.assignment3.loop;

public class Exam10 {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.println("");
		}
	}

	
}
