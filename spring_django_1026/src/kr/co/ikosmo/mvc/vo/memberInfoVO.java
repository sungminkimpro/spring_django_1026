package kr.co.ikosmo.mvc.vo;

public class memberInfoVO {
/*
 * NO      NOT NULL NUMBER        
PWD              VARCHAR2(10)  
WRITER           VARCHAR2(34)  
SUBJECT          VARCHAR2(100) 
CONTENT          VARCHAR2(400) 
REGDATE          DATE  
 * */
	
	private String id;
	private String name;
	private String tel;
	private String emain;
	private String addr;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getEmain() {
		return emain;
	}
	public void setEmain(String emain) {
		this.emain = emain;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
