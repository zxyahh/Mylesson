package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.buf.Utf8Decoder;
import org.eclipse.jdt.internal.compiler.batch.Main;

import bean.UserBean;
import dao.UserDao;

/**
 * Servlet implementation class serLoginServlet
 */
@WebServlet("/serLoginServlet")
public class UerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UerLoginServlet() {
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
		//设置字符集，处理中文乱码问题
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//从jsp页面获取用户输入信息
		String name ="";
		if(null != request.getParameter("name")&&!request.getParameter("name").equals("")){
			name=request.getParameter("name");
					
		}
		String psw = "";
		if(null !=request.getParameter("psw")&&!request.getParameter("psw").equals("")) {
			psw=request.getParameter("psw");
		}		
		//访问数据库查询数据库中是否有与用户重名的用户
		UserDao dao = new UserDao();
		UserBean bean = null;
		if(!name.equals("")&&!psw.equals("")) {
			//数据库查询
			bean = dao.GetUserByName(name);
			if(null!=bean) {
				if(bean.getUser_psw()==psw){
					//登陆成功，向session写入相应信息
					HttpSession session = request.getSession();
					session.setAttribute("userinfo", bean);
					//跳转到登陆成功页面，重定向
					response.sendRedirect("main.jsp");
					//第二种跳转方式传参数
					//request.getRequestDispatcher("main").forward(arg0, arg1);
				}
				else {
					//用户输入的用户信息和数据库不一致，跳转到错误界面
					String msg = "用户密码不正确";
					response.sendRedirect("error.jsp?errMsg=" +msg);
				}
			}
			else {
				//数据库中查不到用户
				String msg = "用户不存在！";
			}
		}else {
			//查询不到用户输入的信息
		}
		//如果数据库存在与用户名重名的用户则比较密码是否一致 
		//如果一致则登陆成功，向session中写入相应信息
		//如果登陆失败，跳转到错误提示页面
		doGet(request, response);
	}

}
