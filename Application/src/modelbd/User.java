package modelbd;

import java.io.Serializable;

import javax.swing.text.PasswordView;

import LogInPage.Date;
import LogInPage.Gender;

public class User implements Serializable {
	
	private String fullname;
    private int id;  
	private Date bdate;
	private Gender gender;
	private String email;
	private char [] password;
	private static  int count=0;
	
	
	
	public User(String fullname, Date bdate, Gender gender, String email, char[] password) {
		super();
		this.fullname = fullname;
		this.bdate = bdate;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.id=count;
		count++;
	}
	public User(int Id,String fullname, Date bdate, Gender gender, String email, char[] password) {
		super();
		this.fullname = fullname;
		this.bdate = bdate;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.id=Id;
	}
	



	public String getFullname() {
		return fullname;
	}



	public void setFullname(String fullname) {
		this.fullname = fullname;
	}



	public Date getBdate() {
		return bdate;
	}



	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}




	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
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
	
	public int getid() {
		
		return this.id;
	}
      public void setid(int id) {
		
		 this.id=id;
	}


	

}
