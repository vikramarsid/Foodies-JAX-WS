<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Foodies</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
          <!-- -->
          
          <h2>Write a review</h2>
      <form id="review" action="writereview" method="post" name="review" onsubmit="return validate()">
        <label><h4>&nbsp;</h4></label>
        <p>
        <h4>Subject</h4>
        <input name="subject" type="text" size="50" />
        </p>
        
        <p>
        <h4>Category</h4>
        <select name="category">
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
        </select>
        </p>
        
        <p>
        <h4>Location</h4>
      <textarea name="locations" cols="50" rows="5"></textarea>
        </p>
        
        <p>
        <h4>City</h4>
        <input name="city" type="text" size="50" />
        </p>
        <br/>
        
        <p>
        <h4>Rating</h4>
        <p>
          <label>
            <input type="radio" name="Rating" value="Excellent" id="Rating_0" />
            Excellent</label>
          <br />
          <label>
            <input type="radio" name="Rating" value="Good" id="Rating_1" />
            Good</label>
          <br />
          <label> 
            <input type="radio" name="Rating" value="Fair" id="Rating_2" />
            Fair</label>
          <br />
          <label>
            <input type="radio" name="Rating" value="Poor" id="Rating_3" />
            Poor</label>
          <br />
          <label>
            <input type="radio" name="Rating" value="Disaster" id="Rating_4" />
            Disaster</label>
          <br />
      </p>
</p>
        
        <p>
        <h4>Review</h4>
      <textarea name="review" cols="50" rows="7"></textarea>
        </p>
        
        <p>
        <h4>Email</h4>
        <p>
          <input name="email" type="text" size="50" />
          </p>
        </p>
        <p>&nbsp; </p>
        <p>
        <button type="submit">Submit</button>
        </p>
              
        </form>
               
         <!-- -->
          </div>
                
            <div class="services">
              <div class="separator">&nbsp;</div>
                <div class="cb"></div>
          </div>
          <span class="footer"><img src="images/footer.png" width="848" height="209" alt="footer" /></span></div>
        
        <div class="credit"><font color="#330000">CmpE 273 Lab Assignement(Fall 2014)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CopyRight - Vikram Arsid</font></div>
        
    </div>
    <script type="text/javascript">
    function validate() {
        var subject = document.forms["review"]["subject"].value;
        var locations = document.forms["review"]["locations"].value;
        var city = document.forms["review"]["city"].value;
        var review = document.forms["review"]["review"].value;
        var email = document.forms["review"]["email"].value;
        var alpha = /^[a-zA-Z0-9 ]+$/;
        var pattern = /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
        
        if (subject == "" || locations == "" || city == "" || review == "" || email == "") {
            alert('Please complete the review form');
            return false;
        }
        else if (!subject.match(alpha)) {
            alert('Please enter alphanumeric subject only');       
            return false;
       }
        else if (!locations.match(alpha)) {
            alert('Please enter alphanumeric locations only');       
            return false;
       }
        else if (!city.match(alpha)) {
            alert('Please enter alphanumeric city only');       
            return false;
       }
        else if (!review.match(alpha)) {
            alert('Please provide your review in alphabets and numbers only');       
            return false;
       }
        else if (!email.match(pattern)) {
            alert('Please provide your email in proper format');       
            return false;
       }
       else 
       {
        return true;
       }
    }
    </script>
</body>
</html>