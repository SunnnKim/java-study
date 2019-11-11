package mymoviecomments;

import java.util.ArrayList;



public class MovieController {
	
	ArrayList<MovieDTO> list;
	
	public MovieController(){
		
		list = new ArrayList<MovieDTO>();
		//현재 박스오피스 순위
		MovieDTO m0 = new MovieDTO();
		m0.setId(0);
		m0.setName("신의한수:귀수편");
		m0.setLength(106);
		m0.setGanre("Action");
		
		list.add(m0);
		
		MovieDTO m1 = new MovieDTO();
		m1.setId(1);
		m1.setName("터미네이터:다크페이크");
		m1.setLength(128);
		m1.setGanre("SF,Action");
		
		MovieDTO m2 = new MovieDTO();
		m2.setId(2);
		m2.setName("82년생김지영");
		m2.setLength(118);
		m2.setGanre("Drama");

		MovieDTO m3 = new MovieDTO();
		m3.setId(3);
		m3.setName("아담스패밀리");
		m3.setLength(87);
		m3.setGanre("Animation");
		
		MovieDTO m4 = new MovieDTO();
		m4.setId(4);
		m4.setName("날씨의아이");
		m4.setLength(112);
		m4.setGanre("Animation");
		
		MovieDTO m5 = new MovieDTO();
		m5.setId(5);
		m5.setName("말레피센트2");
		m5.setLength(119);
		m5.setGanre("Fantasy");
		
		MovieDTO m6 = new MovieDTO();
		m6.setId(6);
		m6.setName("조커 ");
		m6.setLength(123);
		m6.setGanre("Crime");
		
		MovieDTO m7 = new MovieDTO();
		m7.setId(7);
		m7.setName("가장보통의연애");
		m7.setLength(109);
		m7.setGanre("Romance");
		
		list.add(m0);
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		list.add(m7);
		
	}
	
	
	// 영화 목록보기
	public ArrayList<MovieDTO> selectAll() {
		System.out.println("===================================");
		System.out.println("           All Movie List");
		System.out.println("===================================");
		
		System.out.printf("%10s\t%6s\t%s\n","Name","Length","Ganre");
		System.out.println("-----------------------------------");
		for(MovieDTO m : list) {
			System.out.printf("%10s\t%4d\t%s\n",m.getName(),m.getLength(),m.getGanre());
		}
		return list;
		
	}

	public void insert(MovieDTO m) {
		list.add(m);
		
	}
	
	
	
	
	
}
