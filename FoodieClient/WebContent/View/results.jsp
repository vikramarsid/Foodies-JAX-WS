<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import=  "users.Search"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Foodies</title>
<link rel="stylesheet" type="text/css" href="stylesheets/fonts.css"  />
<link rel="stylesheet" type="text/css" href="stylesheets/style.css"  />
<link rel="stylesheet" type="text/css" media="all" href="stylesheets/styles.css">
<link rel="stylesheet" type="text/css" media="all" href="stylesheets/font-awesome.min.css">

<script src="javascripts/jquery.js"></script>
<script src="javascripts/general.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript" src="http://benalman.com/code/projects/jquery-hashchange/jquery.ba-hashchange.js"></script>
<script type="text/javascript" src="javascripts/jquery-1.10.2.min.js"></script>
</head>
<%
	HttpSession sess = request.getSession(false);

	Search[] search	= (Search[])sess.getAttribute("search");
 %>
<body>
	<div id="wrapper">
		<div id="header">
		  <p><a href="" id="logo">Foodies</a> 
	      </p>
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
			  <li class="active"><a href="/">home</a></li>
				<li><a href="">Aboutme</a></li>
				<li><a href="writereview.jsp">Write a Review</a></li>
				<li><a href="">FindFriends</a></li>
				<li><a href="">Messages</a></li>
                <li><a href="">Talk</a></li>
                <li><a href="">Events</a></li>
		  </ul>
			<div class="cb"></div>
		</div>
		
		<div id="main">
		  <div class="content">
          <center>
			<H2 ALIGN="CENTER">Search Results</H2>
					
					<%
					if (search == null) {
						out.println("<h3 align='center'>No results found</h3>");
					} else {
				%>
										
					<TABLE style="font-family:Verdana, Geneva, sans-serif;font-size:16px">
						<TR>
						<td>No</td>
						<TD>Name</TD>
						<TD>Address</TD>
						<TD>Review</TD>
						<TD>Rating</TD>
						<TD>City</TD>
						</TR>
						<%for(int i=0;i<search.length;i++){ %>
						<TR style="font-size:12px">
                        <TD><%=(i+1) %></TD>
                        <TD><%=search[i].getSearchName()%></TD>
						<TD><%=search[i].getSearchAddress()%></TD>
						<TD><%=search[i].getSearchReview()%></TD>
						<TD><%=search[i].getSearchRating()%></TD>
						<TD><%=search[i].getCity()%></TD>
						<%}}%>
						</TR>				
					
						
				</TABLE>
            <input onclick="location.href='home'" name="home" type="button" value="Get Back" />
            </center>
		  </div>
				
		    <div class="services">
		      <div class="separator">&nbsp;</div>
				<div class="cb"></div>
		  </div>
	      <span class="footer"><img src="images/footer.png" width="848" height="209" alt="footer" /></span></div>
		
		<div class="credit"><font color="#330000">CmpE 273 Lab Assignment(Fall 2014)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CopyRight - Vikram Arsid</font></div>
		
	</div>
	
		
</body>

</html>