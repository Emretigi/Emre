package dbase;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class baglanti {
	static Connection myConn;
	static Statement myState;
	static ResultSet myRs;
	static ResultSet yap() {
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mönü","root","124578963");
			myState = myConn.createStatement();
			myRs = myState.executeQuery("SELECT * FROM urunler");
			return myRs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return myRs; 
	}


}
