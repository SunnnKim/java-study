package quest.assignment5.method;

/*
첫번째 문자열을 두번째 문자열을 구분자로 잘라내어 배열에 저장한 후 리턴하는 메서드를 구현하시오. 
단, String 클래스의 Split() 메서드를 사용해서는 안된다. 
그리고 제공된 메인 메서드는 변경하지 않는다. 

<<처리 결과>> 
=== 문자열 처리 결과 === 
PROD-001
X-note
Samsung
3
600000 
 */


public class Exam04 { 
	
	private static String[] parsing(String str1, String str2) { 
		//- 첫번째 매개변수 문자열에는 ‘#’이 중간에 포함되어 있다. 
		//- ‘#’은 문자열 시작과 끝에 나올 수 없다. 
		// 구현하시오. 
		return new String[0]; 
	} 
	public static void main(String[] args) { 
		String str = "PROD-001#X-note#Samsung#3#6000000"; 
		String[] strs = parsing(str, "#"); 
		System.out.println("=== 문자열 처리 결과 ==="); 
		for (int i = 0; i < strs.length; i++) { 
			System.out.println(strs[i]);
		}
	} 
} 

