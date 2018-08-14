package objects;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
/**
 * Servlet implementation class SimpleServlet
 */
public class purchasingService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public purchasingService() {
        super();
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Display list of books
        Map<Book, Integer> stock = Inventory.getStock();
        request.setAttribute("stock", stock);
        request.getRequestDispatcher("view.jsp").forward(request, response);
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		String userName = request.getParameter("userName");
//		String passWord = request.getParameter("passWord");
//        String initUserName = getServletConfig().getInitParameter("userNameI");
//        String initPassWord = getServletConfig().getInitParameter("passWordI");
//		if (initUserName.equals(userName) && initPassWord.equals(passWord)) {
//			System.out.println("Hello from POST: Your username is: " + userName + ", Your password is: " + passWord);
//			response.sendRedirect("success.jsp");
//		} else {
//			System.out.println("Error: not the initial values");
//		}
//		doGet(request, response);
	}
   
}
