package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import connection.ServiceProxy;
import users.Item;
/**
 * Servlet implementation class home
 */
@WebServlet("/home")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy=new ServiceProxy();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public home() {
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
		//connection.ServiceProxy proxy = new connection.ServiceProxy();
		response.setContentType("text/html");
		System.out.println("Insidepost");
		try {
			HttpSession session = request.getSession(true);
			proxy.setEndpoint("http://localhost:8080/Foodie/services/Service");
			
			Item[] rdata = proxy.displayItem("restaurants");
			Item[] fdata = proxy.displayItem("food");
			Item[] cdata = proxy.displayItem("rotd");
			//System.out.println(rdata);
			//System.out.println(fdata);
			//System.out.println(cdata);
			if (rdata == null || fdata == null || cdata == null ) {
				if (session != null) {
					session.invalidate();
					
					response.sendRedirect("signup.jsp?isValid=No");
				}
			}

			else {
				
				session.setAttribute("disp", rdata);
				session.setAttribute("food", fdata);
				session.setAttribute("rotd", cdata);
				RequestDispatcher reqDispatcher = request.getRequestDispatcher("home.jsp");
				reqDispatcher.forward(request, response);
			}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
