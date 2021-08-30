package VO;

public class InoutVO {
	
	private String no;
	private String check;
	private String in_date;
	private String out_date;
	private String member_id;
	
	public InoutVO(String no, String check, String in_date, String out_date, String member_id) {
		super();
		this.no = no;
		this.check = check;
		this.in_date = in_date;
		this.out_date = out_date;
		this.member_id = member_id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public String getIn_date() {
		return in_date;
	}

	public void setIn_date(String in_date) {
		this.in_date = in_date;
	}

	public String getOut_date() {
		return out_date;
	}

	public void setOut_date(String out_date) {
		this.out_date = out_date;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	
	
	
}
