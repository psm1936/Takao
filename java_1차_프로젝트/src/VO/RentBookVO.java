package VO;

import java.sql.Date;

public class RentBookVO {
	private int no;
	private Date outdate;
	private Date intdate;
	private Date exdate;
	private int book_no;// no가 겹쳐서 도서테이블에 있는 도서 번호는 book_no으로 변수 지정 해줌
	private String member_id;// 회원 아이디
	public RentBookVO(int no, Date outdate, Date intdate, Date exdate, int book_no, String member_id) {
		super();
		this.no = no;
		this.outdate = outdate;
		this.intdate = intdate;
		this.exdate = exdate;
		this.book_no = book_no;
		this.member_id = member_id;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Date getOutdate() {
		return outdate;
	}
	public void setOutdate(Date outdate) {
		this.outdate = outdate;
	}
	public Date getIntdate() {
		return intdate;
	}
	public void setIntdate(Date intdate) {
		this.intdate = intdate;
	}
	public Date getExdate() {
		return exdate;
	}
	public void setExdate(Date exdate) {
		this.exdate = exdate;
	}
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	
	
}