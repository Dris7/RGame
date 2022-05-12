package Controller;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import LogInPage.Date;
import LogInPage.Fevent;
import LogInPage.Gender;
//import LogInPage.UsersTable;
import modelbd.User;
import modelbd.database;

public class Controller {
	

	private database db;
	private File file;
	
public Controller() {
	
	db =new database();
	

	try {
		file = new File("data.ser");
		if(file.length()!=0)
		db=db.loadfromFiledb(file);
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
}
	
	
	
	public void adduser(Fevent action) {
		
		String name=action.getFullname();
		
		String email = action.getEmail();
		char[] password=action.getPassword();
		
		Gender gender=null;
		switch(action.getGender()) {
		
		case "male": 
			gender=Gender.male;
			break;
		case "female": 
			gender=Gender.female;
			break;
			
		}
		
			System.out.println(""+String.valueOf(password));
			
		
		//System.out.println();
		if(name.isEmpty()||email.isEmpty()||gender==null||password.length==0) {
		
		JOptionPane.showMessageDialog(null, "Invalide Infos:Messed to fill Some Fields",
					"Error Sing up ",JOptionPane.ERROR_MESSAGE);
			
			return;
		}
		Date bdate=getDate(action.getBdate());
		
		if(!bdate.isvalide()) {
			JOptionPane.showMessageDialog(null, "Invalide Birthdate please Insert (DD/MM/YY)",
					"Error Date ",JOptionPane.ERROR_MESSAGE);
			
		}
		else if(!isEmailValid(email)) {
			
			JOptionPane.showMessageDialog(null, "Invalide Email",
					"Error Email ",JOptionPane.ERROR_MESSAGE);
			
			
		}
		else {
			User usr=new User(name,bdate,gender,email,password);
		System.out.println(usr.getFullname());
		try {
			db.connect();
			System.out.println(usr.getid());
			db.save(usr.getid(), name, bdate, gender, email, password);
			db.disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.adduser(usr);
		JOptionPane.showMessageDialog(null, "Acount added",
				"Success Singing Up ",JOptionPane.PLAIN_MESSAGE);
			
		}
		
		
		
		
		
	}
	
	public database getdb() {
		if (db!=null)
		return this.db;
		return new database();
	}
	
	public static Date getDate(String date) {
		Date dt=new Date();
		int in=0;
		
		int [] pos =new int[2];
		pos[0]=0;
		pos[1]=0;
		for(int i=0;i<date.length();i++){
			if(date.charAt(i)=='/') {
				pos[in]=i;
				in++;
				
				//System.out.println(i);
				
			}
			
			
			
		}
		
		if(pos[0]==0||pos[1]==0||date.charAt(date.length()-1)=='/') {
			dt.setvalide(false);
		}
		else {
		dt.setDay(Integer.parseInt(date.substring(0, pos[0])));
		//System.out.println(date.substring(0, pos[0]));
		dt.setMonth(Integer.parseInt(date.substring(pos[0]+1, pos[1])));
		//System.out.println(date.substring(pos[0]+1, pos[1]));
		dt.setYear(Integer.parseInt(date.substring(pos[1]+1)));
		//System.out.println(date.substring(pos[1]+1));
		}
		
		
		return dt;
	}
	
	
	
	
	
	
	
	public void savetoFile(File file) throws IOException {
		
		db.savetoFile(file);
		
	}
	public void loadfromFile(File file) throws ClassNotFoundException, IOException {
		
		
		db.loadfromFile(file);
	}
	public boolean isEmailValid(String email)
	{
       
				
                   return true;				
				
			

		
	}
	
	

	
	

}
