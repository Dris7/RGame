package LogInPage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Controller.Controller;
import modelbd.User;

public class UsersTable extends JPanel {
	
	private JTable userstable;
	private Controller controller;
	private DTabel DT;
	
	
	public UsersTable() {
		
		DT=new DTabel();
		
		userstable=new JTable(DT);
		
		
		
		
		
		this.setLayout(new BorderLayout());
		this.add(new JScrollPane(userstable),BorderLayout.CENTER);
		this.setPreferredSize(new Dimension(700,133));
		
	}
  public void setusers(ArrayList<User> db) {
		this.DT.setdata(db);
		
	}
public void refresh() {
	
	DT.fireTableDataChanged();
	this.revalidate();
	
}
	

}
