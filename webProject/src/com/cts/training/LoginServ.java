package com.cts.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		
		HttpSession session =  request.getSession();
		session.setAttribute("uname", uname.toUpperCase());
		session.setAttribute("pwd", pwd.concat("Check"));
		
		
		/*request.setAttribute("uname", uname.toUpperCase());
		request.setAttribute("pwd", pwd.concat("Check"));*/
		//PrintWriter pw=response.getWriter();
		
		/*if(uname.equals("admin")&& pwd.equals("admin123"))
		{
		pw.write("<h1>CONGRATULATIONS</h1>");
		pw.write("<h1>logged In</h1>");
		}
		else {
			pw.write("Invaild Login");
		}
	}*/
		if(uname.equals("admin")&& pwd.equals("admin123"))
		{
			this.getServletContext().getRequestDispatcher("/FirstJsp.jsp").forward(request,response);
		}
		else {
			this.getServletContext().getRequestDispatcher("/error.html").forward(request, response);
		}
	}
}
