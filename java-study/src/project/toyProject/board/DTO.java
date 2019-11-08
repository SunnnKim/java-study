package project.toyProject.board;
/*
//게시판 만들기
//필드 : 글번호, 제목, 내용, 작성자, 비밀번호
//메소드 : 전체 목록보기, 글보기, 새글쓰기, 수정, 삭제
*/
public class DTO {

	private int id;
	private String title;
	private String comment;
	private String writer;
	private int password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DTO other = (DTO) obj;
		if (id != other.id)
			return false;
		if (password != other.password)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "[ " + id + " ] " + title + " 작성자: " + writer + "]";
	}
	
	
	
	

	

}
