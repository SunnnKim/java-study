package mymoviecomments;

import java.util.ArrayList;
import java.util.Scanner;


public class Viewer {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		UserController uController = new UserController();
		MovieController mController = new MovieController();
		ViewerController vController = new ViewerController();

		System.out.println("===========================");
		System.out.println("=====My MOVIE COMMENTS=====");

		outer: while (true) {
			System.out.println("===========================");
			System.out.println(" 1. LogIn 2. Join 3. Exit");
			System.out.print(">>>>>>  ");
			int choice = sc.nextInt();

			login: if (choice == 1) {
				// log in
				UserDTO logInUser = logIn(sc, uController);

				if (logInUser == null) {
					System.out.println("Wrong ID or Password !!!");
					System.out.println("-------------------------");
					System.out.println("1. Main 2. lost Id/Pw");
					System.out.print(">>>>> ");
					choice = sc.nextInt();
					// 아이디/패스워드 찾기
					if (choice == 2) {
						lostIdPw: while (true) {
							System.out.println("-------------------");
							System.out.println("   Find ID / PW");
							System.out.println("-------------------");
							System.out.println("1.Id  2.PW  3.back to Main");
							System.out.print(">>>>> ");
							choice = sc.nextInt();
							if (choice == 1) {
								uController.findMyId(sc);
								break lostIdPw;
							} else if (choice == 2) {
								uController.findMyPw(sc);
								break lostIdPw;
							} else
								break login;
						}
					} else {
						// 로그인 화면으로 돌아가기
						break login;
					}
				} else {// 로그인 성공
					System.out.println("-----------------------------------");
					System.out.println("* \"" + logInUser.getName() + "\" just logged in! *");
					
					while(true) {
					System.out.println("-----------------------------------");
					System.out.println("1.Movies  2.My profile 3.Log Out");
					System.out.print(">>>>>>");
					choice = sc.nextInt();
					
					movieSection :
					if (choice == 1) {

						mController.selectAll();
						System.out.println("-----------------------------------");
						System.out.println("1. Select Movie 2. back");
						System.out.print(">>>>>>");
						
						choice = sc.nextInt();
						if(choice == 1) {
							//mController.selectOne(String movieName);
							//만들 메소드임
							
						}else {
							break movieSection;
						}
						
						
						
						// Movies - comments

					} else if (choice == 2) {
						// 회원정보 수정
						System.out.println("-----------------------------------");
						System.out.println("1. Change Info ");
						System.out.println("2. My Comments ");
						System.out.println("3. Back");
						System.out.print(">>>> ");
						choice = sc.nextInt();
						if(choice == 1) {
							// 정보 수정
						}else if(choice ==2) {
							//내가작성한 코멘트 보기
						}else if( choice == 3) {
							break movieSection;
						}else {
							System.out.println("Wrong Access !!!");
							System.out.println(": Logged Out");
							break;
						}
						
						

					}else if(choice == 3) {
						//로그아웃
						vController.exit();
						break outer;
					}
					else {
						System.out.println("Wrong Access !!!");
						System.out.println(": Logged Out");
						break;
					}
					}
				}
			}

			else if (choice == 2) {

				// join in
				uController.joinUser(sc);

			} else if (choice == 3) {
				vController.exit();
				break;
			} else {
				System.out.println("! Wrong Access !");

			}

		}

		sc.close();

	}

	private static UserDTO logIn(Scanner sc, UserController u) {
		// 아이디 + 패스워드 맞으면
		// list에 들어있는 UserDTO 반환
		// 없으면 Null 반환

		sc.nextLine(); // nextLine 초기화
		System.out.print("*  I    D  : ");
		String inputId = sc.nextLine();
		System.out.print("* PASSWORD : ");
		String inputPw = sc.nextLine();
		return u.selectOne(inputId, inputPw);

	}

}
