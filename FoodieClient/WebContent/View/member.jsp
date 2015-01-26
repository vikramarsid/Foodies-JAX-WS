<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
	<title>Foodies</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" type="text/css" href="stylesheets/fonts.css"  />
	<link rel="stylesheet" type="text/css" href="stylesheets/style.css"  />
    <link rel="stylesheet" type="text/css" media="all" href="stylesheets/styles.css">
  <link rel="stylesheet" type="text/css" media="all" href="stylesheets/font-awesome.min.css">
  <link href="SpryAssets/SpryTabbedPanels.css" rel="stylesheet" type="text/css">
  <script src="javascripts/jquery.js"></script>
	<!--<script src="js/twitter.js"></script>-->
	<script src="javascripts/general.js"></script>
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script type="text/javascript" src="http://benalman.com/code/projects/jquery-hashchange/jquery.ba-hashchange.js"></script>
	<script type="text/javascript" src="javascripts/jquery-1.10.2.min.js"></script>
	<script src="SpryAssets/SpryTabbedPanels.js" type="text/javascript"></script>
<%@ page import=  "users.User"%>
<%@ page import=  "java.util.Date"%>
<%@ page import=  "java.text.SimpleDateFormat"%>
<%@ page import=  "java.util.Calendar"%>


</head>

<%
	HttpSession sess = request.getSession(false);
	User personDetails	= (User)sess.getAttribute("personDetails");
	session.setAttribute("personDetails", personDetails);
 %>
 
<body>
	<div id="wrapper">
		<div id="header">
		  <p><a href="" id="logo">Foodies</a></p>
		  <p>&nbsp;</p>
		  <p>&nbsp;</p>
		  <p>&nbsp;</p>
		  <p>&nbsp;</p>
		  <p>&nbsp;</p>
		  <form action="results" method="POST" name="search">
		  <table width="495" height="51" border="0" class="text">
		    <tr>
      <td height="46" class="text"><font color="#FFFFFF">Find</font></td>
      <td><label for="find"></label>
        <input name="find" type="text" id="find" value="" /></td>
      <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
      <td><font color="#FFFFFF">Near</font></td>
      <td><label for="near"></label>
        <input type="text" name="near" id="near" /></td>
      <td>
        <input type="submit" name="go" id="go" value="Go!" /></td>
            </tr>
</table>
</form>

			<ul id="menu">
			  <li class="active"><a href="home.jsp">home</a></li>
				<li><a href="">Aboutme</a></li>
				<li><a href="writereview.jsp">Write a Review</a></li>
				<li><a href="">FindFriends</a></li>
				<li><a href="">Messages</a></li>
                <li><a href="">Talk</a></li>
                <li><a href="">Events</a></li>
		  </ul>
			<div class="cb"></div>
		</div>
<% 
	Calendar TimeStop = personDetails.getLastLogin();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   String TimeStop_Str = sdf.format(TimeStop.getTime());
%>		
		<div id="main">
		  <div class="content">
          <center>
            <h2>&nbsp;</h2>      
            <div align="right">Last Login <%= TimeStop_Str%>
			</div>
            <h1>Welcome <%= personDetails.getFirstName() %> <%= personDetails.getLastName() %></h1>
            <p><!--<h2><font face="Tahoma, Geneva, sans-serif" size="-1" color="#000099">Signed Up at : now() </font></h2>-->            </p>
            <p>
          <br>
            <div id="user" class="TabbedPanels">
              <ul class="TabbedPanelsTabGroup">
                <li class="TabbedPanelsTab" tabindex="0">Personal Details</li>
                <li class="TabbedPanelsTab" tabindex="0">WriteReview</li>
              </ul>
              <div class="TabbedPanelsContentGroup">
                <div class="TabbedPanelsContent">
                
				<table align='center' style=" float:left; font-family:Verdana, Geneva, sans-serif; font-size:12px" border="1">
					<tr>
						<td><strong>Membership
									Id: </strong></td>
						<td><%=personDetails.getMembershipId()%></td>
					</tr>

					<tr>
						<td><strong>Name:</strong></td>
						<td><%=personDetails.getFirstName() + " "
					+ personDetails.getLastName()%></td>
					</tr>


					<tr>
						<td><strong>Date of Birth:</strong></td>
						<td><%=personDetails.getDob()%></td>
					</tr>
                    
                    <tr>
						<td><strong>Email:</strong></td>
						<td><%=personDetails.getEmailId()%></td>
					</tr>
                    
                    <tr>
						<td><strong>Gender:</strong></td>
						<td><%=personDetails.getGender()%></td>
					</tr>
					
					<tr>
						<td><strong>SignUp Date:</strong></td>
						<td><%=personDetails.getSignupDate()%></td>
					</tr>
				
				</table>
                
                </div>
                <div class="TabbedPanelsContent">
                <br>
                <br>
                <h2><a href="writereview.jsp"><u><em>Write Review</em></u></a></h2>
                <br>
                <br>
                </div>
              </div>
            </div>
            <p><br>
          </center>
          <blockquote>
            <p><br />
            </p>
            </p>
          </blockquote>
          <center>
            <p>Thank You for Signing Up with Us !!</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <input onclick="location.href='home.jsp'" name="home" type="button" value="Get Started" />
          </center>
		  </div>
				
		    <div class="services">
		      <div class="separator">&nbsp;</div>
				<div class="cb"></div>
		  </div>
	      <span class="footer"><img src="images/footer.png" width="848" height="209" alt="footer" /></span></div>
		
		<div class="credit"><font color="#330000">CmpE 273 Lab Assignement(Fall 2014)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CopyRight - Vikram Arsid</font></div>
		
	</div>
<script type="text/javascript">
var TabbedPanels1 = new Spry.Widget.TabbedPanels("user");
    </script>
</body>
</html>