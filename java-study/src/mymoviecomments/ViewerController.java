package mymoviecomments;

import java.util.Scanner;


public class ViewerController {
	
	private UserDTO logInUser;
	
	public UserDTO getLogInUser() {
		return logInUser;
	}
	
	
	public void setLogInUser(UserDTO logInUser) {
		this.logInUser = logInUser;
	}
	//로그인과 관련된 메소드들

//	
//	public UserDTO logIn(UserController uController, Scanner sc) {
//		sc.nextLine(); // nextLine 초기화
//		System.out.print("*  I    D  :");
//		String inputId = sc.nextLine();
//		System.out.print("* PASSWORD :");
//		String inputPw = sc.nextLine();
//		
//		uController.selectOne(inputId, inputPw); 
//	}
	
	


//	public void failToLogIn(Scanner sc, UserDTO logInUser) {
//		
//		if(logInUser == null) {
//			System.out.println("Wrong ID or Password !!!");
//			System.out.println("-------------------------");
//			System.out.println("1. Main 2. lost Id/Pw");
//			System.out.print(">>>>> ");
//			int choice = sc.nextInt();
//			// 아이디/패스워드 찾기
//			if (choice == 2) {
//				lostIdPw: 
//					while (true) {
//					System.out.println("-------------------");
//					System.out.println("   Find ID / PW");
//					System.out.println("-------------------");
//					System.out.println("1.Id  2.PW  3.back to Main");
//					System.out.print(">>>>> ");
//					choice = sc.nextInt();
//					if (choice == 1) {
//						uController.findMyId(sc);
//						break lostIdPw;
//					} else if (choice == 2) {
//						uController.findMyPw(sc);
//						break lostIdPw;
//					} else
//						break login;
//				}
//			} else {
//				// 로그인 화면으로 돌아가기
//				break login;
//			}
//		
//		}
//	}
	
	
//
//	if (logInUser == null) {
//		System.out.println("Wrong ID or Password !!!");
//		System.out.println("-------------------------");
//		System.out.println("1. Main 2. lost Id/Pw");
//		System.out.print(">>>>> ");
//		choice = sc.nextInt();
//		// 아이디/패스워드 찾기
//		if (choice == 2) {
//			lostIdPw: while (true) {
//				System.out.println("-------------------");
//				System.out.println("   Find ID / PW");
//				System.out.println("-------------------");
//				System.out.println("1.Id  2.PW  3.back to Main");
//				System.out.print(">>>>> ");
//				choice = sc.nextInt();
//				if (choice == 1) {
//					uController.findMyId(sc);
//					break lostIdPw;
//				} else if (choice == 2) {
//					uController.findMyPw(sc);
//					break lostIdPw;
//				} else
//					break login;
//			}
//		} else {
//			// 로그인 화면으로 돌아가기
//			break login;
//		}
	

	
	public void exit() {
		System.out.println("====================================");
		System.out.println(" Thank you for using MyMovieComment");
		System.out.println("====================================");
		return;

	}
}

