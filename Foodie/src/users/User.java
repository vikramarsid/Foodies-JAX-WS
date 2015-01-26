package users;


import java.util.Date;

public class User {

	private long membershipId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String gender;
	private String city;
	private String dob;
	private String signupDate;
	private Date lastLogin;
	//java.util.ArrayList<Transactions>  transactions= new java.util.ArrayList<Transactions>();//SNEHAL
	
	public User(long membershipId, String firstName, String lastName, String emailId, String password, String gender, String city, String dob, String signupDate, Date lastLogin)
	{
		this.membershipId = membershipId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.gender = gender;
		this.city = city;
		this.dob = dob;
		this.signupDate = signupDate;
		this.lastLogin = lastLogin;
	}
	
	public User(){
		
	}
	
	public long getMembershipId() {
		return membershipId;
	}
	public void setMembershipId(long membershipId) {
		this.membershipId = membershipId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getsignupDate() {
		return signupDate;
	}
	public void setRegistrationDate(String signupDate) {
		this.signupDate = signupDate;
	}

	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
		
}
