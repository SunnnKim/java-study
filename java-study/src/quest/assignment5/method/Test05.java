package quest.assignment5.method;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test05 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		// 기본형 또는 참조형을 문자열로 변경
		String str = String.valueOf(1);
		str = String.valueOf(1.1);
		str = String.valueOf('a');
		str = String.valueOf(true);
		
		String str2 = 1 + "";
		
		/*
		String str = "   H e l l o   ";
		// 양쪽 공백 제거
		System.out.println(str.trim());
		// 모든 공백 제거
		System.out.println(str.replace(" ", ""));
		
		// printf : 화면에 출력 할 경우 사용
		String name = "홍길동";
		int age = 33;
		// static 이 붙은 메서드나 멤버변수는 클래스이름.변수, 클래스이름.메서드
		String msg = 
				String.format("이름 : %s, 나이 %d%n", name, age);
		System.out.print(msg);
		
		System.out.printf("이름 : %s, 나이 %d%n", name, age);
		*/
		
		
		
		
		
		// 변경
//		String str = "안He1l녕4l55o사J3321세2av976a요";
//		String str = "He*l*l**o J*****av***a";
		/*
		for (int i = 0; i <= 9; i++) {
			str = str.replace(i + "", "*");
		}
		for (char i = 'A'; i <= 'Z'; i++) {
			str = str.replace(i + "", "*");
		}
		for (char i = 'a'; i <= 'z'; i++) {
			str = str.replace(i + "", "*");
		}
		
		// 정규표현식 사용 가능(replaceAll)
		str = str.replaceAll("[0-9A-Za-z]", "*");
		System.out.println(str);
		 */
		
		/*
		char[] arr = str.toCharArray();
		String temp = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= '0' && arr[i] <= '9') {
				temp += "*";
				continue;
			}
			temp += arr[i];
		}
		str = temp;
		System.out.println(str);
		*/
		
		/*
		System.out.println(str.replace("l", ""));
		System.out.println(str.replace("l", "e"));
		*/
		
		/*
		String str = "Hello";
		char[] cArr = str.toCharArray();
		System.out.println(Arrays.toString(cArr));
		
		for (int i = cArr.length - 1; i >= 0; i--) {
			System.out.println(cArr[i]);
		}
		
		byte[] bArr = str.getBytes("utf-8");
		System.out.println(Arrays.toString(bArr));
		*/
		
		/*
		String str = "Hello Java";
		str = str.toUpperCase();
		System.out.println(str);
		str = str.toLowerCase();
		System.out.println(str);
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str);
		*/
	}
}











