package connection;

import java.sql.Connection;
//import java.sql.CallableStatement;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.Types;
import java.util.ArrayList;

import users.Item;
import users.Search;
//import java.util.Date;
import users.User;

public class DatabaseConnection {
	
	Connection con = null;
	ResultSet rs,rs1;
	ConnectionPool connectionPool = null;
	PreparedStatement ps,ps1;
    Statement stmt = null;
	
	DatabaseConnection(){		
			
	// Connection pooling start
		connectionPool = ConnectionPool.getInstance();
		try{
			con = connectionPool.getConnection();
			//stmt = con.createStatement();
			if (!con.isClosed())	
				System.out.println("Successfully Connected!!!");
			} catch (SQLException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	public String signUp(int userid,String fname,String lname,String email,String passd,String dob,String gender) throws SQLException
	 
	{
				
		String result = "";
		//int iduserslist=0;
		String inquery="";
		int instance;

		ps = null;
		try{
		 	
			inquery = "Insert into userslist(iduserslist, fname,lname, email, passd, dob, gender, signupDate, lastlogin)" + " values('" +userid+"' ,'" +fname +"', '" +lname  +"', '"+email+"', '"+passd+"', '" +dob+"', '"+gender+"',now(),now())";

			System.out.println(inquery);
			ps = con.prepareStatement(inquery); // create a statement
			instance =ps.executeUpdate();
			
			
		    if(instance >0)
			{
				result = "true";
				System.out.println("Insert Successful");
			}
			else
			{
				result = "false";
				System.out.println("The data could not be inserted into the database.");
			}
		}
		catch(SQLException e){
			result = "false";

			e.printStackTrace();
		}finally{
			connectionPool.free(con);ps.close();
		}

		return result;
	}
	
	public User signin(String emailId, String pwd) throws SQLException
	{
		User user = null;
		String outquery;
		String tsquery;
		
		try {
			outquery = "select iduserslist,fname,lname,lastlogin,email,dob,gender,signupDate from userslist where email='"+emailId+"' and passd='"+pwd+"'";
			System.out.println(outquery);
			ps= con.prepareStatement(outquery);
			rs= ps.executeQuery();	


			if (rs.next()) {
				System.out.println("Successful fetch");

				user = new User();
				user.setMembershipId(rs.getInt(1));
				user.setFirstName(rs.getString(2));
				user.setLastName(rs.getString(3));
				user.setLastLogin(rs.getTimestamp(4));
				user.setEmailId(rs.getString(5));
				user.setDob(rs.getString(6));
				user.setGender(rs.getString(7));
				user.setRegistrationDate(rs.getString(8));
								
				System.out.println(user.getFirstName());
				System.out.println(user.getLastName());
				System.out.println(user.getLastLogin());
				
				tsquery ="UPDATE userslist SET lastlogin = NOW() WHERE email='" + emailId +"'";
				System.out.println(tsquery);
				ps= con.prepareStatement(tsquery);
				if(ps.executeUpdate() == 0)
				{
					System.out.println("Update for lastLogin failed");
					return null;
				}
			}
			else
			{
				System.out.println("Invalid Login");
				return null;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}finally{
			connectionPool.free(con);
			ps.close();
		}	
		return user;
	}
	
public String[] getData(String sqlquery) throws SQLException
	{		
		ArrayList<String> a = new ArrayList<String>();
		try {
			System.out.println("Runing Query on DB :" +sqlquery);
			ps= con.prepareStatement(sqlquery);
			rs1= ps.executeQuery();	

			if (rs1.next()) {
				
				a.add(rs.getString(1));
				System.out.println(a);
				System.out.println("Successful fetch");
			}
			else
			{
				System.out.println("Invalid Fetch");
				return null;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}finally{
			connectionPool.free(con);
			ps.close();
		}	
		return (String[]) a.toArray(new String[a.size()]);
	}

public Item[] displayItem(String category) throws SQLException{
	
		String query;
		String countQuery;
		int Count = 0;
		int index=0;
		Item[] itemAll = null;
				
		try {
				query = "select * from " + category;
				countQuery = "select count(1) from " + category;
				
				ps= con.prepareStatement(countQuery);
				rs= ps.executeQuery();
				
				if (rs.next()) {
					 Count = rs.getInt(1);
				}
				
				itemAll = new Item[Count];
				
				ps= con.prepareStatement(query);
				rs= ps.executeQuery();
				
while (rs.next()) {
					Item item = new Item();
						
		if(category.equalsIgnoreCase("Restaurants"))
		{
					item.setItemId(rs.getInt("idrestaurants"));
					item.setItemName(rs.getString("res_name"));
					item.setItemBanner(rs.getString("res_img"));
					item.setItemAddress(rs.getString("res_address"));
					item.setItemReview(rs.getString("res_review"));
					item.setItemRating(rs.getString("res_rating"));
					item.setCity(rs.getString("res_city"));
		}
		else if(category.equalsIgnoreCase("Food"))
		{
					item.setItemId(rs.getInt("idfood"));
					item.setItemName(rs.getString("food_name"));
					item.setItemBanner(rs.getString("food_img"));
					item.setItemAddress(rs.getString("food_address"));
					item.setItemReview(rs.getString("food_review"));
					item.setItemRating(rs.getString("food_rating"));
					item.setCity(rs.getString("food_city"));
		}
		else if(category.equalsIgnoreCase("Nightlife"))
		{
					item.setItemId(rs.getInt("nightlifeid"));
					item.setItemName(rs.getString("nightlife_name"));
					item.setItemBanner(rs.getString("nightlife_img"));
					item.setItemAddress(rs.getString("nightlife_address"));
					item.setItemReview(rs.getString("nightlife_review"));
					item.setItemRating(rs.getString("nightlife_rating"));
					item.setCity(rs.getString("nightlife_city"));

		}
		else if(category.equalsIgnoreCase("Japanese"))
		{
					item.setItemId(rs.getInt("japaneseid"));
					item.setItemName(rs.getString("japanese_name"));
					item.setItemBanner(rs.getString("japanese_img"));
					item.setItemAddress(rs.getString("japanese_address"));
					item.setItemReview(rs.getString("japanese_review"));
					item.setItemRating(rs.getString("japanese_rating"));
					item.setCity(rs.getString("japanese_city"));
		}
		else if(category.equalsIgnoreCase("coffee"))
		{
					item.setItemId(rs.getInt("coffeeid"));
					item.setItemName(rs.getString("coffee_name"));
					item.setItemBanner(rs.getString("coffee_img"));
					item.setItemAddress(rs.getString("coffee_address"));
					item.setItemReview(rs.getString("coffee_review"));
					item.setItemRating(rs.getString("coffee_rating"));
					item.setCity(rs.getString("coffee_city"));
		}
		else if(category.equalsIgnoreCase("chinese"))
		{
					item.setItemId(rs.getInt("chineseid"));
					item.setItemName(rs.getString("chinese_name"));
					item.setItemBanner(rs.getString("chinese_img"));
					item.setItemAddress(rs.getString("chinese_address"));
					item.setItemReview(rs.getString("chinese_review"));
					item.setItemRating(rs.getString("chinese_rating"));
					item.setCity(rs.getString("chinese_city"));
		}
		else if(category.equalsIgnoreCase("bars"))
		{
					item.setItemId(rs.getInt("barsid"));
					item.setItemName(rs.getString("bars_name"));
					item.setItemBanner(rs.getString("bars_img"));
					item.setItemAddress(rs.getString("bars_address"));
					item.setItemReview(rs.getString("bars_review"));
					item.setItemRating(rs.getString("bars_rating"));
					item.setCity(rs.getString("bars_city"));
		}
		else if(category.equalsIgnoreCase("beauty"))
		{
					item.setItemId(rs.getInt("beautyid"));
					item.setItemName(rs.getString("beauty_name"));
					item.setItemBanner(rs.getString("beauty_img"));
					item.setItemAddress(rs.getString("beauty_address"));
					item.setItemReview(rs.getString("beauty_review"));
					item.setItemRating(rs.getString("beauty_rating"));
					item.setCity(rs.getString("beauty_city"));
		}
		else if(category.equalsIgnoreCase("automotive"))
		{
					item.setItemId(rs.getInt("autoid"));
					item.setItemName(rs.getString("auto_name"));
					item.setItemBanner(rs.getString("auto_img"));
					item.setItemAddress(rs.getString("auto_address"));
					item.setItemReview(rs.getString("auto_review"));
					item.setItemRating(rs.getString("auto_rating"));
					item.setCity(rs.getString("auto_city"));

		}
		else if(category.equalsIgnoreCase("home"))
		{
					item.setItemId(rs.getInt("homeid"));
					item.setItemName(rs.getString("home_name"));
					item.setItemBanner(rs.getString("home_img"));
					item.setItemAddress(rs.getString("home_address"));
					item.setItemReview(rs.getString("home_review"));
					item.setItemRating(rs.getString("home_rating"));
					item.setCity(rs.getString("home_city"));
		}
		else if(category.equalsIgnoreCase("health"))
		{
					item.setItemId(rs.getInt("healthid"));
					item.setItemName(rs.getString("health_name"));
					item.setItemBanner(rs.getString("health_img"));
					item.setItemAddress(rs.getString("health_address"));
					item.setItemReview(rs.getString("health_review"));
					item.setItemRating(rs.getString("health_rating"));
					item.setCity(rs.getString("health_city"));

		}
		else if(category.equalsIgnoreCase("local"))
		{
					item.setItemId(rs.getInt("localid"));
					item.setItemName(rs.getString("local_name"));
					item.setItemBanner(rs.getString("local_img"));
					item.setItemAddress(rs.getString("local_address"));
					item.setItemReview(rs.getString("local_review"));
					item.setItemRating(rs.getString("local_rating"));
					item.setCity(rs.getString("local_city"));
		}
		else
		{
					item.setItemId(rs.getInt("idrotd"));
					item.setItemName(rs.getString("rotd_content"));
					//item.setItemBanner(rs.getString("local_img"));
					item.setItemAddress(rs.getString("rotd_date"));
					item.setItemReview(rs.getString("rotd_user"));
					//item.setItemRating(rs.getString("local_rating"));
					item.setCity(rs.getString("rotd_location"));
		}

					itemAll[index] = item;
					index++;
	}
				
	}
		 catch (SQLException e) {
			e.printStackTrace();
		}finally{
			connectionPool.free(con);ps.close();
		}
		System.out.println("itemAll : " + itemAll);
		return itemAll; 

	}

	
public String insertFormData(String type, int id, String aname, String aaddress, String areview, String arating, String acity) throws SQLException
{
	
	String result = "";
	String fquery="";
	int rowcount=0;

	ps = null;
	try{
	 	
		if(type.equalsIgnoreCase("Restaurants"))
		{
			fquery = "Insert into restaurants(idrestaurants,res_name,res_address,res_review,res_rating,res_city) " +
								"values( '" +id  +"', '" +aname  +"', '" +aaddress  +"', '" +areview  +"', '" +arating  +"', '" +acity+ "')";
		}
		else if(type.equalsIgnoreCase("Food"))
		{
			fquery = "Insert into food(idfood,food_name,food_address,food_review,food_rating,food_city) " +
								"values( '" +id  +"', '" +aname  +"', '" +aaddress  +"', '" +areview  +"', '" +arating  +"', '" +acity+ "')";
		}
		else if(type.equalsIgnoreCase("Nightlife"))
		{
			fquery = "Insert into nightlife(nightlifeid,nightlife_name,nightlife_address,nightlife_review,nightlife_rating,nightlife_city) " +
								"values( '" +id  +"', '" +aname  +"', '" +aaddress  +"', '" +areview  +"', '" +arating  +"', '" +acity+ "')";
		}
		else if(type.equalsIgnoreCase("Japanese"))
		{
			fquery = "Insert into japanese(japaneseid,japanese_name,japanese_address,japanese_review,japanese_rating,japanese_city) " +
								"values( '" +id  +"', '" +aname  +"', '" +aaddress  +"', '" +areview  +"', '" +arating  +"', '" +acity+ "')";
		}
		else if(type.equalsIgnoreCase("coffee"))
		{
			fquery = "Insert into coffee(coffeeid,coffee_name,coffee_address,coffee_review,coffee_rating,coffee_city) " +
								"values( '" +id  +"', '" +aname  +"', '" +aaddress  +"', '" +areview  +"', '" +arating  +"', '" +acity+ "')";
		}
		else if(type.equalsIgnoreCase("chinese"))
		{
			fquery = "Insert into chinese(chineseid,chinese_name,chinese_address,chinese_review,chinese_rating,chinese_city) " +
								"values( '" +id  +"', '" +aname  +"', '" +aaddress  +"', '" +areview  +"', '" +arating  +"', '" +acity+ "')";
		}
		else if(type.equalsIgnoreCase("bars"))
		{
			fquery = "Insert into bars(barsid,bars_name,bars_address,bars_review,bars_rating,bars_city) " +
								"values( '" +id  +"', '" +aname  +"', '" +aaddress  +"', '" +areview  +"', '" +arating  +"', '" +acity+ "')";
		}
		else if(type.equalsIgnoreCase("beauty"))
		{
			fquery = "Insert into beauty(beautyid,beauty_name,beauty_address,beauty_review,beauty_rating,beauty_city) " +
								"values( '" +id  +"', '" +aname  +"', '" +aaddress  +"', '" +areview  +"', '" +arating  +"', '" +acity+ "')";
		}
		else if(type.equalsIgnoreCase("automotive"))
		{
			fquery = "Insert into automotive(autoid,auto_name,auto_address,auto_review,auto_rating,auto_city) " +
								"values( '" +id  +"', '" +aname  +"', '" +aaddress  +"', '" +areview  +"', '" +arating  +"', '" +acity+ "')";
		}
		else if(type.equalsIgnoreCase("home"))
		{
			fquery = "Insert into home(homeid,home_name,home_address,home_review,home_rating) " +
								"values( '" +id  +"', '" +aname  +"', '" +aaddress  +"', '" +areview  +"', '" +arating  +"', '" +acity+ "')";
		}
		else if(type.equalsIgnoreCase("health"))
		{
			fquery = "Insert into health(healthid,health_name,health_address,health_review,health_rating) " +
								"values( '" +id  +"', '" +aname  +"', '" +aaddress  +"', '" +areview  +"', '" +arating  +"', '" +acity+ "')";
		}
		else
		{
			fquery = "Insert into local(localid,local_name,local_address,local_review,local_rating) " +
								"values( '" +id  +"', '" +aname  +"', '" +aaddress  +"', '" +areview  +"', '" +arating  +"', '" +acity+ "')";
		}

		System.out.println(fquery);
	    ps = con.prepareStatement(fquery);
	    rowcount =ps.executeUpdate();

	    if(rowcount >0)
		{
			result = "true";
			System.out.println("Insert Successful");
		}
		else
		{
			result = "false";
			System.out.println("The data could not be inserted into the database.");
		}
	}
	catch(SQLException e){
		result = "false";

		e.printStackTrace();
	}finally{
		connectionPool.free(con);ps.close();
	}

	return result;
}

public boolean createCategory(String catName) throws SQLException{
	int rowcount=0;
		boolean result=false;
		
		String tableName = "CREATE TABLE foodiesdb." + catName + " (" 
            + "idNo INT(64) NOT NULL,"  
            + "name VARCHAR(100)," 
            + "address VARCHAR(200),"  
            + "review LONGTEXT,"
            + "rating VARCHAR(50),"
            + "city VARCHAR(45))";
		System.out.println(tableName);		
		try {
				ps=(PreparedStatement) con.prepareStatement(tableName);
				rowcount = ps.executeUpdate();
				if(rowcount>0)
				{
					result=true;
				}
				
			}
		 catch (SQLException e) {
			e.printStackTrace();
		}finally{
			connectionPool.free(con);ps.close();
		}
		return result;
	}
	
public boolean updateCategory(String firstName, String lastName) throws SQLException{
		int rowcount=0;
		boolean result=false;
		String uquery = "ALTER TABLE foodiesdb."+firstName+" RENAME TO foodiesdb."+lastName;
		
		try {
				ps=(PreparedStatement) con.prepareStatement(uquery);
				rowcount = ps.executeUpdate();
				if(rowcount>0)
				{
					result=true;
				}
				
			}
		 catch (SQLException e) {
			e.printStackTrace();
		}finally{
			connectionPool.free(con);ps.close();
		}
		return result;
	}

	public boolean deleteCategory(String delName) throws SQLException{
		
		boolean result=false;
		String dquery = "DROP TABLE foodiesdb."+delName;
		
		try {
				ps=(PreparedStatement) con.prepareStatement(dquery);
				int rowsDeleted = ps.executeUpdate();
				if(rowsDeleted>0)
				{
					result=true;
				}
				
			}
		 catch (SQLException e) {
			e.printStackTrace();
		}finally{
			connectionPool.free(con);ps.close();
		}
		return result;
	}

	public Search[] searchstring(String searchname,String city) throws SQLException{
		
		String query;
		String countQuery;
		int Count = 0;
		int index=0;
		Search[] searchAll = null;
				
		try {
				query = "select * from searchdb where (name like '%"+searchname+"%' or review like '%"+searchname+"%') or (city like '%"+city+"%' or address like '%"+city+"%')";
				countQuery = "select count(1) from searchdb";
				
				ps= con.prepareStatement(countQuery);
				rs= ps.executeQuery();
				
				if (rs.next()) {
					 Count = rs.getInt(1);
				}
				
				searchAll = new Search[Count];
				
				ps= con.prepareStatement(query);
				rs= ps.executeQuery();
				
				while (rs.next()) {
					Search search = new Search();
					search.setSearchId(rs.getInt(1));
					search.setSearchName(rs.getString(2));
					search.setSearchAddress(rs.getString(4));
					search.setSearchReview(rs.getString(5));
					search.setSearchRating(rs.getString(6));
					search.setCity(rs.getString(3));
					searchAll[index] = search;
					index++;
				}
				
				if(index>0)
				{
					System.out.println("Search found");
				}
				else
				{
					System.out.println("Search not found");
					return null;
				}
			}
		 catch (SQLException e) {
			e.printStackTrace();
		}finally{
			connectionPool.free(con);ps.close();
		}
		
		return searchAll; 

	}
	
}

