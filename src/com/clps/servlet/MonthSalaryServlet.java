package com.clps.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clps.service.monthSalaryService;

/**
 * Servlet implementation class MonthSalary
 */
@WebServlet("/MonthSalary")
public class MonthSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MonthSalaryServlet() {
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
		double quitdays = Integer.parseInt(request.getParameter("quitdays"));
		double overtime = Integer.parseInt(request.getParameter("overtime"));
		int id = (int) request.getSession().getAttribute("id");
		monthSalaryService mss = new monthSalaryService();
		List list = mss.getmonthSalary(quitdays, overtime, id);
		request.setAttribute("list", list);
		request.getRequestDispatcher("/jspf/showList.jsp").forward(request, response);
		
	}

}
