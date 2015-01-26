package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
//import javax.servlet.http.HttpSession;
import connection.ServiceProxy;

/**
 * Servlet implementation class writereview
 */
@WebServlet("/writereview")
public class writereview extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy=new ServiceProxy();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public writereview() {
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
					
					int id = (int)(10000 * Math.random());					
					String subject = request.getParameter("subject"); 
					String category = request.getParameter("category"); 
					String locations  = request.getParameter("locations"); 
					String city = request.getParameter("city"); 
					String rating = request.getParameter("Rating"); 
					String review = request.getParameter("review"); 
					//String email = request.getParameter("email"); 
							
					proxy.setEndpoint("http://localhost:8080/Foodie/services/Service");
					
					qdone = proxy.insertFormData(category,id,subject,locations,review,rating,city);
					
					//HttpSession session = request.getSession();
					System.out.println(qdone);
					RequestDispatcher reqDispatcher;
					if (qdone.equals("true")) {
						reqDispatcher = request.getRequestDispatcher("submitreview.jsp?flag=1");
						reqDispatcher.forward(request, response);
						}
						
					 else {
						reqDispatcher = request.getRequestDispatcher("writereview.jsp?flag=yes");
						reqDispatcher.forward(request, response);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			}

		}

