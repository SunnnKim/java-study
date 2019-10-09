/**


    *
   ***
  *****
 *******
*********


 */


package quest.assignment3.star;

public class Exam06 {
	public static void main(String[] args) {
	
		
		for(int i=0;i<5;i++) {
			for(int j=5;j>0;j--) {
				if(i<j-1)System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println("");
		}
	}
}
