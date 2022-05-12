package LogInPage;

import java.io.Serializable;

public class Date implements Serializable {
	private int day;
	private int month;
	private int year ;
	private boolean valide=true;
	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
public Date() {
		
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isvalide() {
		
		return this.valide;
	}
	public void setvalide (boolean valide)
	{
		
		this.valide=valide;
	}
	public String getDate() {
		
		return (this.day+"/"+this.month+"/"+this.year);
	}
public String getsqlDate() {
		
		return (this.year+"-"+this.month+"-"+this.day);
	}
	

}
