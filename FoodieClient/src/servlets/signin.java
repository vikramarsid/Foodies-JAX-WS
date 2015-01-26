package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
//import java.io.PrintWriter;

import connection.ServiceProxy;
import users.User;


/**
 * Servlet implementation class onSignUp
 */
@WebServlet("/signin")
public class signin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy=new ServiceProxy();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		//PrintWriter out = response.getWriter();
		connection.ServiceProxy proxy = new connection.ServiceProxy();
		response.setContentType("text/html");

		try {
			HttpSession session = request.getSession(true);

			String email = request.getParameter("Username"); 
			String password = request.getParameter("Password");
			proxy.setEndpoint("http://localhost:8080/Foodie/services/Service");
			
			if( email.equals("admin")){
				
				response.sendRedirect("adminhome.jsp");
				
			}
			else {
			User person = proxy.signin(email, password);
			
			if (person == null) {
				if (session != null) {
					session.invalidate();
					
					response.sendRedirect("signin.jsp?isValid=No");
				}
			}

			else {
				
				session.setAttribute("personDetails", person);
				
				System.out.println("type is " + person.getLastLogin());
				RequestDispatcher reqDispatcher = request.getRequestDispatcher("member.jsp");
				reqDispatcher.forward(request, response);
			}
		
		}
			}catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
