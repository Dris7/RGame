package LogInPage;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import modelbd.User;

public class DTabel extends AbstractTableModel{
   
	
	private List<User> users;
	private String [] cNames= {"ID","Name","Birthdate","Email","Gender","Password"};
	public DTabel() {
		
	   users=new ArrayList<>();
	 
	   
   }
	
	@Override
	public String getColumnName(int column) {
		
		return this.cNames[column];
	}
	
	@Override
	public int getRowCount() {
		
		return users.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public Object getValueAt(int row, int column) {
		// TODO Auto-generated method stub
		User user=users.get(row);
		
		
		switch(column) {
		
		case 0:
			
			return user.getid();
			
		case 1:
			
			return user.getFullname();
			
			
         case 2:
			
			return user.getBdate().getDate();
			
         
				
         case 3:
				
				return user.getEmail();
				
         case 4:
				
				return user.getGender();
				
         case 5:
				
				return user.getPassword();
				
		
		
		
		
		}
		
		
		
		return null;
	}
public void setdata(ArrayList<User> users) {
		
		this.users=users;
		
	}
	
	
	
	
	
	
	
	
}
