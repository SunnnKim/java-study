import java.util.Arrays;
import java.util.Map;

/*
 
 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
입출력 예
 
 */


class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer=0;
        // n : 인원수
        // a : 참가자
        // b : 경쟁자
        // 횟수
        int count = 0;
        for(int i = n; 1 < i; i /= 2){
        	if(Math.abs(a-b) != 1) {
        		a = (int)Math.ceil( a / 2.0 );
        		b = (int)Math.ceil( b / 2.0 );
        		System.out.println( "a: "+ a + ", b: " + b);
        		count ++;
        	}
        	else {
        		System.out.println("붙");
        	}
        }
        

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(count);

        return answer;
    }
}