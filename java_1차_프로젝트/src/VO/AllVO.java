package VO;

import java.sql.Date;
import java.sql.Timestamp;

public class AllVO {
	//book속성
	private int book_no;
	private String book_name;
	private String book_comp;
	private String book_author;
	private String book_genre;
	private String book_text;
	private String book_doname;
	private char book_rent;
	//member 속성
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String address;
	private int donscore;
	private int readscore;
	//rentbook 속성
	private int no;
	private Date outdate;
	private Date indate;
	private Date exdate;
	private String member_id;
	//in_out 속성
	private String in_no;
	private char in_check;
	private String in_indate; // Date가 아닌 Timestamp로 하는 이유는 db에는 시분초까지 관리는하고있지만 출력은되지가않는다.
								// 시분초까지 불러오기위해서는 Date가 아닌 Timestamp로 타입을 지정해줘야한다.
	private String in_outdate;
	private String in_member_id;
	
	
	public AllVO() {
		super();	
}


	public int getBook_no() {
		return book_no;
	}


	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}


	public String getBook_name() {
		return book_name;
	}


	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}


	public String getBook_comp() {
		return book_comp;
	}


	public void setBook_comp(String book_comp) {
		this.book_comp = book_comp;
	}


	public String getBook_author() {
		return book_author;
	}


	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}


	public String getBook_genre() {
		return book_genre;
	}


	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}


	public String getBook_text() {
		return book_text;
	}


	public void setBook_text(String book_text) {
		this.book_text = book_text;
	}


	public String getBook_doname() {
		return book_doname;
	}


	public void setBook_doname(String book_doname) {
		this.book_doname = book_doname;
	}


	public char getBook_rent() {
		return book_rent;
	}


	public void setBook_rent(char book_rent) {
		this.book_rent = book_rent;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getAddress() {
		return address;
	}


	void setAddress(String address) {
		this.address = address;
	}


	public int getDonscore() {
		return donscore;
	}


	public void setDonscore(int donscore) {
		this.donscore = donscore;
	}


	public int getReadscore() {
		return readscore;
	}


	public void setReadscore(int readscore) {
		this.readscore = readscore;
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


	public Date getIndate() {
		return indate;
	}


	public void setIndate(Date indate) {
		this.indate = indate;
	}


	public Date getExdate() {
		return exdate;
	}


	public void setExdate(Date exdate) {
		this.exdate = exdate;
	}


	public String getMember_id() {
		return member_id;
	}


	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}


	public String getIn_no() {
		return in_no;
	}


	public void setIn_no(String in_no) {
		this.in_no = in_no;
	}


	public char getIn_check() {
		return in_check;
	}


	public void setIn_check(char in_check) {
		this.in_check = in_check;
	}


	public String getIn_indate() {
		return in_indate;
	}


	public void setIn_indate(String in_indate) {
		this.in_indate = in_indate;
	}


	public String getIn_outdate() {
		return in_outdate;
	}


	public void setIn_outdate(String in_outdate) {
		this.in_outdate = in_outdate;
	}


	public String getIn_member_id() {
		return in_member_id;
	}


	public void setIn_member_id(String in_member_id) {
		this.in_member_id = in_member_id;
	}


	


	

}