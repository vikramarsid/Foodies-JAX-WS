<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
			  <li class="active"><a href="home.jsp">home</a></li>
				<li><a href="">Aboutme</a></li>
				<li><a href="writereview">Write a Review</a></li>
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
			<h1><font face="Trebuchet MS, Arial, Helvetica, sans-serif" size="+3">Review Successfully Submitted !!</font></h1>
            <br />
            <br />
            <p>Thank You for Submitting !!</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
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