package kakaotest;
import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.ArrayList;

import java.util.List;

 

 

public class Test3 {

 

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		int num = Integer.parseInt(input.split(" ")[0]);

		int length = Integer.parseInt(input.split(" ")[1]);

		Snack snack = new Snack(num, length);

		

		for (int i = 0; i < num; i++) {

			String str = br.readLine();

			snack.getInfo(str);

		}

		System.out.printf("%.2f", snack.process());

	}

	

 

}

 

class Snack{

	List<Double> total;

	int length;

	double sum = 0;

	double pointNumber = 0;

	

	public Snack(int number, int length) {

		// TODO Auto-generated constructor stub

		total = new ArrayList<Double>();

		this.length = length;

	}

	

	public void getInfo(String str) {

		double len = Double.parseDouble(str);

		sum += len;

		total.add(len);

	}

	public double process() {

		pointNumber = sum/length;

		for (int i = 0; i < total.size(); i++) {

			if(total.get(i) < pointNumber / 2.0 ) {	// 만약 기준 값이 포인트넘버/2 보다 작은경우 

				pointNumber = total.get(i);

			}

			else {

				

			}

		}

		

		

		return sum/length;

	}

}

/*

 2 3

6.3

4.3

 

-> 3.15

 

18 300

51.28

96.87

96.86

48.63

87.83

51.29

56.72

38.05

3.88

79.40

33.43

30.75

13.12

67.80

20.15

96.71

95.93

10.91

 

->3.20

*/