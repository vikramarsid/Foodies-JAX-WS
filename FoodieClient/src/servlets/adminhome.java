package servlets;

import java.io.IOException;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

//import users.Item;
import connection.ServiceProxy;

/**
 * Servlet implementation class adminhome
 */
@WebServlet("/adminhome")
public class adminhome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy=new ServiceProxy();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminhome() {
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
		response.setContentType("text/html");
		proxy.setEndpoint("http://localhost:8080/Foodie/services/Service");
		//HttpSession session = request.getSession(false);

		try {
			String catcreate = request.getParameter("create");
			String newupdate = request.getParameter("newupdate");
			String oldupdate = request.getParameter("updatelist");
			String catdelete = request.getParameter("delupdatelist");
			System.out.println(catcreate);
			System.out.println(newupdate);
			System.out.println(oldupdate);
			System.out.println(catdelete);
			if (catcreate != null && !catcreate.isEmpty())
			{
			boolean res = proxy.createCategory(catcreate);
			System.out.println(res);
			request.setAttribute("status", "Category Successfully Created");
	        request.getRequestDispatcher("/View/dbresult.jsp").forward(request, response);
			}
			
			if ((oldupdate != null && !oldupdate.isEmpty()) && (newupdate != null && !newupdate.isEmpty()))
			{
			boolean res = proxy.updateCategory(oldupdate,newupdate);
			System.out.println(res);
			request.setAttribute("status", "Category Successfully Updated");
	        request.getRequestDispatcher("/View/dbresult.jsp").forward(request, response);
			}
			
			if (catdelete != null && !catdelete.isEmpty())
			{
			boolean res = proxy.deleteCategory(catdelete);
			System.out.println(res);
			request.setAttribute("status", "Category Successfully Deleted");
	        request.getRequestDispatcher("/View/dbresult.jsp").forward(request, response);
			}
		

		}
		catch (Exception e) {
		e.printStackTrace();}

	
	}



}
