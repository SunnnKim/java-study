package eastsoft;

import java.util.ArrayList;



public class Test4 {

	public static void main(String[] args) {

		// John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker

		String S = "John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";

		String C = "Example";

		

		Email e = new Email(S, C);

		String a = e.solution();

		System.out.println(a);

	}

}

class Email{

	

	String rowTxt = "";

	String rowCompany = "";

	String[] txtArr;

	ArrayList<String> list;

	

	public Email(String rowTxt, String rowCompany) {

		this.rowCompany = rowCompany.toLowerCase();

		this.rowTxt = rowTxt;

		this.txtArr = rowTxt.split("; ");

		list = new ArrayList<String>();

	}

	public String solution() {

		String email = "";

		for (int i = 0; i < txtArr.length-1; i++) {

			txtArr[i] = txtArr[i].replace("-", "");

			email += txtArr[i] + " ";

			email += getEmailAdd(txtArr[i]) + "; ";

			

		}

		email += txtArr[txtArr.length-1] + " ";

		email += getEmailAdd(txtArr[txtArr.length-1]) + ";";

		

		return email;

	}

	

	public String getEmailAdd(String str) {

		String[] name = str.split(" ");

		String lastName = name[name.length-1].toLowerCase();

		String firstName = name[0].toLowerCase();

		String emailAddress = lastName+ "_" + firstName;

		emailAddress = checkString(emailAddress);

		list.add(emailAddress);

		return "<" + emailAddress + "@" + rowCompany + ".com>";

	}

	

	public String checkString(String a) {

		String str = "";

		int n = 0;

		for(String s : list) {

			if(s.contains(a) ) {

				if( s.length() != a.length()) {

					int m = Integer.parseInt(s.charAt(s.length()-1)+"");

					if(n <= m) {

						n = m ;

						System.out.println(n);

					}

					else{

						n = 1;

					}

				}else {

				}

			}

		}

		if( n != 0 ) str = a + n;

		else str = a;

		

		return str;

	}

}