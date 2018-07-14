package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.tomcat.dbcp.dbcp.DbcpException;

import bean.InformationBean;

public class InfoTableDao {
	DBConnection con = new DBConnection();
	// InformationBean bean = new InformationBean();
	private PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	private ResultSet rs = null;// 创建一个结果集对象

	public InfoTableDao() {
		// TODO Auto-generated constructor stub
	}

	// 向数据info表插入一条记录
	public boolean insertInfoTable(InformationBean bean) {
		try {
			Connection conn = con.getConnection();
			String sql = "insert into  BOOK values (?,?,?,?,?)";
			pre = conn.prepareStatement(sql);
			pre.setInt(1, bean.getInfo_id());
			pre.setString(2, bean.getInfo_author());
			pre.setString(3, bean.getInfo_content());
			pre.setDate(4, bean.getInfo_datetime());
			pre.setString(5, bean.getInfo_title());

			if (pre.executeUpdate() == 1) {// update, delete, insert, 使用 executeUpdate()
				System.out.println("adddate successful!");
				if (pre != null)
					pre.close();
				con.freeConnection();
				return true;
			} else {
				System.out.println("adddate fail!");
				return false;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;

	}

	// 取出数据库info表里面的所有记录
	public ArrayList<InformationBean> getInfoTable() {

		try {
			// 获取数据库连接
			Connection conn = con.getConnection();
			// 构造查询Sql语句
			String sql = "select * from BOOK";
			pre = conn.prepareStatement(sql);
			// 执行Sql语句获取结果集
			rs = pre.executeQuery();
			// 遍历结果集，将结果集封装成Java的ArrayList对象
			ArrayList<InformationBean> list = new ArrayList<InformationBean>();
			while (rs.next()) {

				InformationBean bean = new InformationBean();
				bean.setInfo_id(rs.getInt(1));
				bean.setInfo_author(rs.getString(2));
				bean.setInfo_content(rs.getString(3));
				bean.setInfo_datetime(rs.getDate(4));
				bean.setInfo_title(rs.getString(5));
				list.add(bean);

			}
			return list;
		} catch (Exception e) {
			return null;
		} finally {
			// 关闭数据库连接
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			con.freeConnection();
			// 返回结果集
		}
	}
}
