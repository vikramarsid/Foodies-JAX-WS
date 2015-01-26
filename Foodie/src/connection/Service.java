package connection;

//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import users.Item;
import users.Search;
//import java.sql.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import users.User;

import javax.jws.WebService;

@WebService
public class Service {

	DatabaseConnection db = new DatabaseConnection();
	Statement stmt = null;

	public String signUp(int userid,String fname,String lname,String email,String passd,String dob,String gender) throws SQLException {
		String result;
		result = db.signUp(userid,fname,lname,email,passd,dob,gender);
		System.out.println(result);
		return result;
	}

	public User signin(String emailId, String pwd) throws SQLException {
		User user;
		user = db.signin(emailId, pwd);
		return user;
	}

	public String[] getData(String sqlquery) throws SQLException {
		String[] fetch = db.getData(sqlquery);
		return fetch;
	}

	public String insertFormData(String type, int id, String aname, String aaddress, String areview, String arating, String acity) throws SQLException {
		// System.out.println("inside service");
		return db.insertFormData(type, id, aname, aaddress, areview, arating, acity);
	}
	
	public Item[] displayItem(String category) throws SQLException {
		
		return db.displayItem(category);
	}

	public boolean createCategory(String catName) throws SQLException {
		
		return db.createCategory(catName);
	}

	public boolean updateCategory(String firstName, String lastName) throws SQLException {
		
		return db.updateCategory(firstName,lastName);
	}

	public boolean deleteCategory(String delName) throws SQLException {
		
		return db.deleteCategory(delName);
	}
	
	public Search[] searchstring(String searchname, String city) throws SQLException {
		
		return db.searchstring(searchname,city);
		
	}
	

}
