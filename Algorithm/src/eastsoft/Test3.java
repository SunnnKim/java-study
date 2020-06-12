package eastsoft;

public class Test3 {

	public static void main(String[] args) {

		int[] arr = {3,4,5,3,7};

		Garden g = new Garden(arr);

	}

}

 

class Garden{

 

	int[] trees;

	public Garden(int[] trees) {

		// TODO Auto-generated constructor stub

		this.trees = trees;

	}

	

	public void findPath(int index, int num) {

		int loop = 0;

		

		for (int i = 0; i < trees.length; i++) {

			int[] test = new int[trees.length-1];

			for (int j = 0; j < test.length; j++) {

				if( j != i ) {

					test[loop] = trees[j];

					loop++;

				}

			}

			//countPath(arr);

		}

	

	}

	public int countPath(int[] arr) {

		int count = 0;

		for (int i = 0; i < arr.length - 2; i++) {

			if(( arr[i] -  arr[i+1] > 0 && arr[i+1] -  arr[i+2] > 0 ) ||

				 (arr[i] -  arr[i+1] <= 0 && arr[i+1] -  arr[i+2] <= 0 ) ) {

				return 0;

			}else {

				

			}

		}

		for (int i = 0; i < arr.length - 1; i++) {

			if(arr[i] == arr[i+1]) {

				return 0;

			}

		}

		return count;

	}

}