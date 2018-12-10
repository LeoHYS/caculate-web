package com.clps.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.clps.entity.EmployeeInfo;
import com.clps.service.LoginService;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(LoginServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
			try {
				LoginService logService = new LoginService();
				EmployeeInfo eInfo = logService.vaildate(username,password);
				int id = eInfo.getId();
				request.getSession().setAttribute("id", id);
				logger.info("登录成功！");
				request.getRequestDispatcher("/jspf/index.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO: handle exception
				logger.error("查询错误！");
				request.getRequestDispatcher("/jspf/login.jsp").forward(request, response);
			}

		}

}

