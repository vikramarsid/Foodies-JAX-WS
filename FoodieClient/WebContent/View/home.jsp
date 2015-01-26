<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import=  "users.Item"%>
<%@ page import=  "java.util.Date"%>
<%@ page import=  "java.text.SimpleDateFormat"%>
<%@ page import=  "java.util.Calendar"%>
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
	<!--<script src="js/twitter.js"></script>-->
	<script src="javascripts/general.js"></script>
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script type="text/javascript" src="http://benalman.com/code/projects/jquery-hashchange/jquery.ba-hashchange.js"></script>
	<script type="text/javascript" src="javascripts/jquery-1.10.2.min.js"></script>
</head>

<%
	HttpSession sess = request.getSession(false);
	Item[] disp	= (Item[])sess.getAttribute("disp");
	Item[] food	= (Item[])sess.getAttribute("food");
	Item[] rotd	= (Item[])sess.getAttribute("rotd");
	
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
			  <li class="active"><a href="">home</a></li>
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
				
				<div class="slider">
					
					<table width="297" height="28" border="0">
  <tr>
    <td width="147"><a href="signup.jsp" class="myButton">SignUp</a></td>
    <td width="140"><a href="signin.jsp" class="myButton">LogIn</a></td>
  </tr>
  </table>
<img src="images/sliderimage1.png" class="left sliderimage">
				
					<div class="items right">
						<div class="item opened yellow">
							<h3>Review of the Day</h3>
							<p style=" font-size:12px"><%out.println(rotd[0].getItemName());%></p><br>
							<p style=" font-size:12px"><%out.println(rotd[0].getItemReview());%> <%out.println(rotd[0].getCity());%> <%out.println(rotd[0].getItemAddress());%></p>
							<p style=" font-size:12px"></p>
							<p style=" font-size:12px"></p>
							<img src="images/sliderimage1.png" class="hide">
					  </div>
						<div class="item closed orange">
							<h3>Popular Events</h3>
							<p style=" font-size:16px"><%out.println(rotd[1].getItemName());%></p>
							<p style=" font-size:12px"><%out.println(rotd[1].getItemAddress());%></p>
							<p style=" font-size:12px"><%out.println(rotd[1].getItemReview());%></p>
							<p style=" font-size:12px"><%out.println(rotd[1].getCity());%></p>
							<img src="images/sliderimage2.png" class="hide">
					  </div>
						<div class="item closed red">
						  <h3>Today in Talk</h3>
							<p style=" font-size:16px"><%out.println(rotd[2].getItemName());%></p>
							<p style=" font-size:12px"><%out.println(rotd[2].getItemAddress());%></p>
							<p style=" font-size:14px"><%out.println(rotd[2].getItemReview());%></p>
							<p style=" font-size:14px"><%out.println(rotd[2].getCity());%></p>
							<img src="images/sliderimage1.png" class="hide">
					  </div>
				  </div>
					<div class="cb"></div>
			  </div>
				
			  <div class="services">
					
					<div class="servicer">
					<h2>Best of Foodies</h2>
					                                         <!--//////////////////////////////////////////////////////////////////////////////////////////////////// -->
                     <!--//////////////////////////////////////////////////////////////////////////////////////////////////// -->
                    <div id="w" class="clearfix">
    <ul id="sidemenu">
      <li>
        <a href="#Restaurants-content" class="open"><strong>Restaurants</strong></a>
      </li>

      <li>
        <a href="#Food-content"><strong>Food</strong></a>
      </li>
      
      <li>
        <a href="#Shopping-content"><strong>Shopping</strong></a>
      </li>
      
      <li>
        <a href="#Nightlife-content"><strong>Nightlife</strong></a>
      </li>
      
       <li>
        <a href="#Japanese-content"><strong>Japanese</strong></a>
      </li>
      
       <li>
        <a href="#Coffee-content"><strong>Coffee</strong></a>
      </li>
      
       <li>
        <a href="#Chinese-content"><strong>Chinese</strong></a>
      </li>
      
       <li>
        <a href="#Bars-content"><strong>Bars</strong></a>
      </li>
      
      <li>
        <a href="#Beauty-content"><strong>Beauty/Spa</strong></a>
      </li>
      
      <li>
        <a href="#Auto-content"><strong>Automotive</strong></a>
      </li>
      
      <li>
        <a href="#Homeserv-content"><strong>Home Services</strong></a>
      </li>
      
      <li>
        <a href="#Health-content"><strong>Health/Medical</strong></a>
      </li>
      
      <li>
        <a href="#More-content"><strong>More Categories</strong></a>
      </li>
      
      
    </ul>
    
    <div id="content">
        <div id="Restaurants-content" class="contentblock">
          <h1>Restaurants!</h1>
          <table width="679" height="347" border="0" style="font-size:14px;float:left; font: Arial, Helvetica, sans-serif; font-weight:400">
  <tr>
    <td><img src="<%out.println(disp[0].getItemBanner());%>" width="94" height="63" alt="No View" /></td>
    <td><strong><%out.println(disp[0].getItemName());%></strong><br>
    Review: <%out.println(disp[0].getItemReview());%><br>
    Rating: <%out.println(disp[0].getItemRating());%></td>
  </tr>
  <tr>
    <td><img src="<%out.println(disp[1].getItemBanner());%>" width="94" height="63" alt="No View" /></td>
    <td><strong><%out.println(disp[1].getItemName());%></strong><br>
    Review: <%out.println(disp[1].getItemReview());%><br>
    Rating: <%out.println(disp[1].getItemRating());%></td>
  </tr>
  <tr>
    <td><img src="<%out.println(disp[2].getItemBanner());%>" width="94" height="63" alt="No View" /></td>
    <td><strong><%out.println(disp[2].getItemName());%></strong><br>
    Review: <%out.println(disp[2].getItemReview());%><br>
    Rating: <%out.println(disp[2].getItemRating());%></td>
  </tr>
  <tr>
    <td><img src="<%out.println(disp[3].getItemBanner());%>" width="94" height="63" alt="No View" /></td>
    <td><strong><%out.println(disp[3].getItemName()+"\n");%></strong><br>
    Review: <%out.println(disp[3].getItemReview()+"\n");%><br>
    Rating: <%out.println(disp[3].getItemRating()+"\n");%></td>
  </tr>
  <tr>
    <td><img src="<%out.println(disp[4].getItemBanner());%>" width="94" height="63" alt="No View" /></td>
    <td><strong><%out.println(disp[4].getItemName()+"\n");%></strong><br>
    Review: <%out.println(disp[4].getItemReview()+"\n");%><br>
    Rating: <%out.println(disp[4].getItemRating()+"\n");%></td>
  </tr>
</table>

          </div><!-- @end #home-content -->
        
        
        <div id="Food-content" class="contentblock hidden">
          <h1>Food</h1>
          <table width="679" height="303" border="0" style="font-size:14px;float:left; font: Arial, Helvetica, sans-serif; font-weight:400">
  <tr>
    <td><img src="<%out.println(food[0].getItemBanner());%>" width="94" height="63" alt="No View" /></td>
    <td><strong><%out.println(food[0].getItemName());%></strong><br>
    Review: <%out.println(food[0].getItemReview());%><br>
    Rating: <%out.println(food[0].getItemRating());%></td>
  </tr>
  <tr>
    <td><img src="<%out.println(food[1].getItemBanner());%>" width="94" height="63" alt="No View" /></td>
    <td><strong><%out.println(food[1].getItemName());%></strong><br>
    Review: <%out.println(food[1].getItemReview());%><br>
    Rating: <%out.println(food[1].getItemRating());%></td>
  </tr>
  <tr>
    <td><img src="<%out.println(food[2].getItemBanner());%>" width="94" height="63" alt="No View" /></td>
    <td><strong><%out.println(food[2].getItemName());%></strong><br>
    Review: <%out.println(food[2].getItemReview());%><br>
    Rating: <%out.println(food[2].getItemRating());%></td>
  </tr>
  <tr>
    <td><img src="<%out.println(food[3].getItemBanner());%>" width="94" height="63" alt="No View" /></td>
    <td><strong><%out.println(food[3].getItemName());%></strong><br>
    Review: <%out.println(food[3].getItemReview());%><br>
    Rating: <%out.println(food[3].getItemRating());%></td>
  </tr>
  <tr>
    <td><img src="<%out.println(food[4].getItemBanner());%>" width="94" height="63" alt="No View" /></td>
    <td><strong><%out.println(food[4].getItemName());%></strong><br>
    Review: <%out.println(food[4].getItemReview());%><br>
    Rating: <%out.println(food[4].getItemRating());%></td>
  </tr>

</table>
        </div><!-- @end #about-content -->
        
        <div id="Shopping-content" class="contentblock hidden">
          <h1>Shopping</h1>
          <img src="images/w1.png" alt="WorkInProgress" width="496" height="344" />
           </div><!-- @end #ideas-content -->
        
        <div id="Nightlife-content" class="contentblock hidden">
          <h1>Nightlife</h1>
		<img src="images/w1.png" alt="WorkInProgress" width="496" height="344" />
          <br><br>
         </div><!-- @end #content -->
         
         <div id="Japanese-content" class="contentblock hidden">
          <h1>Japanese</h1>
          <img src="images/w1.png" alt="WorkInProgress" width="496" height="344" />
        </div><!-- @end #about-content -->
        
        <div id="Coffee-content" class="contentblock hidden">
          <h1>Coffee</h1>
          <img src="images/w1.png" alt="WorkInProgress" width="496" height="344" />
        </div><!-- @end #about-content -->
        
        <div id="Chinese-content" class="contentblock hidden">
          <h1>Chinese</h1>
          <img src="images/w1.png" alt="WorkInProgress" width="496" height="344" />
        </div><!-- @end #about-content -->
        
        <div id="Bars-content" class="contentblock hidden">
          <h1>Bars</h1>
          <img src="images/w1.png" alt="WorkInProgress" width="496" height="344" />
        </div><!-- @end #about-content -->
        
        <div id="Beauty-content" class="contentblock hidden">
          <h1>Beauty</h1>
          <img src="images/w1.png" alt="WorkInProgress" width="496" height="344" />
        </div><!-- @end #about-content -->
        
        <div id="Auto-content" class="contentblock hidden">
          <h1>Auto</h1>
          <img src="images/w1.png" alt="WorkInProgress" width="496" height="344" />
        </div><!-- @end #about-content -->
        
        <div id="Homeserv-content" class="contentblock hidden">
          <h1>HomeService</h1>
          <img src="images/w1.png" alt="WorkInProgress" width="496" height="344" />
        </div><!-- @end #about-content -->
        
        <div id="Health-content" class="contentblock hidden">
          <h1>Health/Medical</h1>
          <img src="images/w1.png" alt="WorkInProgress" width="496" height="344" />
        </div><!-- @end #about-content -->
        
        <div id="More-content" class="contentblock hidden">
          <h1>More</h1>
          <img src="images/w1.png" alt="WorkInProgress" width="496" height="344" />
        </div><!-- @end #about-content -->
  </div>
  
  <script type="text/javascript">
$(function(){
  $('#sidemenu a').on('click', function(e){
    e.preventDefault();

    if($(this).hasClass('open')) {
      // do nothing because the link is already open
    } else {
      var oldcontent = $('#sidemenu a.open').attr('href');
      var newcontent = $(this).attr('href');
      
      $(oldcontent).fadeOut('fast', function(){
        $(newcontent).fadeIn().removeClass('hidden');
        $(oldcontent).addClass('hidden');
      });
      
     
      $('#sidemenu a').removeClass('open');
      $(this).addClass('open');
    }
  });
});
</script>
                     <!--//////////////////////////////////////////////////////////////////////////////////////////////////// -->
                     <!--//////////////////////////////////////////////////////////////////////////////////////////////////// -->
                        
					</div>
                    <br />
<div class="service">
<h2>&nbsp;</h2>
<h2>Recent Activity</h2>
                    
<!--//////////////////////////////////////////////////////////////////////////////////////////////////// -->
<!--//////////////////////////////////////////////////////////////////////////////////////////////////// -->
<table width="679" height="303" border="0" style="font-size:14px;float:left; font: Arial, Helvetica, sans-serif; font-weight:400; vertical-align: auto">
  <tr>
    <td width="132" height="157"><img src="<%out.println(disp[5].getItemBanner());%>" width="94" height="63" alt="No View" /></td>
    <td width="537"><strong><%out.println(disp[5].getItemName());%></strong><br>
    
    Rating: <%out.println(disp[5].getItemRating()+"\n");%> &nbsp;&nbsp;&nbsp;&nbsp; <%out.println(disp[5].getItemReview());%></td> 
  </tr>
  <tr>
    <td height="100"><img src="<%out.println(disp[6].getItemBanner());%>" width="94" height="63" alt="No View" /></td>
    <td><strong><%out.println(disp[6].getItemName());%></strong><br>
    <img src="images/bc.jpg" alt="" width="250" height="250" /><br>
    <%out.println(disp[6].getItemReview());%>
    Rating: <%out.println(disp[6].getItemRating());%>&nbsp;&nbsp;&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td height="127"><img src="<%out.println(disp[7].getItemBanner());%>" width="94" height="63" alt="No View" /></td>
    <td><strong><%out.println(disp[7].getItemName());%></strong><br>
    <%out.println(disp[7].getItemReview());%><br>
    Rating: <%out.println(disp[7].getItemRating());%>&nbsp;&nbsp;&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td height="101"><img src="<%out.println(disp[8].getItemBanner());%>" width="94" height="63" alt="No View" /></td>
    <td><strong><%out.println(disp[8].getItemName());%></strong><br>
    <%out.println(disp[8].getItemReview());%><br>
    Rating: <%out.println(disp[8].getItemRating());%>&nbsp;&nbsp;&nbsp;&nbsp;</td> 
  </tr>
  <tr>
    <td height="100"><img src="<%out.println(disp[9].getItemBanner());%>" width="94" height="63" alt="No View" /></td>
    <td><strong><%out.println(disp[9].getItemName());%></strong><br>
    <%out.println(disp[9].getItemReview());%><br>
    Rating: <%out.println(disp[9].getItemRating());%>&nbsp;&nbsp;&nbsp;&nbsp;</td>
  </tr>
</table>           
                     <!--//////////////////////////////////////////////////////////////////////////////////////////////////// -->
                     <!--//////////////////////////////////////////////////////////////////////////////////////////////////// -->
                    
                    </div>
                    
                    
                 <div class="servicebottom">
                    <h2>San Jose Neighborhoods</h2>
                    <table width="566" height="160" border="0" style="font-size: 14px; float: left; font: Arial, Helvetica, sans-serif; font-weight: 400; vertical-align: auto; margin: 20px;">
                      <tr>
    <td width="124">Almaden Valley</td>
    <td width="160">Alum Rock/East Foothills</td>
    <td width="132">Rose Garden</td>
    <td width="132">Berryessa</td>
  </tr>
  <tr>
    <td>Blossom Valley</td>
    <td>Buena Vista</td>
    <td>Santa Teresa</td>
    <td>Burbank</td>
  </tr>
  <tr>
    <td>Cambrian Park</td>
    <td>Downtown</td>
    <td>Seven Trees</td>
    <td>East San Jose</td>
  </tr>
  <tr>
    <td>Evergreen</td>
    <td>Fairgrounds</td>
    <td>West San Jose</td>
    <td>North Valley</td>
  </tr>
</table>
</div>
                    <!---------------------------------------------------------------------------------->
                 
															
					<div class="cb"></div>
				</div>
				
				<div class="separator">&nbsp;</div>
				<div class="cb"></div>
			</div>
	      <span class="footer"><img src="images\footer.png" width="848" height="209" alt="footer" /></span></div>
		
		<div class="credit"><font color="#330000">CmpE 273 Lab Assignement(Fall 2014)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CopyRight - Vikram Arsid</font></div>
		
	</div>
	
</div>		
</body>
</html>