package eastsoft;
import java.util.ArrayList;

import java.util.HashMap;

import java.util.Iterator;

import java.util.Map;

 

/*

 주어진 숫자 배열에서 두자리 숫자의 각 합이 같은 배열의 요소들을 구하고 그들의 합을 구하라

 예 

 [17, 71, 51, 42] --> 93 (여러개일 경우 제일 큰 수)

 없으면 -1 리턴

 */

public class Test2 {

	public static void main(String[] args) {

		int[] arr = {51, 32, 43};

		PairNumber p = new PairNumber(arr);

		int num = p.findPair();

		System.out.println(num);

	}

}

class PairNumber{

	int[] numbers;

	Map<Integer, Integer> map;

	Map<Integer, ArrayList<Integer>> list;

	

	public PairNumber(int [] numbers) {

		this.numbers = numbers;

		map = new HashMap<Integer, Integer>();

		list = new HashMap<Integer, ArrayList<Integer>>();

	}

	

	public int findPair() {

		int first;

		int second;

		boolean check = false;

		for(int n : numbers) {

			first = n  / 10;

			second = n % 10;

			if(map.containsKey(first+second)) {

				ArrayList<Integer> l = list.get(first+second);

				if(l.size() < 2) {

					l.add(n);

					int number = map.get(first+second) + n;

					map.replace((first+second), number);

					list.replace(first+second, l);

				}else {

					l = compare(l, n);

					list.replace(first+second, l);

				}

				check = true;

			}else {

				map.put((first+second), n);

				ArrayList<Integer> l = new ArrayList<Integer>();

				l.add(n);

				list.put(first+second, l);

				

			}

			

		}

		if(!check) return -1;

		else return getLargestSum();

	}

	public ArrayList<Integer> compare(ArrayList<Integer> list, int num) {

		list.sort(null);

		for(int i =0 ; i< list.size(); i++ ) {

			if(num > list.get(i)) {

				list.remove(i);

				list.add(num);

				

			}

		}

		return list;

	}

	

	public int getLargestSum() {

		int max = 0;

		Iterator<Integer> it = list.keySet().iterator();

		while(it.hasNext()){

			int key = it.next();

			ArrayList<Integer> l = list.get(key);

			int sum = 0;

			for(int n : l) {

				sum += n;

			}

			if(max < sum) max = sum;

		}

		return max;

	}

}

	