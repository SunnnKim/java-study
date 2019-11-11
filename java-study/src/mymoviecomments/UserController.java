package mymoviecomments;

import java.util.ArrayList;
import java.util.Scanner;



public class UserController {

	ArrayList<UserDTO> list;

	public UserController() { // 생성자

		list = new ArrayList<UserDTO>();
		// 기본 회원 데이터들

		UserDTO admin = new UserDTO();
		admin.setId(0); // 관리 id값은 0
		admin.setUserId("admin");
		admin.setPasssword("admin");
		admin.setName("admin");
		admin.setJumin("123456");

		UserDTO user1 = new UserDTO();
		user1.setId(1); // 관리 id값은 0
		user1.setUserId("user1111");
		user1.setPasssword("user1111");
		user1.setName("User1");
		user1.setJumin("930610");

		UserDTO user2 = new UserDTO();
		user2.setId(2); // 관리 id값은 0
		user2.setUserId("user2222");
		user2.setPasssword("user2222");
		user2.setName("User2");
		user2.setJumin("940203");

		list.add(admin);
		list.add(user1);
		list.add(user2);

	}

	// 회원과 관련된 메소드 :

	//모든 회원목록 불러오기 
	public ArrayList<UserDTO> selectAll(){
		
		return list;
	}
	public UserDTO selectOne(String userId, String userPw) {
		
		for(int i =0 ; i<list.size();i++) {
			if(list.get(i).getUserId().equals(userId) && list.get(i).getPasssword().equals(userPw)) {
				return list.get(i);
				
			}
		}
		return null;
	}
	
	public void joinUser(Scanner sc) {
		
		UserDTO m = new UserDTO();
		int id = list.get(list.size()-1).getId()+1;
		m.setId(id);	//id - auto increment
		System.out.println("+++++++++++++++");
		System.out.print("*   I  D   :");
		sc.nextLine();
		m.setUserId(sc.nextLine());
		System.out.print("* PASSWORD :");
		m.setPasssword(sc.nextLine());
		System.out.println("!Set jumin(YYMMDD) for Id/Pw  ex - 930610");
		System.out.print("*  JUMIN   :");
		m.setJumin(sc.nextLine());
		System.out.print("*  N a m e :");
		m.setName(sc.nextLine());
		
		list.add(m);
		
	}

	//아이디로 찾기 
	public void findMyId(Scanner sc) {
		
		sc.nextLine();
	
		System.out.println("==== Find Id ====");
		System.out.print(" Name? : ");
		String name = sc.nextLine();
		System.out.print(" Jumin ? : ");
		String jumin = sc.nextLine();
		for( UserDTO uDTO : list ) {
			if(uDTO.getName().equals(name) && uDTO.getJumin().equals(jumin)) {
				System.out.println("========================");
				System.out.println(" I D  : " + uDTO.getUserId());
				System.out.println(" P W  : " + uDTO.getPasssword());
				return;
			}
			
		}System.out.println("Id NOT exist !!!");
		
		
	}

	// 아이디 및 패스워드로 찾기 
	public void findMyPw(Scanner sc) {
		sc.nextLine();
		
		System.out.println("==== Find Pw ====");
		System.out.print(" I D ? : ");
		String userID = sc.nextLine();
		System.out.print(" Jumin ? : ");
		String jumin = sc.nextLine();
		for( UserDTO uDTO : list ) {
			if( uDTO.getJumin().equals(jumin) && uDTO.getUserId().equals(userID)) {
				System.out.println("========================");
				System.out.println(" I D  : " + uDTO.getUserId());
				System.out.println(" P W  : " + uDTO.getPasssword());
				return;
			}
			
		

		System.out.println("====================");
		System.out.println(" Wrong Infomation !!");
		System.out.println("====================");
		
		}
		
	}
	
	
	public void updateProfile(UserDTO userDTO) {
		System.out.println("update profile 접근!");
		
		
		
	}
	
	
	
	
	
	
	
	
}
