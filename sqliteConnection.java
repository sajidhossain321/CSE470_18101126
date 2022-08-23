import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class sqliteConnection {
	Connection con = null;
	public static Connection dbConnector ()
	{D:
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Sajid Hossain\\Desktop\\Super Shop Management system\\untitled\\EmployeeData.sqlite");
			 //JOptionPane.showMessageDialog(null, "Connection Successful");
			return con;
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
