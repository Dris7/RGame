package modelbd;

import java.sql.SQLException;

public class testdb  {
	public static void main(String[] args) {
		database db= new database();
		
		
		
		db.connect();
			
		try {
			db.methode();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.disconnect();
		
		
		
	}

}
