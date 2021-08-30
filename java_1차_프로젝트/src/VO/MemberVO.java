package VO;

public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String address;
	private int donscore;
	private int readscore;
	private String admin_id;
	
	public MemberVO(String id, String pw, String name, String tel, String address, int donscore, int readscore,
			String admin_id) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.address = address;
		this.donscore = donscore;
		this.readscore = readscore;
		this.admin_id = admin_id;
	}
	public MemberVO(String id) {
		super();
		this.id = id;
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

	public void setAddress(String address) {
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

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	
	

	

	

	
	
	
	
}
