package modelbd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import com.mysql.cj.protocol.Resultset;

import LogInPage.Date;
import LogInPage.Gender;

public class database implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<User> users;
	private Connection connection ;
	
	public database() {
		
		users=new ArrayList<>();
		
		
	}
	
	public void adduser(User usr) {
		
		try {
		this.users.add(usr);
		}
		catch(NullPointerException e){
			
			System.exit(0);
		}
		
	}
	public ArrayList<User> getUsers() {
		if(users==null)return new ArrayList();
		return users;
		
	}
	public void savetoFile(File file) throws IOException {
		
    FileOutputStream fos=new FileOutputStream(file);
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    
  
    
    
    //User [] usrs=users.toArray(new User [users.size()] );
    
    //System.out.println("saves :"+usrs.length);
    if(users.size()>1)//keeps the id incremented without resting to zero everytime.
    users.get(users.size()-1).setid(users.get(users.size()-2).getid()+1);;
         
		oos.writeObject(users);
		//oos.writeObject(new Object());
		
		oos.close();
		fos.close();
		
		
	}
	@SuppressWarnings("unused")
	public void loadfromFile(File file) throws IOException, ClassNotFoundException{
		
			if(file.length()==0)return;
		FileInputStream fis=new FileInputStream(file);
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		//User usrs [];
		ArrayList<User> usrs=null;
		
		//usrs=(User []) ois.readObject();
		//if(ois.available()>1)
		usrs=(ArrayList<User>) ois.readObject();
		for(User user: usrs) {
		
		}
		
		this.users.clear();
		
		this.users.addAll(usrs);
		
		ois.close();
		fis.close();
		
		
		
	}
	///// this will be usefull
	public database loadfromFiledb(File file) throws IOException, ClassNotFoundException{
		
		if(file.length()==0)return null;
	FileInputStream fis=new FileInputStream(file);
	
	ObjectInputStream ois=new ObjectInputStream(fis);
	//User usrs [];
	ArrayList<User> usrs=null;
	
	//usrs=(User []) ois.readObject();
	//if(ois.available()>1)
	ArrayList<User> readObject = (ArrayList<User>) ois.readObject();
	usrs=readObject;
	//usrs=(ArrayList<User>) ois.readObject();
	
	
	this.users.clear();
	
	this.users.addAll(usrs);
	
	
	ois.close();
	fis.close();
	
	return this;
	
}
	
	
	public void connect() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			new Exception("falid to find the Connector");
		}
		
		
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/application","root", "mypass");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("connection done!");
		
		
		
		
	}
	public void disconnect() {
		
		if(connection!=null) {
			
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
	}
	public void methode() throws SQLException {
		
		
		
		
			
			
			PreparedStatement ps=connection.prepareStatement("select fullname from user where IdGender = ?");
			
			ps.setInt(1,0);
			
			
			ResultSet result=ps.executeQuery();
			result.next();
			while(result.getRow()!=0) {
			
			
			String count =result.getString(1);
			
			System.out.println("name :"+count);
			result.next();
			}
			
			
			
		
		
		
		
	
		
		
		
	}
	
	
	
	public void save (int Id,String fullname, Date bdate, Gender gender, String email, char[] password) throws SQLException {
		
		PreparedStatement saveQ = connection.prepareStatement("insert into user values(?,?,?,?,?,?)");
		
		
		
		int inc=1;
		if(users.size()>1)//keeps the id incremented without resting to zero everytime.
		    Id=users.get(users.size()-2).getid()+1;
		saveQ.setInt(inc++, Id);
		saveQ.setNString(inc++, fullname);
		saveQ.setNString(inc++, bdate.getsqlDate());
		int gendersql=-1;
		switch(gender) {
		
		case male:
			
			gendersql=0;
			
			break;
        case female:
			
			gendersql=1;
			
			break;
		
		
		
		}
		saveQ.setNString(inc++, email);
		saveQ.setInt(inc++, gendersql);
		
		saveQ.setNString(inc++, new String(password));
		
		
		saveQ.executeUpdate();
		System.out.println("user added");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
