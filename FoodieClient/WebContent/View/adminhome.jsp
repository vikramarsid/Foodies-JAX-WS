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
<link href="SpryAssets/SpryTabbedPanels.css" rel="stylesheet" type="text/css">
<script src="javascripts/jquery.js"></script>
<script src="javascripts/general.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript" src="http://benalman.com/code/projects/jquery-hashchange/jquery.ba-hashchange.js"></script>
<script type="text/javascript" src="javascripts/jquery-1.10.2.min.js"></script>
<script src="SpryAssets/SpryTabbedPanels.js" type="text/javascript"></script>
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
			  <li class="active"><a href="home">home</a></li>
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
			<h1><font face="Trebuchet MS, Arial, Helvetica, sans-serif" size="+3">Welcome Admin !!</font></h1>
            <br />
            <div id="TabbedPanels1" class="TabbedPanels">
              <ul class="TabbedPanelsTabGroup">
                <li class="TabbedPanelsTab" tabindex="0">CreateCategory</li>
                <li class="TabbedPanelsTab" tabindex="1">UpdateCategory</li>
                <li class="TabbedPanelsTab" tabindex="2">DeleteCategory</li>
                <li class="TabbedPanelsTab" tabindex="3">AddElements</li>
              </ul>
              <div class="TabbedPanelsContentGroup">
                <div class="TabbedPanelsContent" style="text-align:left">
                <p>Please enter the category name</p><br>
                  <form action="adminhome" method="post" name="create">
                  <input name="create" type="text" size="50">
                  <input name="csubmit" type="submit" value="Insert Category>>">
                  </form>
                  <br>
                  <br>
                </div>
                <div class="TabbedPanelsContent" style="text-align:left">
                <p>Please select existing category name</p><br>
                  <form action="adminhome" method="post" name="update">
                    <p>
                      <select name="updatelist">
                        <option value="Restaurants">Restaurants</option>
                        <option value="Food">Food</option>
                        <option value="Nightlife">Nightlife</option>
                        <option value="Japanese">Japanese</option>
                        <option value="coffee">coffee</option>
                        <option value="chinese">chinese</option>
                        <option value="bars">bars</option>
                        <option value="beauty">beauty</option>
                        <option value="automotive">automotive</option>
                        <option value="home">home Services</option>
                        <option value="health">health & Medical</option>
                        <option value="local">local Services</option>
                        <option value="rotd">Review of the Day</option>
                      </select>
                    </p>
                    <p>&nbsp;</p>
                    <p>Please enter new category name                      <br>
                      <input name="newupdate" type="text" size="50">
                      <input name="usubmit" type="submit" value="Update Category>>">
                    </p>
                  </form>
                  <br>
                  <br>
                </div>
                <div class="TabbedPanelsContent" style="text-align:left">
                <p>Please select category name to be deleted</p><br>
                  <form action="adminhome" method="post" name="delete">
                    <p>
                      <select name="delupdatelist">
                        <option value="Restaurants">Restaurants</option>
                        <option value="Food">Food</option>
                        <option value="Nightlife">Nightlife</option>
                        <option value="Japanese">Japanese</option>
                        <option value="coffee">coffee</option>
                        <option value="chinese">chinese</option>
                        <option value="bars">bars</option>
                        <option value="beauty">beauty</option>
                        <option value="automotive">automotive</option>
                        <option value="home">home Services</option>
                        <option value="health">health & Medical</option>
                        <option value="local">local Services</option>
                        <option value="rotd">Review of the Day</option>
                      </select>
                    </p>
                    <p>&nbsp;</p>
                    <p><br>
                       <input name="dsubmit" type="submit" value="delete Category>>">
                    </p>
                  </form>
                  <br>
                  <br>
                </div>
                <div class="TabbedPanelsContent" style="text-align:left">
                <p>&nbsp;</p>
                <form name="form0" method="post" action="writereview">
                  <input name="add" type="button" value="Click to add new elements>>">
                  </form>
                  <p>&nbsp;</p>
                </div>
              </div>
            </div>
            <br />
            <form name="form1" method="post" action="home">
             <input type="submit" name="logout" id="logout" value="LogOut">
            </form>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
          </center>
		  </div>
				
		    <div class="services">
		      <div class="separator">&nbsp;</div>
				<div class="cb"></div>
		  </div>
	      <span class="footer"><img src="images/footer.png" width="848" height="209" alt="footer" /></span></div>
		
		<div class="credit"><font color="#330000">CmpE 273 Lab Assignment(Fall 2014)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CopyRight - Vikram Arsid</font></div>
		
	</div>
<script type="text/javascript">
var TabbedPanels1 = new Spry.Widget.TabbedPanels("TabbedPanels1");
    </script>
</body>

</html>