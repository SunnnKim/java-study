package quest.assignment5.method;

import java.util.Arrays;

public class Test04 {
	public static void main(String[] args) {
		
		// 문자열 찾기
		String str = "Hello Java";
		
		int ind = str.indexOf("llo");  
		System.out.println(ind);  // 2
		ind = str.indexOf("a");  
		System.out.println(ind);  // 7
		ind = str.indexOf("Je");  // 못찾을 경우 : -1 
		System.out.println(ind);  // -1
		ind = str.indexOf("a", 8);
		System.out.println(ind);  // 9
		
		// 뒤쪽부터 찾는다.
		ind = str.lastIndexOf("a");  
		System.out.println(ind);  // 9
		// 8번째 인덱스부터 앞으로 이동하면서 찾는다.(8 -> 7 -> 6 ... 0)
		ind = str.lastIndexOf("a", 8);  
		System.out.println(ind);  // 7
		
		// str의 내용에 "llo" 의 내용이 포함되어 있는지 확인
		System.out.println(str.contains("llo"));  // true
		
		
		// 문자열 추출하기 : 일부 문자열 가져오기
		str = "Hello Java";
		// str의 3번째 인덱스위치부터 마지막까지 추출하라..
		String msg = str.substring(3);
		System.out.println(msg);  // lo Java
		// endIndex는 포함되지 않는다.
		msg = str.substring(2, 4);
		System.out.println(msg);  // ll
		
		str = "홍길동:22:서울특별시 마포구:hong@a.com";
		// RegularExpression(정규표현식)
		String[] result = str.split(":");
		System.out.println(Arrays.toString(result));
		
		/*
		StringUtil su = new StringUtil();
		// arr[0] -> 홍길동
		// arr[1] -> 22
		// arr[2] -> 서울특별시 마포구
		// arr[3] -> hong@a.com
		String[] arr = 
				su.split("홍길동:22:서울특별시 마포구:hong@a.com", ":");
		System.out.println(Arrays.toString(arr));
		*/
		
		
		
		/*
		String str = "hello";
		boolean bool = str.startsWith("he");
		System.out.println(bool);
		System.out.println(str.endsWith("llo"));
		System.out.println(str.equals("hello"));
		
		// 대소문자 무시하고 내용 비교
		System.out.println(str.equals("Hello"));  // false
		// true
		System.out.println(str.equalsIgnoreCase("Hello"));
		
		
		String quit = "y";
		
		switch(quit) {
		case "Y":
		case "y":
			break;
		}
		
		if (quit.equals("Y") || quit.equals("y")) {
			
		}
		
		if (quit.equalsIgnoreCase("y")) {
			
		}
		*/
	}
}














