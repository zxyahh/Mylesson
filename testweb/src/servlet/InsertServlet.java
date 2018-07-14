package servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.InformationBean;
import dao.InfoTableDao;

/**
 * Servlet implementation class insertServlet
 */
@WebServlet("/insertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		Date create_date = new Date((new java.util.Date()).getTime());//修改过
		String author = request.getParameter("author");
		
		// 声明数据库操作类对象
		InfoTableDao dao = new InfoTableDao();
		// 封装数据
		InformationBean bean = new InformationBean();
		bean.setInfo_title(title);
		bean.setInfo_content(content);
		bean.setInfo_datetime(create_date);
		bean.setInfo_author(author);

		// 数据库插入
		boolean do_insert = dao.insertInfoTable(bean);
		// 进行页面跳转
		if (do_insert) {
			// 跳转到信息展示界面
			response.sendRedirect("getAllInfoServlet");
		} else {
			// 跳转到错误信息界面
		}
		// System.out.println(content);
		doGet(request, response);

	}

}
