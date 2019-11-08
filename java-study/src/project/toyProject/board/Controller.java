package project.toyProject.board;


import java.util.ArrayList;
//게시판 만들기
//필드 : 글번호, 제목, 내용, 작성자, 비밀번호
//컨트롤러 메소드: 전체목록가져오기, 하나가져오기, 리스트에 삽입, 리스트멤버 수정, 리스트멤버 삭제, 비번바꾸기
//뷰어 메소드 : 전체보여주기, 글보기, 새글쓰기, 수정, 삭제

public class Controller {
	ArrayList<DTO> list;
	public Controller() {
	
	list = new ArrayList<DTO>();
	//기본 데이터
	DTO a1 = new DTO();
	a1.setId(1);
	a1.setPassword(1234);
	a1.setWriter("김철수");
	a1.setTitle("공지사항입니다.");
	a1.setComment("분리수거 요일은 월,목입니다. 감사합니다.");
	
	DTO a2 = new DTO();
	a1.setId(2);
	a1.setPassword(1620);
	a1.setWriter("이영자");
	a1.setTitle("맛집 추천합니다.");
	a1.setComment("아파트 앞에 새로 생긴 치킨집의 양념통닭 꼭 드셔보세요 !");
	
	DTO a3 = new DTO();
	a1.setId(3);
	a1.setPassword(1620);
	a1.setWriter("쏘니");
	a1.setTitle("조기 축구회원 모집");
	a1.setComment("아파트 내 조기축구회 회원모집 합니다. 010-1234-5678");
	
	list.add(a1);
	list.add(a2);
	list.add(a3);
	
	}
	
	public ArrayList<DTO> selectAll() {
		return list;
	}
	public DTO select(int index) {
		return list.get(index);
	}
	
	public int getIdIndex(DTO b, int index) {
		for(int i =0; i<list.size();i++) {
			if(list.get(i).getId() == index) {
				return list.get(i).getId();
			}
		}
		
		return -1;
	}
	
	public void insert(DTO b) { //삽입
		int i = list.get(list.size()-1).getId()+1;
		b.setId(i);
		list.add(b);	
	}
	
	public void update(DTO b) { //수정하기
		list.set(list.indexOf(b),b);
		
	}
	public void delete(DTO b) { //지우기
		list.remove(b);
	}
	
	
	
	
	
	
}
