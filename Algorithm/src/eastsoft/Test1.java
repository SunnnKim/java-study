package eastsoft;
import java.util.HashMap;

import java.util.Iterator;

import java.util.Map;

 


public class Test1 {

	public static void main(String[] args) {

		int[] numArr = {3, 8, 2, 3, 3, 2};

		FindNumber f = new FindNumber(numArr);

		int num  = f.getLargestNum();

		System.out.println(num);

	}

}

class FindNumber{

	

	int numArr[];

	Map<Integer, Integer> numberCount;

	

	public FindNumber(int[] numArr) {

		this.numArr = numArr;

		numberCount = new HashMap<Integer, Integer>();

		countNumber();

	}

	

	public void countNumber() {

		for(int i = 0; i<numArr.length; i++) {

			if(numberCount.containsKey(numArr[i])) {

				int count = numberCount.get(numArr[i]);

				numberCount.put(numArr[i], ++count);

			}else {

				numberCount.put(numArr[i], 1);

			}

		}

	}

	public int getLargestNum() {

		int max = 0;

		Iterator<Integer> i = numberCount.keySet().iterator();

		while(i.hasNext()) {

			Integer number = i.next();

			if( number == numberCount.get(number)) {

				max = number;

			}

		}

		return max; 

	}

	

}