/**


    *
   **
  ***
 ****
*****


 */

package quest.assignment3.star;

public class Exam04 {
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			for(int j=4;j>=0;j--) {
				if(i >= j) System.out.print("*");
				else System.out.print(" ");
			}System.out.println("");
		}
	}
}
