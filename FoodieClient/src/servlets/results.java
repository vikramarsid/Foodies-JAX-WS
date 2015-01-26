package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import users.Search;
import connection.ServiceProxy;

/**
 * Servlet implementation class results
 */
@WebServlet("/results")
public class results extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy=new ServiceProxy();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public results() {
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
				//System.out.println("Insidepost");
				try {
					HttpSession session = request.getSession(true);
					proxy.setEndpoint("http://localhost:8080/Foodie/services/Service");
					String find = request.getParameter("find");
					String near = request.getParameter("near");
					Search[] rdata = proxy.searchstring(find,near);
					
					System.out.println(rdata);
					//System.out.println(fdata);
					//System.out.println(cdata);
					if (rdata == null) {
						if (session != null) {
							session.invalidate();
							
							response.sendRedirect("home.jsp?isValid=No");
						}
					}

					else {
						//System.out.println(rdata);
						session.setAttribute("search", rdata);
						System.out.println(rdata[1].getSearchName());
						
						RequestDispatcher reqDispatcher = request.getRequestDispatcher("results.jsp");
						reqDispatcher.forward(request, response);
					}
				
				}catch (Exception e) {
					e.printStackTrace();
				}
			}

}
