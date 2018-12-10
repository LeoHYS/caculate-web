package com.clps.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.clps.entity.EmployeeInfo;
import com.clps.service.RegisterService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(RegisterServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String location = request.getParameter("location");
		double mbSalary = Double.parseDouble(request.getParameter("mbsalary"));
		double overtimeMoney = Double.parseDouble(request.getParameter("overtimeMoney"));
		
		EmployeeInfo eInfo = new EmployeeInfo();
		eInfo.setLocation(location);
		eInfo.setmBSalary(mbSalary);
		eInfo.setName(username);
		eInfo.setOvertimemoney(overtimeMoney);
		eInfo.setPassword(password);
		eInfo.setSex(sex);
		
		PrintWriter out = response.getWriter();
		RegisterService rService  = new RegisterService();
		boolean flag = rService.insertInfo(eInfo);
		if (flag) {
			out.println("<script>");
			out.println("alert('注册成功!');");
			out.println("</script>");
			request.getRequestDispatcher("/jspf/login.jsp").forward(request, response);;
			logger.info("注册成功!");
		}else {
			out.println("<script>");
			out.println("alert('注册失败!');");
			out.println("</script>");
			request.getRequestDispatcher("/jspf/register.jsp").forward(request, response);;
			logger.error("注册失败!");
		}
		
	}

}
