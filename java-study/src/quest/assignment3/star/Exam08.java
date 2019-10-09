/**


    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *


 */

package quest.assignment3.star;

public class Exam08 {
	public static void main(String[] args) {

		for(int i=1;i<=9;i++) { //행
			if(i<5) {
			for(int j=5;j>i;j--) System.out.print(" ");
			for(int k=0;k<2*i-1;k++) System.out.print("*");
			System.out.println("");
			}
			else {
		
			for(int j=5;j<i;j++) System.out.print(" ");
			for(int k=9;k>=2*i-9;k--) System.out.print("*");
			System.out.println("");
		 }
		}
	}
}

