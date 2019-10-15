package quest.assignment5.method;

/*

첫번째 문자열에서 두번째 문자열을 제거한 상태의 문자열을 리턴하는 메서드를 구현하시오. 
단, String 클래스의 replace 메서드를 사용해서는 안됩니다. 
그리고 메인 메서드는 변경하지 않습니다. 

<<처리 결과>> 
Hell wrld 

 */
public class Exam03 { 

	private static String remove(String data, char ch) {
		
		String ipData = data;
		char a = ch;
		int length = ipData.length();
	
		String str="";
		for(int i=0; i<length; i++) {
			if(ipData.charAt(i) != a ) str += Character.toString(ipData.charAt(i));
			// 문자열의 i번째 문자가 인자값이랑 같지 않을 때 문자열에 넣어주기
		}
		
		
		return str;
		
	} 
	
	
	public static void main(String[] args) { 
		String result = remove("hello world", 'o'); 
		System.out.println(result); 
	} 
}
