package dao;

import java.sql.*;
import java.util.Properties;
import java.sql.Connection;


public class DBConnection {
	//数据库参数
	private String DBName="thin:@127.0.0.1:1521:orcl";
	private String DBuser="Serin";
	private String DBpsw="3510503";
	private Connection con = null;

	public DBConnection() {
		// TODO Auto-generated constructor stub
	}

	// 数据库连接
	public Connection getConnection() {
		try {
			System.out.println("创建数据库连接...");
			Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
			String url = "jdbc:oracle:" + DBName ;// 127.0.0.1是本机地址，ORCL 是Oracle的数据库名字
			Properties po = new Properties();
			po.put("user", DBuser);
			po.put("password", DBpsw);
			con = DriverManager.getConnection(url, po);// 获取连接
			System.out.println("数据库连接成功！");
			return con;
		} catch (Exception e) {
			System.out.println("数据连接失败！");
			e.printStackTrace();
		}
		return null;
	}

	// 释放连接
	public boolean freeConnection() {
		try {
			// 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
			if (con != null)
				con.close();
			System.out.println("数据库连接已关闭！");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
