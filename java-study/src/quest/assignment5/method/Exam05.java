package quest.assignment5.method;
import java.util.*;

/*
매개변수로 받은 문자열에서 마지막 숫자를 하나 증가시켜서 리턴하는 메서드를 구현하시오. 
프로그램 실행 결과는 다음과 같습니다. 
<<처리 결과>> 
USER-00008 
ORDER-00010 
PRODUCT-00004 
*/
class Exam05 { 
	public static void main(String[] args) { 
		System.out.println(getNextId("USER-00027")); 
		System.out.println(getNextId("ORDER-0099")); 
		System.out.println(getNextId("PRODUCT-00003"));
		
	} 
	private static String getNextId(String id) { 
		//기능구현 

		String [] str = id.split("-");
		
		int length = str[1].length();
		int count=0;
		
		for(int i=0; i<length; i++) {
			if(str[1].charAt(i) == '0' ) count++;
			else break;
		} // 몇자리부터 0이 아닌 숫자인지 계산하기
		
		int mul = 1;
		int sum = 0;
		for(int i=1; i<=length - count ; i++) {
			sum += (str[1].charAt(length-i) - '0') * mul;
			mul *= 10;
		}
		sum++;
		mul = 10;

		char[] chs = new char[ length ]; //새로운 str[1] 값의 저장소
		
		for(int i=length-1; i>=0; i--) {
			if(sum>0) { 
			chs[i] = Character.forDigit(sum % mul,10); 
			sum = sum / 10; 
			}else chs[i] = '0'; //더이상 새로운 수가 없을 경우 0 저장
		}
		String newStr = str[0] +"-"+ String.valueOf(chs); //결과!!
		

		return newStr;
	} 
}
