package LogInPage;

import java.util.EventObject;

public class Fevent extends EventObject {
	private String fullname;
	private String bdate;
	private String gender;
	private String email;
	private char [] password;
	public Fevent(Object source, String fullname, String bdate, String gender, String email,
			char[] password) {
		super(source);
		this.fullname = fullname;
		this.bdate = bdate;
		this.gender = gender;
		this.email = email;
		this.password = password;
	}

	public Fevent(Object source) {
		super(source);


		
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}


}
