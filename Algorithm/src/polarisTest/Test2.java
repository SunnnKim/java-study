package polarisTest;

public class Test2 {

	public static void main(String[] args) {

		Solution2 s = new Solution2();
		s.calculate(9, 2, 3, 1);
	}
}

class Solution2{
	int count = 0;
	int sum = 0;
	public boolean dividable(int number, int divide) {
		if(number % divide == 0) return true; 
		return false;
	}

	
	public int calculate(int n, int k, int a, int b) {
		while( n != 1 ) {
			if(dividable(n,k)) {
				sum += a;
				n = divide(n, k);
			}
			sum += b;
			n = substract(n);
			System.out.println(n);
			System.out.println(sum);
		}

		return count;

	}

	public int substract(int number) {

		if(true) {

			

		}

		return number - 1;

	}

	public int divide(int number, int d) {

		return number / d;

	}

}

/*

 

 문제 설명

입력으로 4개의 정수가 주어진다. (N, K, A, B)

초기 숫자 N에 대하여 빼기 1을 하거나 나누기 K 를 취하여 숫자를 줄여나간다.

즉 연산은 두가지가 존재한다.

 

연산a: 빼기 1은 항상 가능하다. 즉 N = N - 1;

연산b: K로 나누어 떨어지는 경우에만 나눗셈이 가능하다. 이경우 N = N / K 가 된다.

 

-1 연산을 한번 수행하는데 드는 비용은 A 이다.

나누기 연산을 한번 수행하는데 드는 비용은 B 이다.

 

초기 숫자 N을 연산들을 통해 1로 만들기 위한 최소 비용은 어떻게 되는가?

 

제한사항

N 에 대한 제약사항은 다음과 같다.

1 <= N <= 2,000,000,000

K 에 대한 제약사항은 다음과 같다.

1 <= K <= 2,000,000,000

A 에 대한 제약사항은 다음과 같다.

1 <= A <= 2,000,000,000

B 에 대한 제약사항은 다음과 같다.

1 <= B <= 2,000,000,000

 

 

입력 출력 예

example1

input)

N = 9, K = 2, A = 3, B = 1

 

output)

answer = 6

 

해설

초기 숫자 9에 대하여 1로 만들기 위한 최적의 전략은 다음과 같다.

빼기 1 을 수행한다. 9 -> 8: 비용 3

나누기 2 를 수행한다. 8 -> 4: 비용 1

나누기 2 를 수행한다. 4 -> 2: 비용 1

나누기 2 를 수행한다. 2 -> 1: 비용 1

총 비용은 6이 된다.

 

example2

input)

N = 5, K = 5, A = 2, B = 20

 

output)

8

 

해설:

초기 숫자 5에 대하여 1로 만들기 위한 최적의 전략은 빼기 1 을 4회 수행하는 것이 된다. 이때의 비용은 4 * 2 = 8이 된다.

참고로 초기 숫자를 5로 나누어 1로 만들려면 비용이 20 이 들기에 답이 될수 없다.

 

example3

input)

N = 19, K = 3, A = 4, B = 2

 

output)

12

 

해설:

19 -> 18: 비용 4

18 -> 6: 비용 2

6 -> 2: 비용 2

2 -> 1: 비용 4

총 비용은 12가 된다.

 */