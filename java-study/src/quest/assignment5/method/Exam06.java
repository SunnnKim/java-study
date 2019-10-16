package quest.assignment5.method;

import java.util.Arrays;

/*
첫 번째 매개변수로 문자열의 길이를 두 번째 매개변수 길이로 맞추되, 
부족한 공간을 왼쪽 부터 세 번째 문자로 채워서 리턴하는 leftPad() 메서드를 구현하시오. 
*/
public class Exam06 { 
	public static void main(String[] args) { 
		System.out.println(leftPad("JAVA", 10, '#')); 
		System.out.println(leftPad("C", 10, '$')); 
		System.out.println(leftPad("S-CORE ", 10, '*')); 
		System.out.println(leftPad("BIT JAVA", 5, '@')); 
	} 
	private static String leftPad(String str, int size, char c) { 
		//leftPad("S-CORE", 8, "#") 이면 "## S-CORE " 문자열이 리턴된다. 
		//단, 두 번째 매개변수가 첫번째 매개변수로 들어온 문자열의 길이보다 작을 경우, "변환할 수 없습니다." 라는 문자열을 리턴합니다. 
		// 구현하시오. 
		
		
		int length = str.length();

		if(length>size) return "변환할 수 없습니다.";
		
		char[] chs = new char[size];
		int index=0;
		for(int i = size-1,k=length-1; k>=0; i--,k--) {
			chs[i] = str.charAt(k);
			index = i;
		}
		for(int i=index-1;i>=0;i--) {
			chs[i] = c;
		}
		String newStr = new String(chs);
		
		return newStr;
	} 
}
