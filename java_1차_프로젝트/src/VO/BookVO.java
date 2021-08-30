package VO;

public class BookVO {
	private int no;
	private String name;
	private String comp;
	private String author;
	private String genre;
	private String text;
	private String doname;
	private char rent;
	private String admin_id;
	
	public BookVO(int no, String name, String comp, String author, String genre, String text, String doname, char rent,
			String admin_id) {
		super();
		this.no = no;
		this.name = name;
		this.comp = comp;
		this.author = author;
		this.genre = genre;
		this.text = text;
		this.doname = doname;
		this.rent = rent;
		this.admin_id = admin_id;
	}
	
	public BookVO(int no, String name, String comp, String author, String genre, String text, String doname
			) {
		super();
		this.no = no;
		this.name = name;
		this.comp = comp;
		this.author = author;
		this.genre = genre;
		this.text = text;
		this.doname = doname;
		
	}
	public BookVO(int no, String name, String comp, String author, String genre, String text, char rent
			) {
		super();
		this.no = no;
		this.name = name;
		this.comp = comp;
		this.author = author;
		this.genre = genre;
		this.text = text;
		this.rent = rent;
		
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDoname() {
		return doname;
	}

	public void setDoname(String doname) {
		this.doname = doname;
	}

	public char getRent() {
		return rent;
	}

	public void setRent(char rent) {
		this.rent = rent;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	
	
	
	
	
	
	
	
}
