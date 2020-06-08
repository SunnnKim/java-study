package polarisTest;

/*

문제 설명

래리는 자신이 만든 프로그램의 수행값에 대해 데미안에게 아래 작업을 요청하였다.



데미안이 할일은 다음과 같다.

수행값인 N개의 정수형 숫자들을(array) 받았으며 이것들의 부분구간 중

엄격한 오름차순(strictly increasing)을 형성하는 가장 긴 구간의 길이를 래리에게 알려주어야 한다.

-strictly increasing: 뒤에 놓인 값이 앞에 놓인 값보다 무조건 커야 한다. 같으면 안된다



엄격한 오름차순을 형성하는 부분구간이 길수록 래리의 기분이 좋아진다.

데미안이 최대 하나의 숫자를 삭제해도 아무도 눈치를 못챈다.

그리고 데미안은 래리의 기분을 좋게 해주고자 한다.



주어진 정수형 숫자들의 부분 구간 중

엄격한 오름차순을 형성하는 가장 긴 구간의 길이를 구해보자. (배열에서 최대 하나의 숫자를 제거해도 된다.)



제한사항



N: 2 <= N <= 200,000



array: 1 <= array[i] <= 1,000,000,000 // i의 범위 (0 <= i <= N - 1)



입력 출력 예

example1

input)

5,[2,3,9,4,5]



output)

4



해설:

9를 제거하면 [2,3,4,5] 로 최대길이 4를 리턴한다.



example2

input)

2,[1,3]



output)

2



해설:

전체가 오름차순이라 2를 리턴한다.



example3

input)

7,[9,6,5,4,3,5,4]



output)

2



설명:

[array[3], array[4], array[5]] => [4, 3, 5] 로부터 3을 제거하여

길이 2인 [4, 5] 부분구간을 만들수 있다.

이 케이스에서는 길이 2인 다른 부분구간도 존재한다.

[array[4], array[5]] => [3, 5] 인 경우

아무것도 제거안해도 길이 2인 오름차순 부분구간이 된다. 

*/

class Test3 {



	public static void main(String[] args) {

		Solution3 s = new Solution3();

		int[]  array = {2, 3, 9, 4, 5};

		System.out.println(s.getLength(array.length, array,1, false));

	}

	

}

class Solution3{

	public int getLength(int N, int[] array, int count, boolean change) {

		for (int i = 0; i < array.length - 1; i++) {

			if( array[i] <= array[i+1]) {

				count++;

			}else {

				if(!change) {

					int[] newArr = new int[N-1];

					int n = 0;

					for (int j = 0; n < newArr.length; j++) {

						if(j != i) {

							newArr[n] = array[j];

							n++;

						}

					}

					change = true;

					int temp = getLength(n, newArr, 1, change);

					if( temp >= count ) count = temp; 

					else change = false;

				} else{

					count = 0;

					continue;

				}

			}

		}
		return count;
	}

}
