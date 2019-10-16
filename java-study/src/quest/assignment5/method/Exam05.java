package quest.assignment5.method;

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
		System.out.println(getNextId("USER-00007")); 
		System.out.println(getNextId("ORDER-0009")); 
		System.out.println(getNextId("PRODUCT-00003")); 

		
	} 
	private static String getNextId(String id) { 
		//기능구현 
		int length = id.length();
		char [] chs = new char[length];
		chs = id.toCharArray();
		int lastNum = chs[length-1] - '0';
		
		if( lastNum == 9 ) {
			chs[length-1] = '0';
			lastNum = chs[length-2] - '0';
			lastNum++;
			chs[length-2] = Character.forDigit(lastNum,10);
		}else {
			lastNum++;
			chs[length-1] = Character.forDigit(lastNum,10);
		}
		String result="";
		for(int i=0;i<length;i++) 
				result+= chs[i];
			
		
		return result;
	} 
}
/*
 * String getId = Character.toString(id.charAt(id.length()-1));
		String newStr="";
		
		int addId = Integer.parseInt(getId) +1;
		String newId = Integer.toString(addId);
		newStr = id.replace(getId, newId);
		int a = 123;
		String.valueOf(a);
		*/
 