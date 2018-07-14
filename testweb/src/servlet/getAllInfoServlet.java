package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.InformationBean;
import dao.InfoTableDao;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * Servlet implementation class getAllInfoServlet
 */
@WebServlet("/getAllInfoServlet")
public class getAllInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //创建数据库操作类
	InfoTableDao dao = new InfoTableDao();
	//查询数据库从数据库获取信息
    ArrayList<InformationBean> list = dao.getInfoTable();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    
    public getAllInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置请求和相应编码格式
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//调用doPost方法
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.setContentType("text/html;charset=UTF-8");
		//创建数据库操作类
		InfoTableDao dao = new InfoTableDao();
		//查询数据库从数据库获取信息
		ArrayList<InformationBean> list = dao.getInfoTable();
		request.setAttribute("infolist", list);
		request.getRequestDispatcher("show.jsp").forward(request, response);
			
	}
	

}
