package kakaotest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test1 {

	 

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		PasswordLevel p = new PasswordLevel();

		System.out.println(p.getLevel(input));

	}

	

 

}	

class PasswordLevel{

	

	public boolean [] checkLevel = new boolean[5];

	

	//initialize

	public PasswordLevel() {

		for (int i = 0; i < checkLevel.length; i++) {

			checkLevel[i] = false;

		}

	}

	// 레벨체크하기

	public String getLevel(String password) {

		checkLevel[0] = checkLowercase(password);

		checkLevel[1] = checkUppercase(password);

		checkLevel[2] = checkNumber(password);

		checkLevel[3] = checkString(password);

		checkLevel[4] = password.length() >= 10 ? true:false;

		int count = 0;

		for (int i = 0; i < checkLevel.length; i++) {

			if(checkLevel[i]) count++;

		}

		

		return "LEVEL"+count;

	}

	

	public boolean checkLowercase(String password) {

		int length = password.length();

		for(int i=0; i<length; i++) {

			if( password.charAt(i)>= 97 && password.charAt(i) < 123 ) return true;

		}

		return false;

	}

	public boolean checkUppercase(String password) {

		int length = password.length();

		for(int i=0; i<length; i++) {

			if( password.charAt(i)>= 65 && password.charAt(i) < 91 ) return true;

		}

		return false;

	}

	public boolean checkNumber(String password) {

		int length = password.length();

		for(int i=0; i<length; i++) {

			if( password.charAt(i)>= 48 && password.charAt(i) < 58 ) return true;

		}

		return false;

	}

	// 특수문자 확인

	public boolean checkString(String password) {

		int length = password.length();

		for(int i=0; i<length; i++ ) {

			if( password.charAt(i) < 48 || ( password.charAt(i) > 58 && password.charAt(i) < 65) || 

					(password.charAt(i) < 90 &&password.charAt(i) < 97) || password.charAt(i) > 122) 

				return true;

		}

		return false;

	}

	

}

/*

1. 영어 소문자

2. 영어 대문자

3. 숫자

4. 특수문자

5. 길이 10자이상

*/