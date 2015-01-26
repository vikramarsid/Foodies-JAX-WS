package servlets;


//import java.io.PrintWriter;
//import java.util.Date;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.ServiceProxy;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import users.User;
/**
 * Servlet implementation class Signup
 */
@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 ServiceProxy proxy=new ServiceProxy();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcomes");
		//PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String qdone ;
		
		try {
			
				
			int userid = (int)(1000 * Math.random());
			String emailId = request.getParameter("email"); // Email.
			String password = request.getParameter("password"); // password.
			String firstName  = request.getParameter("firstname"); // First Name.
			String lastName = request.getParameter("lastname"); // Last Name
			String date = request.getParameter("day"); // date
			String month = request.getParameter("month"); // month
			String year = request.getParameter("year"); // year
			//String city = request.getParameter("city"); // City
			String gender = request.getParameter("gender"); // gender
			
			String dob = month + "-" + date + "-" + year;				
			proxy.setEndpoint("http://localhost:8080/Foodie/services/Service");
					
			
			qdone = proxy.signUp(userid,firstName,lastName,emailId,password,dob,gender);
		HttpSession session = request.getSession();
			//System.out.println(qdone);
			RequestDispatcher reqDispatcher;
			if (qdone.equals("true")) {
				User person = proxy.signin(emailId,password);
				if (person == null) {
					if (session != null) {
						session.invalidate();
						
						response.sendRedirect("signup.jsp?isValid=No");
					}
				}

				else {
				session.setAttribute("personDetails", person);
				//request.setAttribute("email",emailId);
				//request.setAttribute("password",password);
				//getServletContext().getRequestDispatcher("/onsignup.jsp").forward(request, response);
				reqDispatcher = request.getRequestDispatcher("onsignup.jsp?flag=1");
				reqDispatcher.forward(request, response);
				}
				
			} else {
				reqDispatcher = request.getRequestDispatcher("signup.jsp?flag=yes");
				reqDispatcher.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
