package quest.assignment5.method;
/*

매개변수로 받은 문자열에서 소문자는 대문자로, 대문자는 소문자로 변환하여 리턴 하는 translate() 메쏘드를 구현하시오. 
 출력결과> Hello World Java jAVA pROGRAM

*/
public class Exam07 { 
	public static void main(String[] args) { 
		System.out.println(translate("hELLO wORLD jAVA"));
		System.out.println(translate("Java Program"));
	} 
	private static String translate(String str) { 
		// 구현하시오.
		int length = str.length();
		char[] chs = new char[length];
		chs = str.toCharArray();
				
		
 		for(int i=0;i<length;i++) {
		if(Character.isUpperCase(chs[i])) {
			chs[i] = Character.toLowerCase(chs[i]);	
		}else{
			chs[i] = Character.toUpperCase(chs[i]);	
		}
		}
 		
 		String newStr =  new String(chs);	
		
		return newStr;
	} 
} 